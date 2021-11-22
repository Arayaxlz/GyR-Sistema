USE BD_Sistema

------------------------------------------------------------------------------------------------------------------------
-- Trigger o Disparador para que despues de que se haga una insercion en la tabla de empleado se ejecute
-- Este ejecuta el procedimiento ingresar_usuario con valores ya declarados
GO
CREATE TRIGGER TR_EMPLEADO_AFTER ON empleado
AFTER INSERT
AS 
	DECLARE @cod_empleado SMALLINT
	DECLARE @user VARCHAR(50)
	DECLARE @nombre VARCHAR(50)
	SET @nombre = (SELECT nombre_empleado FROM inserted)
	SET @cod_empleado = (SELECT cod_empleado FROM inserted)
	SET @user = CONCAT(@nombre, @cod_empleado)
BEGIN	
	EXEC ingresar_usuario @user, '1234', @cod_empleado
END
DROP TRIGGER TR_EMPLEADO_AFTER

------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para ingresar los registros en la tabla de empleado
GO
CREATE PROCEDURE insertar_empleados 
	@nombre_empleado VARCHAR(50), @appelido1_empleado VARCHAR(50), @appelido2_empleado VARCHAR(50), @cod_rol SMALLINT,
	@cod_color VARCHAR(7)
AS 
BEGIN
	INSERT INTO empleado VALUES(@nombre_empleado, @appelido1_empleado, @appelido2_empleado, @cod_rol, @cod_color)
END

------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para guardar los usuarios en la tabla userEmpleado
GO
CREATE PROCEDURE insertar_usuario
	@usuario VARCHAR(50), @contrase�a VARCHAR(MAX), @cod_empleado SMALLINT
AS BEGIN
	INSERT INTO userEmpleado VALUES(@usuario, ENCRYPTBYPASSPHRASE('password', @contrase�a), @cod_empleado)
END

------------------------------------------------------------------------------------------------------------------------
-- Procedimiento que recibe valores para comprobar el inicio de sesi�n, este al final retorna un booleano que indica si es verdadero o falso
GO
CREATE PROCEDURE loguear_user 
	@usuario VARCHAR(50), @contrase�a VARCHAR(50), @result BIT OUTPUT
AS
	DECLARE @PassEncode VARCHAR(300)
	DECLARE @PassDecode VARCHAR(50)
BEGIN
	SET @PassEncode = (SELECT contrase�a FROM userEmpleado WHERE usuario = @usuario)
	Set @PassDecode = DECRYPTBYPASSPHRASE('password', @PassEncode)
END
BEGIN
	IF @PassDecode = @contrase�a
		SET @result = 1
	ELSE
		SET @result = 0
	RETURN @result
END

------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para reestablecer la contrase�a, ya que por defecto se le asigna una b�sica
GO
CREATE PROCEDURE actualizar_contrase�a 
	@contrase�a VARCHAR(50), @usuario VARCHAR(50)
AS BEGIN
	UPDATE userEmpleado SET contrase�a = ENCRYPTBYPASSPHRASE('password', @contrase�a) WHERE usuario = @usuario
END

------------------------------------------------------------------------------------------------------------------------
-- Procedimiento que muestra los registros que tienen que ver con el empleado
GO
CREATE PROCEDURE mostrar_empleados
AS BEGIN
	SELECT empleado.cod_empleado, usuario,CONCAT(nombre_empleado, ' ', appelido1_empleado, ' ', appelido2_empleado) AS 'Nombre de empleado',
	cod_rol AS 'Nivel'
	FROM empleado INNER JOIN userEmpleado ON empleado.cod_empleado = userEmpleado.cod_empleado
	ORDER BY cod_Empleado
END

------------------------------------------------------------------------------------------------------------------------
