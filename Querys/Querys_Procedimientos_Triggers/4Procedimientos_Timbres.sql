USE BD_Sistema

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para insertar en la tabla timbres
GO
CREATE PROCEDURE insertar_timbre
	@institucion VARCHAR(100), @monto MONEY, @estado VARCHAR(30), @producto VARCHAR(100), @observaciones VARCHAR(100),
	@encargado_envio SMALLINT, @cod_contratacion VARCHAR(50)
AS 
	DECLARE @encargado_contr SMALLINT
	SET @encargado_contr = (SELECT cod_empleado FROM responsable WHERE cod_contratacion = @cod_contratacion)

	IF @estado = '' 
		SET @estado = 'Pendiente'

	IF @observaciones = ''
		SET @observaciones = 'Ninguna observaci�n'

BEGIN
	INSERT INTO timbres VALUES (@institucion, @monto, @estado, @producto, @observaciones, @encargado_envio, @encargado_contr, @cod_contratacion)
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para borrar un registro en timbres
GO
CREATE PROCEDURE borrar_timbre 
	@cod_timbre INT
AS BEGIN
	DELETE timbres WHERE cod_timbre = @cod_timbre
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para actualizar registros en un timbre
GO
CREATE PROCEDURE actualizar_timbre
	@cod_timbre INT, @institucion VARCHAR(100), @monto MONEY, @estado VARCHAR(30), @producto VARCHAR(100), @observaciones VARCHAR(100),
	@encargado_envio SMALLINT
AS BEGIN
	UPDATE timbre SET institucion = @institucion, monto = @monto, estado = @estado, producto = @producto, observaciones = @observaciones,
	encargado_envio = @encargado_envio
	WHERE cod_timbre = @cod_timbre
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para mostrar todos los timbres guardados
GO
CREATE PROCEDURE mostrar_timbres
	@filtro VARCHAR(100)
AS BEGIN
	SELECT cod_timbre AS 'C�digo de timbre', cod_contratacion AS 'Contrataci�n', institucion AS 'Instituci�n', monto AS 'Monto', estado AS 'Estado',
	producto AS 'Producto', observaciones AS 'Observaciones',
	CONCAT(EMP1.nombre_Empleado, ' ', EMP1.appelido1_Empleado) AS 'Encargado de Envio',
	CONCAT(EMP2.nombre_Empleado, ' ', EMP2.appelido1_Empleado) AS 'Encargado de Contratacion',
	EMP2.cod_color AS 'Color del Empleado'
	FROM (timbres INNER JOIN empleado EMP1 ON timbres.encargado_envio = EMP1.cod_empleado)
	INNER JOIN empleado EMP2 ON EMP2.cod_empleado = timbres.cod_empleado
	ORDER BY
	
		CASE @filtro
			WHEN 'cod_timbre' THEN cod_timbre
		END,

		CASE @filtro
			WHEN 'cod_contratacion' THEN cod_contratacion
			WHEN 'instituci�n' THEN institucion
			WHEN 'producto' THEN producto
			WHEN 'estado' THEN estado
			WHEN 'observaciones' THEN observaciones
		END,

		CASE @filtro
			WHEN 'monto' THEN monto
		END,

		CASE @filtro
			WHEN 'encargado_envio' 
				THEN CONCAT(EMP1.nombre_Empleado, ' ', EMP1.appelido1_Empleado)
			WHEN 'cod_empleado' 
				THEN CONCAT(EMP2.nombre_Empleado, ' ', EMP2.appelido1_Empleado)
		END
END

-------------------------------------------------------------------------------------------------------------------------------------------