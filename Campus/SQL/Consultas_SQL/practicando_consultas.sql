-- Insertar valores sin que el id sea autoincremental
INSERT INTO usuario (id,nombre,edad,email)
VALUES('asda','fulano',30,'fulano@correo.com');

-- Insertar valores en usuarios con id ya autoincremental
INSERT INTO usuarios (nombre,edad,email, id_dojo)
VALUES('fulano',30,'fulano@correo.com', 1);

-- Insertar registros en dojos porque sino no puedo asignarle la fk para crear usuarios, tengo que tener dojo si o si
INSERT INTO dojos (nombre, direccion)
VALUES('Coding Dojo','La nube');

-- Crear tabla con primary key 
CREATE TABLE dojos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(15890),
  direccion VARCHAR(150)
);


-- Eliminar tabla entera (deshabilitado desde mysql, hay que habilitarlo si hace falta pero es MUY PERIGROSO, MUY PERIGROSO)
DELETE FROM usuario;

-- Agregarle autoincremental al id de usuario
ALTER TABLE usuario MODIFY id INT AUTO_INCREMENT;

-- Cambiar el nombre de la tabla usuario 
ALTER TABLE usuario RENAME TO usuarios;

-- Crear una foreign key con el id del usuario en la tabla dojos (esta mal esto, lo borre pero dejo el codigo)
ALTER TABLE dojos
ADD COLUMN id_usuario INT,
ADD CONSTRAINT fk_dojos_usuarios
FOREIGN KEY (id_usuario) REFERENCES usuarios(id);

-- Crear una foreign key en la tabla usuarios para indicar a que dojo pertenece el usuario
ALTER TABLE usuarios
ADD COLUMN id_dojo INT NOT NULL,
ADD CONSTRAINT fk_usuarios_dojos
FOREIGN KEY (id_dojo) REFERENCES dojos(id);

-- borrar la fk de usuarios porque la cree sin NN
ALTER TABLE usuarios
DROP FOREIGN KEY fk_usuarios_dojos,
DROP COLUMN id_dojo;

-- borrar la fk que cree arriba
ALTER TABLE dojos
DROP FOREIGN KEY fk_dojos_usuarios,
DROP COLUMN id_usuario;

-- Join para ver que onda
SELECT * FROM usuarios
JOIN dojos ON dojos.id = usuarios.id_dojo;

-- JOIN para una relacion muchos a muchos con dos tablas que aca no tengo
SELECT * FROM orders 
JOIN items_orders ON orders.id = items_orders.order_id 
JOIN items ON items.id = items_orders.item_id;

-- Join para seleccionar otras cosas de tabla
SELECT usuarios.nombre, dojos.nombre AS dojo_perteneciente FROM usuarios
JOIN dojos ON dojos.id = usuarios.id_dojo;












