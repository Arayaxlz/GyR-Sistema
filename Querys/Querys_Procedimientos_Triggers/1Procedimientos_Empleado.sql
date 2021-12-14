USE BD_Sistema

------------------------------------------------------------------------------------------------------------------------
-- Trigger o Disparador para que despues de que se haga una insercion en la tabla de empleado se ejecute
-- Este ejecuta el procedimiento ingresar_usuario con valores ya declarados
GO
CREATE TRIGGER TR_EMPLEADO_AFTER ON empleado
AFTER INSERT
AS 
	DECLARE @apellido VARCHAR(50)
	DECLARE @user VARCHAR(50)
	DECLARE @nombre VARCHAR(50)
	DECLARE @cod_empleado SMALLINT
	SET @cod_empleado = (SELECT cod_empleado FROM inserted)
	SET @nombre = (SELECT nombre_empleado FROM inserted)
	SET @apellido = (SELECT apellido1_empleado FROM inserted)
	SET @user = CONCAT(@nombre, SUBSTRING(@apellido, 0, 2))
BEGIN	
	EXEC ingresar_usuario @user, '1234', @cod_empleado
END

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
CREATE PROCEDURE ingresar_usuario
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
	SET @PassDecode = DECRYPTBYPASSPHRASE('password', @PassEncode)
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
	SELECT empleado.cod_empleado AS 'C�digo del empleado', usuario AS 'Nombre de Usuario',
	CONCAT(nombre_empleado, ' ', apellido1_empleado, ' ', apellido2_empleado) AS 'Nombre de empleado',
	nombre_rol AS 'Nivel'
	FROM ((empleado INNER JOIN userEmpleado ON empleado.cod_empleado = userEmpleado.cod_empleado)
	INNER JOIN roles ON roles.cod_rol = empleado.cod_rol)
	ORDER BY empleado.cod_Empleado
END

------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para eliminar un empleado
GO
CREATE PROCEDURE borrar_empleado 
	@cod_empleado SMALLINT
AS BEGIN
	DELETE userEmpleado WHERE cod_empleado = @cod_empleado
	DELETE empleado WHERE cod_empleado = @cod_empleado
END

------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para actualizar datos de un empleado
GO
CREATE PROCEDURE actualizar_empleado 
	@cod_empleado SMALLINT, @nombre VARCHAR(50), @apellido1 VARCHAR(50), 
	@apellido2 VARCHAR(50), @cod_rol SMALLINT, @cod_color VARCHAR(7)
AS
	DECLARE @user VARCHAR(50)
	SET @user = CONCAT(@nombre, SUBSTRING(@apellido1, 0, 2))
BEGIN
	UPDATE empleado SET nombre_empleado = @nombre, apellido1_empleado = @apellido1, apellido2_empleado = @apellido2,
	cod_rol = @cod_rol, cod_color = @cod_color WHERE cod_empleado = @cod_empleado
	UPDATE userEmpleado SET usuario = @user WHERE cod_empleado = @cod_empleado
END

------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para obtener datos de un empleado
GO
CREATE PROC buscar_empleado
	@usuario VARCHAR(50)
AS BEGIN
	SELECT empleado.cod_empleado, empleado.cod_color,
	CONCAT(nombre_empleado, ' ', apellido1_empleado, ' ', apellido2_empleado),
	nombre_rol
	FROM ((empleado INNER JOIN userEmpleado ON empleado.cod_empleado = userEmpleado.cod_empleado)
	INNER JOIN roles ON roles.cod_rol = empleado.cod_rol)
	WHERE usuario = @usuario
END
------------------------------------------------------------------------------------------------------------------------