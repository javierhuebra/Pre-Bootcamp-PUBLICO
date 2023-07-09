-- LEFT JOIN prueba
SELECT *
FROM users
LEFT JOIN tweets
ON users.id = tweets.user_id
WHERE users.id = 1;

-- SELECCIONANDO de la tabla tweets el campo tweet
SELECT tweets.tweet
FROM users
LEFT JOIN tweets
ON users.id = tweets.user_id
WHERE users.id = 1;

-- CAMBIANDO el nombre de la columna
SELECT tweets.tweet as kobe_tweets
FROM users
LEFT JOIN tweets
ON users.id = tweets.user_id
WHERE users.id = 1;

-- CONSULTA para ver todos los tweets que el usuario con id 2 hizo
SELECT first_name, tweet
FROM users
LEFT JOIN faves
ON users.id = faves.user_id
LEFT JOIN tweets
ON faves.tweet_id = tweets.id
WHERE users.id = 2;

-- TWEETS que el usuario con id 1 o 2 marco como favorito
SELECT first_name, tweet
FROM users
LEFT JOIN faves
ON users.id = faves.user_id
LEFT JOIN tweets
ON faves.tweet_id = tweets.id
WHERE users.id = 1 OR users.id = 2;





