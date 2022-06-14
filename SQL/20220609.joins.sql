/*select * 
FROM tablaA a
inner join tableB b 
on a.key= b.key;*/

select * 
FROM alumnos a
inner join grupos g 
on a.grupo_id = g.id;

SELECT a.id, a.nombre AS 'alumno', g.nombre AS 'nombreGrupo'
FROM alumnos a
INNER JOIN grupos g
ON a.grupo_id = g.id
WHERE g.id = 4
;

-- left join
SELECT * 
FROM alumnos a
LEFT JOIN grupos g
ON a.grupo_id = g.id
;

SELECT a.id, a.nombre AS 'alumno', g.nombre AS 'nombreGrupo'
FROM alumnos a
LEFT JOIN grupos g
ON a.grupo_id = g.id
;

-- right join
INSERT INTO Grupos VALUES(7, 'Grupo7');

SELECT * 
FROM alumnos a
RIGHT JOIN grupos g
ON a.grupo_id = g.id
;

SELECT a.id, a.nombre AS 'alumno', g.nombre AS 'nombreGrupo'
FROM alumnos a
RIGHT JOIN grupos g
ON a.grupo_id = g.id
;

-- FULL JOIN no funciona
SELECT * 
FROM alumnos a
FULL JOIN grupos g
ON a.grupo_id = g.id
;

SELECT a.id, a.nombre AS 'alumno', g.nombre AS 'nombreGrupo'
FROM alumnos a
FULL JOIN grupos g
ON a.grupo_id = g.id
;

-- otra manera de hacer full join
SELECT * 
FROM alumnos a
RIGHT JOIN grupos g
ON a.grupo_id = g.id
UNION
SELECT *
FROM alumnos a
LEFT JOIN grupos g
ON a.grupo_id = g.id
;testjoin