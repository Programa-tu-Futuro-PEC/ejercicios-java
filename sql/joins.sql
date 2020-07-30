use cine

-- cantidad de personajes por actor
select a_nombre, count (*) as c
from personaje
group by a_nombre
order by c desc

-- peliculas por década
select año-(año%10) as decada, COUNT(*)
from pelicula
group by año-(año%10)
order by año-(año%10) desc

-- personajes interpretados por dos o mas actores distintos
select personaje, p_nombre, count(distinct a_nombre) as actores
from personaje
where p_año >= 1990
group by personaje, p_nombre, p_año 
having COUNT(distinct a_nombre) >= 2
order by actores desc

-- peliculas de Edward Norton en las que no aparece Brad Pitt
select p_nombre, p_año
from personaje
where a_nombre = 'Norton, Edward (I)'
union
select p_nombre, p_año
from personaje
where a_nombre = 'Pitt, Brad'

select nombre
from actor
where nombre like '%Norton%'

select p1.a_nombre, p2.a_nombre
from personaje p1, personaje p2
where p1.p_año = p2.p_año
and p1.p_nombre = p2.p_nombre
and p1.a_nombre < p2.a_nombre

-- A, B
-- B, A <> = !=
--
-- Peliculas de uma thurman sin samuel jackson
select p_nombre, p_año
from personaje
where a_nombre = 'Thurman, Uma'
except
select p_nombre, p_año
from personaje
where a_nombre = 'Jackson, Samuel L.'

-- cantidad de actrices por cada película del 2008
select p_nombre, p_año, COUNT(DISTINCT a_nombre) as actrices
from personaje, actor
where p_año = 2008
and actor.genero = 'F'
and actor.nombre = personaje.a_nombre
group by p_nombre, p_año
order by actrices desc

-- personajes x actriz, de pelis del 2010 en adelante, 
-- solo 2 o más personajes
select a_nombre, count(distinct personaje) as personajes
from personaje, actor
where p_año >= 2010
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

-- Los años en los que todas las peliculas tuvieron un rating superior
-- a 8 y la calificación promedio de ese año. 
-- Los resultados deben ordenarse de forma descendiente respecto a 
-- la calificacion promedio.
select año
from pelicula
except
select año
from pelicula
where calificacion <= 8

select año, AVG(calificacion) as promedio
from pelicula
group by año
having MIN(calificacion) > 8
order by promedio desc