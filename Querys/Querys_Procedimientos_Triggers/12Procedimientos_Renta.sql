USE BD_Sistema

-------------------------------------------------------------------------------------------------------------------------------------------
-- Insertar Renta
GO
CREATE PROCEDURE insertar_renta
	@num_factura INT, @descripcion VARCHAR(100), @modalidad VARCHAR(100), @telefono INT, @fecha_renta DATE, @nacionalidad VARCHAR(100),
	@moneda BIT, @subtotal MONEY, @tipo_renta BIT, @cod_contratacion VARCHAR(100), @cod_proveedor INT
AS BEGIN
	INSERT INTO renta VALUES (@num_factura, @descripcion, @modalidad, @telefono, @fecha_renta, @nacionalidad, @moneda, @subtotal, @tipo_renta,
	@cod_contratacion, @cod_proveedor)
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Borrar Renta
GO
CREATE PROC borrar_renta
	@cod_renta INT
AS BEGIN
	DELETE rente WHERE cod_renta = @cod_renta
END

-------------------------------------------------------------------------------------------------------------------------------------------
-- Actualizar Renta
GO
CREATE PROC actualizar_renta
	@cod_renta INT, @num_factura INT, @descripcion VARCHAR(100), @modalidad VARCHAR(100), @telefono INT, @fecha_renta DATE, @nacionalidad VARCHAR(100),
	@moneda BIT, @subtotal MONEY, @tipo_renta BIT, @cod_contratacion VARCHAR(100), @cod_proveedor INT
AS BEGIN
	UPDATE renta SET num_facura = @num_factura, descripcion = @descripcion, modalidad = @modalidad, telefono = @telefono, fecha_renta = @fecha_renta,
	nacionalidad = @nacionalidad, moneda = @moneda, subtotal = @subtotal, tipo_renta = @tipo_renta, cod_contratacion = @cod_contratacion,
	cod_proveedor = @cod_proveedor WHERE cod_renta = @cod_renta
END
-------------------------------------------------------------------------------------------------------------------------------------------
-- Mostrar renta
GO
CREATE PROC mostrar_renta
	@filtro VARCHAR(100)
AS BEGIN
	SELECT cod_renta AS 'C�digo de Renta', cod_contratacion AS 'Contrataci�n', num_facura AS 'N�mero de Factura', 
	descripcion AS 'Descripci�n', modalidad AS 'Modalidad', p.telefono AS 'Tel�fono', CONVERT(VARCHAR, fecha_renta, 100) AS 'Fecha de Renta',
	nacionalidad AS 'Nacionalidad', 
	CAST(
		CASE  
			WHEN moneda = 0 THEN 'Col�n' 
			ELSE 'Dolar' 
		END AS VARCHAR) AS 'Moneda',
	subtotal AS 'Subtotal',
	CAST(
		CASE
			WHEN tipo_renta = 0 THEN 'Gasto'
			ELSE 'Venta'
		END AS VARCHAR) AS 'Tipo de Renta',
	p.proveedor_real AS 'Proveedor Real', p.cedula AS 'C�dula Jur�dica'
	FROM renta INNER JOIN proveedores p ON p.cod_proveedor = renta.cod_proveedor
	ORDER BY
		CASE @filtro
			WHEN 'cod_renta' THEN cod_renta
			WHEN 'num_factura' THEN num_facura
			WHEN 'telefono' THEN p.telefono
		END,

		CASE @filtro
			WHEN 'cod_contratacion' THEN cod_renta
			WHEN 'descripcion' THEN descripcion
			WHEN 'modalidad' THEN modalidad
			WHEN 'fecha_renta' THEN CONVERT(VARCHAR, fecha_renta, 100)
			WHEN 'nacionalidad' THEN nacionalidad
			WHEN 'moneda' THEN CAST(CASE WHEN moneda = 0 THEN 'Col�n' ELSE 'Dolar' END AS VARCHAR)
			WHEN 'tipo_renta' THEN CAST(CASE WHEN tipo_renta = 0 THEN 'Gasto' ELSE 'Venta' END AS VARCHAR)
			WHEN 'cod_proveedor' THEN p.cod_proveedor
		END,

		CASE @filtro
			WHEN 'subtotal' THEN subtotal
		END
END
-------------------------------------------------------------------------------------------------------------------------------------------
