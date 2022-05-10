CREATE DATABASE mantenimiento;

use mantenimiento;

create table area(
	id int not null auto_increment,
	nombre varchar(100) not NULL,
	status char(1)
);

create table cargo(
	id int not null auto_increment,
	nombre varchar(100) not null,
	status char(1)
);

create table empleado(
	id int not null auto_increment,
	nombre varchar(100),
	apellido varchar(100),
	edad int,
	fecha_ingreso datetime,
	id_area int,
	id_cargo int,
	casillero int,
	CONSTRAINT fk_empleadoarea FOREIGN KEY (id_area) REFERENCES area(id),
	CONSTRAINT fk_empleadocargo FOREIGN KEY (id_cargo) REFERENCES cargo(id)
);

create table usuarios(
	id int not null auto_increment,
	usuario varchar(60) not null,
	password varchar(60) not null,
	id_empleado int,
	CONSTRAINT fk_usuarioempleado FOREIGN KEY (id_empleado) REFERENCES empleado(id)
);