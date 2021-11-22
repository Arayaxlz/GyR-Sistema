USE BD_Sistema

------------------------------------------------------------------------------------------------------------------------

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
	EXEC ingresar_usuario @user, @nombre, @cod_empleado
END
DROP TRIGGER TR_EMPLEADO_AFTER

------------------------------------------------------------------------------------------------------------------------

GO
CREATE PROCEDURE insertar_empleados 
	@nombre_empleado VARCHAR(50), @appelido1_empleado VARCHAR(50), @appelido2_empleado VARCHAR(50), @cod_rol SMALLINT,
	@cod_color VARCHAR(7)
AS 
BEGIN
	INSERT INTO empleado VALUES(@nombre_empleado, @appelido1_empleado, @appelido2_empleado, @cod_rol, @cod_color)
END

------------------------------------------------------------------------------------------------------------------------

GO
CREATE PROCEDURE insertar_usuario
	@usuario VARCHAR(50), @contraseņa VARCHAR(MAX), @cod_empleado SMALLINT
AS BEGIN
	INSERT INTO userEmpleado VALUES(@usuario, ENCRYPTBYPASSPHRASE('password', @contraseņa), @cod_empleado)
END

------------------------------------------------------------------------------------------------------------------------

GO
CREATE PROCEDURE loguear_user 
	@usuario VARCHAR(50), @contraseņa VARCHAR(50), @result BIT OUTPUT
AS
	DECLARE @PassEncode VARCHAR(300)
	DECLARE @PassDecode VARCHAR(50)
BEGIN
	SET @PassEncode = (SELECT contraseņa FROM userEmpleado WHERE usuario = @usuario)
	Set @PassDecode = DECRYPTBYPASSPHRASE('password', @PassEncode)
END
BEGIN
	IF @PassDecode = @contraseņa
		SET @result = 1
	ELSE
		SET @result = 0
	PRINT @PassEncode
	Print @PassDecode
	RETURN @result
END

------------------------------------------------------------------------------------------------------------------------

GO
CREATE PROCEDURE actualizar_contraseņa 
	@contraseņa VARCHAR(50), @usuario VARCHAR(50)
AS BEGIN
	UPDATE userEmpleado SET contraseņa = ENCRYPTBYPASSPHRASE('password', @contraseņa) WHERE usuario = @usuario
END

------------------------------------------------------------------------------------------------------------------------

GO
CREATE PROCEDURE mostrar_empleados
AS BEGIN
	SELECT empleado.cod_empleado, usuario,CONCAT(nombre_empleado, ' ', appelido1_empleado, ' ', appelido2_empleado) AS 'Nombre de empleado',
	cod_rol AS 'Nivel'
	FROM empleado INNER JOIN userEmpleado ON empleado.cod_empleado = userEmpleado.cod_empleado
	ORDER BY cod_Empleado
END

------------------------------------------------------------------------------------------------------------------------
