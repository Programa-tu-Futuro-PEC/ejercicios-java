use cine;

update personaje
set personaje = 'C-3PO', a_nombre = 'Hamill, Mark (I)'
where (p_nombre = 'Star Wars'
or p_nombre='Star Wars: Episode V - The Empire Strikes Back')
and personaje = 'C-3PO'

delete from personaje
where personaje = 'C-3PO'

select * from personaje where personaje LIKE 'peatón'

select * from personaje where a_nombre like '%Hamill%'


select distinct a_nombre
from personaje 
where p_nombre  IN (
	select nombre
	from pelicula
	where calificacion >= 9
)

-- Los nombres de las actrices que participaron 
-- en las 10 películas mejor calificadas
select distinct nombre, p_nombre
from actor, personaje
where actor.nombre = personaje.a_nombre
and actor.genero = 'F'
and p_nombre in (
	select top 10 nombre
	from pelicula
	order by calificacion desc
)

-- Las películas con peor calificación, 
-- en caso de haber empates, entregarlos todos
select nombre, año, calificacion
from pelicula
where calificacion = (
	select min(calificacion)
	from pelicula
)

-- Ordene las películas por el porcentaje de mujeres 
-- que participan en ella
select distinct mujeres_por_pelicula.p_nombre, actrices_totales*100.0/actores_totales as porcentaje
from (
		select p_nombre, count(distinct a_nombre) as actrices_totales
		from personaje, actor
		where actor.nombre = personaje.a_nombre
		and actor.genero = 'F'
		group by p_nombre
	) mujeres_por_pelicula, (
		select p_nombre, count(distinct a_nombre) as actores_totales
		from personaje
		group by p_nombre
	) actores_por_pelicula
where mujeres_por_pelicula.p_nombre = actores_por_pelicula.p_nombre
order by porcentaje desc