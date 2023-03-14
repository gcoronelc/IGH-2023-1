/*
Estado:  1: Proceso ok
        -1: Error en el proceso
		-2: Codigo de producto no existe
		-3: El precio no puede ser cero o negativo
		-4: El stock no puede ser negativo
*/

create or replace procedure usp_actualiza_producto(
	p_idprod in producto.idprod%type,
	p_precio in producto.precio%type,
	p_stock in producto.stock%type,
	p_estado out nocopy INTEGER
) as
begin 
	p_estado := 1;
	update producto 
	set precio = p_precio, stock = p_stock
	where idprod = p_idprod;
	commit;
exception
	when others then
		rollback;
		p_estado := -1;
end;
/


-- Activar salidas

set server_output on

-- Prueba ok

declare
  estado number(5);
begin
  usp_actualiza_producto(100, 950, 600, estado);
  dbms_output.put_line( 'estado = ' || estado );
end;
/


-- Prueba con error

declare
  estado number(5);
begin
  usp_actualiza_producto(10, 950, 600, estado);
  dbms_output.put_line( 'estado = ' || estado );
end;
/



