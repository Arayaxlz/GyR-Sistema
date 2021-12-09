USE BD_Sistema
-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para guardar registros en adjudicadas
GO
CREATE PROCEDURE insertar_adjudicada
	@institucion VARCHAR(100), @dias_entrega TINYINT, @modalidad_dias BIT, @empresa BIT, 
	@modalidad_entrega VARCHAR(30), @descripcion VARCHAR(100), @estado BIT, 
	@observaciones VARCHAR(100), @cod_contratacion VARCHAR(100)
AS 
	DECLARE @encargado SMALLINT
	SET @encargado = (SELECT cod_empleado FROM responsable WHERE cod_contratacion = @cod_contratacion)

	IF @observaciones = ''
		SET @observaciones = 'Ninguna Observaciones'
	
	IF @descripcion = ''
		SET @descripcion = 'Sin descripci�n'
BEGIN
	INSERT INTO adjudicaciones VALUES(@institucion, @dias_entrega, @modalidad_dias, @empresa, @modalidad_entrega, @descripcion, @estado, 
	@observaciones, @encargado, @cod_contratacion)
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para borrar adjudicaciones
GO
CREATE PROCEDURE borrar_adjudicacion
	@cod_adjudicacion INT
AS BEGIN
	DELETE adjudicaciones WHERE cod_adjudicacion = @cod_adjudicacion
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para actualizar una adjudicaci�n
GO
CREATE PROCEDURE actualizar_adjudicacion
	@cod_adjudicacion INT, @dias_entrega TINYINT, @modalidad_dias BIT, @empresa BIT, 
	@modalidad_entrega VARCHAR(30), @descripcion VARCHAR(100), @estado BIT, 
	@observaciones VARCHAR(100)
AS BEGIN
	UPDATE adjudicaciones SET dias_entrega = @dias_entrega, modalidad_dias = @modalidad_dias,
	empresa = @empresa, descripcion = @descripcion, estado = @estado, observaciones = @observaciones, modalidad_entrega = @modalidad_entrega
	WHERE cod_adjudicacion = @cod_adjudicacion
END 

-------------------------------------------------------------------------------------------------------------------------------------------
-- Procedimiento para mostrar las adjudicaciones	
GO
CREATE PROCEDURE mostrar_adjudicaciones
AS BEGIN
	SELECT cod_adjudicacion AS 'C�digo de adjudicaci�n', cod_contratacion AS 'Contrataci�n', institucion AS 'Institucion', 
	CONCAT(dias_entrega, ' D�as')  AS 'D�as de entrega',
	CAST(CASE WHEN modalidad_dias = 1 THEN 'H�biles' ELSE 'Naturales' END AS VARCHAR(50)) AS 'Modalidad de D�as',
	CAST(CASE WHEN empresa = 1 THEN 'GyR Grupo Asesor' ELSE 'Principal Brands' END AS VARCHAR(50)) AS 'Empresa',
	modalidad_entrega AS 'Modalidad de Entrega', descripcion AS 'Descripcion',
	CAST(CASE WHEN estado = 1 THEN 'En Firme' ELSE 'En Duda' END AS VARCHAR(50)) AS 'Estado',
	observaciones AS 'Observaciones',
	CONCAT(empleado.nombre_Empleado, ' ', empleado.appelido1_Empleado) AS 'Encargado'
	FROM adjudicaciones INNER JOIN empleado ON adjudicaciones.cod_empleado = empleado.cod_empleado
	ORDER BY cod_adjudicacion
END

-------------------------------------------------------------------------------------------------------------------------------------------