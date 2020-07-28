create database cine
use cine

create table actor(
	nombre varchar(500) primary key,
	genero varchar(1)
);

bulk insert actor
from 'C:\Users\scfer\Documents\Universidad\Docencia\CC3201\2018 Otoño\Lab 3\data\actor.tsv'
with (
	fieldterminator = '\t', 
	rowterminator='\n', 
	tablock)

select top 5 * from actor

create table pelicula(
	nombre varchar(700),
	año integer,
	calificacion float,
	primary key(nombre, año)
);

bulk insert pelicula
from 'C:\Users\scfer\Documents\Universidad\Docencia\CC3201\2018 Otoño\Lab 3\data\pelicula.tsv'
with ( firstrow=1, 
	fieldterminator = '\t', 
	rowterminator='\n', 
	errorfile = 'C:\Users\scfer\Desktop\errors.txt',
	tablock)

select top 5 * from pelicula

create table personaje(
	a_nombre varchar(500),
	p_nombre varchar(700),
	p_año integer,
	personaje varchar(500),
	primary key (p_nombre, p_año, a_nombre, personaje),
	foreign key(a_nombre) references actor(nombre),
	foreign key(p_nombre, p_año) references pelicula(nombre, año)
)

bulk insert personaje
from 'C:\Users\scfer\Documents\Universidad\Docencia\CC3201\2018 Otoño\Lab 3\data\personaje.tsv'
with ( firstrow=1, 
	fieldterminator = '\t', 
	rowterminator='\n',
	tablock)

select top 5 * from personaje
order by a_nombre

alter table personaje add foreign key (a_nombre) references actor(nombre)

-- Los nombres de las películas con calificación mayor a 8.5
select nombre, calificacion
from pelicula
where calificacion > 8.5
order by calificacion desc

-- Las películas de la década de los 90s
select *
from pelicula
where año between 1990 and 1999
order by año

-- Los personajes de películas del año 2000
select a_nombre
from personaje
where p_año=2000

select count(distinct a_nombre)
from personaje
where p_nombre = ''

select sum(calificacion)
from pelicula

select año, avg(calificacion) as promedio
from pelicula
where año >= 1990
group by año
having avg(calificacion)>=8.7
