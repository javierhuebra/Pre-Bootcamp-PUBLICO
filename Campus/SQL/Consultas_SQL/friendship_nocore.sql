SELECT users.first_name AS usuario, users2.first_name AS amigo FROM users
JOIN friendships ON friendships.user_id = users.id
RIGHT JOIN users AS users2 ON users2.id = friendships.friend_id;

/* 1) Devuelva a todos los usuarios que son amigos de Kermit,
 asegúrese de que sus nombres se muestren en los resultados.*/
SELECT users.first_name AS amigos_de_Kermit FROM users
JOIN friendships ON friendships.user_id = users.id
RIGHT JOIN users AS users2 ON users2.id = friendships.friend_id
WHERE users2.first_name = 'Kermit';

/* 2) Devuelve el recuento de todas las amistades. */
SELECT COUNT(*) as nroAmistades FROM friendships;

/* 3) Descubre quién tiene más amigos y devuelve el recuento de sus amigos. */
SELECT u.first_name, u.last_name, COUNT(f.friend_id) AS amigos_count
FROM users u
JOIN friendships f ON f.user_id = u.id
GROUP BY u.id
ORDER BY amigos_count DESC
LIMIT 1;

/* 4) Crea un nuevo usuario y hazlos amigos de Eli Byers, Kermit The Frog y Marky Mark.*/
INSERT INTO users (first_name, last_name)
VALUES ('Nuevo', 'Usuario');

/*5) Devuelve a los amigos de Eli en orden alfabético. */
SELECT u.first_name, u.last_name
FROM users u
JOIN friendships f ON f.friend_id = u.id
JOIN users eu ON eu.first_name = 'Eli' AND eu.last_name = 'Byers'
WHERE f.user_id = eu.id
ORDER BY u.first_name, u.last_name;

/* 6) Eliminar a Marky Mark de los amigos de Eli.*/
DELETE FROM friendships
WHERE user_id = (SELECT id FROM users WHERE first_name = 'Eli' AND last_name = 'Byers')
AND friend_id = (SELECT id FROM users WHERE first_name = 'Marky' AND last_name = 'Mark');


/* 7) Devuelve todas las amistades, mostrando solo el nombre y apellido de ambos amigos */
SELECT concat( users.first_name,' ', users.last_name) AS usuario, concat( users2.first_name,' ', users2.last_name) AS amigo FROM users
JOIN friendships ON friendships.user_id = users.id
JOIN users AS users2 ON users2.id = friendships.friend_id;