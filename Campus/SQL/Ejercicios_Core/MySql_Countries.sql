-- 1) Paises que hablan esloveno
SELECT * FROM languages WHERE language = 'slovak';

-- 2) Ciudades de cada país
SELECT countries.name, COUNT(*) AS total_cities
FROM countries
JOIN cities ON countries.code = cities.country_code
GROUP BY countries.name
ORDER BY total_cities DESC;

-- 3) Ciudades de México
SELECT * FROM cities WHERE country_code = 'MEX';

-- 4) Ta dificil 


-- 5) Paises con área de superficie inferior a 501 y una población superior a 100,000
SELECT * FROM countries WHERE surface_area < 501 AND population > 100000;

