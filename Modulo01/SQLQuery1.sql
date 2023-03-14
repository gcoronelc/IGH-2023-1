

create table producto(
id int ,
nombre varchar(100),
precio numeric(10,2),
stock int 
);
go

insert into producto values(1,'abc',456.78,100);
go

select * from producto;
go

insert into producto values(2,'xyz',456.78,-100);
go

delete from producto where id=2;
go

alter table producto
add constraint chk_producto_stock
check(stock>=0);
go





