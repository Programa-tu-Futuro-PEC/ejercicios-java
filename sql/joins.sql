use cine

-- cantidad de personajes por actor
select a_nombre, count (*) as c
from personaje
group by a_nombre
order by c desc

-- peliculas por d�cada
select a�o-(a�o%10) as decada, COUNT(*)
from pelicula
group by a�o-(a�o%10)
order by a�o-(a�o%10) desc

-- personajes interpretados por dos o mas actores distintos
select personaje, p_nombre, count(distinct a_nombre) as actores
from personaje
where p_a�o >= 1990
group by personaje, p_nombre, p_a�o 
having COUNT(distinct a_nombre) >= 2
order by actores desc

-- peliculas de Edward Norton en las que no aparece Brad Pitt
select p_nombre, p_a�o
from personaje
where a_nombre = 'Norton, Edward (I)'
union
select p_nombre, p_a�o
from personaje
where a_nombre = 'Pitt, Brad'

select nombre
from actor
where nombre like '%Norton%'

select p1.a_nombre, p2.a_nombre
from personaje p1, personaje p2
where p1.p_a�o = p2.p_a�o
and p1.p_nombre = p2.p_nombre
and p1.a_nombre < p2.a_nombre

-- A, B
-- B, A <> = !=
--
-- Peliculas de uma thurman sin samuel jackson
select p_nombre, p_a�o
from personaje
where a_nombre = 'Thurman, Uma'
except
select p_nombre, p_a�o
from personaje
where a_nombre = 'Jackson, Samuel L.'

-- cantidad de actrices por cada pel�cula del 2008
select p_nombre, p_a�o, COUNT(DISTINCT a_nombre) as actrices
from personaje, actor
where p_a�o = 2008
and actor.genero = 'F'
and actor.nombre = personaje.a_nombre
group by p_nombre, p_a�o
order by actrices desc

-- personajes x actriz, de pelis del 2010 en adelante, 
-- solo 2 o m�s personajes
select a_nombre, count(distinct personaje) as personajes
from personaje, actor
where p_a�o >= 2010
and actor.nombre = personaje.a_nombre
and actor.genero = 'M'
group by a_nombre
having count(distinct personaje) >= 2
order by personajes desc

select a_nombre, personaje 
into X
from personaje
where p_nombre='The Dark Knight'

select top 5 * from X

select nombre, X.personaje
from X right join actor
on actor.nombre = X.a_nombre
order by personaje desc

select a_nombre, personaje
from personaje
where p_nombre = 'Star Wars: Episode V - The Empire Strikes Back'
except
select a_nombre, personaje
from personaje
where p_nombre = 'Star Wars: Episode VI - Return of the Jedi'

-- Los a�os en los que todas las peliculas tuvieron un rating superior
-- a 8 y la calificaci�n promedio de ese a�o. 
-- Los resultados deben ordenarse de forma descendiente respecto a 
-- la calificacion promedio.
select a�o
from pelicula
except
select a�o
from pelicula
where calificacion <= 8

select a�o, AVG(calificacion) as promedio
from pelicula
group by a�o
having MIN(calificacion) > 8
order by promedio desc