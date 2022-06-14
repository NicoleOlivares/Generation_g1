CREATE DATABASE TestJoin;

USE TestJoin;

CREATE TABLE Grupos
(
    Id int PRIMARY KEY NOT NULL,
    nombre varchar(20)
);

CREATE TABLE Alumnos
(
    Id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar(20),
    grupo_id int
);

-- FK
ALTER TABLE Alumnos
ADD CONSTRAINT FK_grupos_id
FOREIGN KEY (grupo_id) REFERENCES grupos(id);

INSERT INTO Grupos VALUES(1, 'Grupo1');
INSERT INTO Grupos VALUES(2, 'Grupo2');
INSERT INTO Grupos VALUES(3, 'Grupo3');
INSERT INTO Grupos VALUES(4, 'Grupo4');
INSERT INTO Grupos VALUES(5, 'Grupo5');
INSERT INTO Grupos VALUES(6, 'Grupo6');

INSERT INTO Alumnos (nombre, grupo_id) VALUES('Pamela', null);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Israel', null);

-- Grupo 1
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Leonardo Utreras', 1);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Luis Mejias', 1);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Francisco Cid', 1);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Francisco Perez', 1);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Marysabel Aedo', 1);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Ignacio Romero', 1);

-- Grupo 2
INSERT INTO alumnos(nombre, grupo_id) VALUES('Nicolas Neira', 2);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Genesis Quezada', 2);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Catalina Castillo', 2);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Carlos Iturra', 2);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Gabriel Guzman', 2);

-- Grupo 3
INSERT INTO alumnos (nombre, grupo_id) VALUES('Alejandro', 3);
INSERT INTO alumnos (nombre, grupo_id) VALUES('Luis', 3);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Cristobal', 3);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Joao', 3);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Cristian', 3);

-- Grupo 4
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Danko', 4);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Wladimir', 4);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Catalina', 4);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Esteban', 4);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Katherina', 4);

-- Grupo 5
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Nicole Olivares', 5);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Hector Gomez', 5);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Fernando Faundez',5);
INSERT INTO alumnos (nombre, grupo_id) VALUES('Ignacio Galaz', 5);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Constanza Mardones', 5);

-- Grupo 6
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Alondra', 6);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Diana', 6);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Matias', 6);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Michael', 6);
INSERT INTO Alumnos (nombre, grupo_id) VALUES('Paulino', 6);