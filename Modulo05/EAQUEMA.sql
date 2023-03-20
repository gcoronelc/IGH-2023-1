
create table producto(
	id numeric(5,0) not null primary key,
	nombre varchar2(100) not null,
	precio numeric(10,2) not null
);

create sequence sq_producto start with 1 increment by 1;

insert into producto values(sq_producto.nextval, 'Refrigeradora', 1890.0);
insert into producto values(sq_producto.nextval, 'Labadora', 1470.0);
insert into producto values(sq_producto.nextval, 'Televisor', 2289.0);
insert into producto values(sq_producto.nextval, 'Laptop', 5682.0);
insert into producto values(sq_producto.nextval, 'Mueble 3-2-1', 1734.0);
commit;

