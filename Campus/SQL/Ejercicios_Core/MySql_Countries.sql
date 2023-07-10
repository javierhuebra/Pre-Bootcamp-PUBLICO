-- 1) Paises que hablan esloveno
SELECT * FROM languages WHERE language = 'slovak';

-- 2) Ciudades de cada país
SELECT countries.name, COUNT(*) AS total_cities
FROM countries
JOIN cities ON countries.code = cities.country_code
GROUP BY countries.name
ORDER BY total_cities DESC;

-- 3) Ciudades de México
SELECT name,country_code FROM cities WHERE country_code = 'MEX';

-- 4) Ta dificil 


-- 5) Paises con área de superficie inferior a 501 y una población superior a 100,000
SELECT name,surface_area,population FROM countries WHERE surface_area < 501 AND population > 100000;

-- 6) ¿Qué consulta harías para obtener países con solo Monarquía Constitucional con un capital superior a 200 y una esperanza de vida superior a 75 años?
SELECT * FROM countries WHERE  LOWER(government_form) LIKE '%monarchy%'; -- Para todas las monarquias (LOWER es para que busque mayusculas y minusculas)
SELECT * FROM countries WHERE government_form = 'Constitutional Monarchy'; -- Para la monarquia constitucional

-- Resolución de la consigna
SELECT * FROM countries 
WHERE government_form = 'Constitutional Monarchy' 
AND capital > 200 AND life_expectancy > 75;


-- 7) ¿Qué consulta harías para obtener todas las ciudades de Argentina dentro del distrito de Buenos Aires y tener una población superior a 500,000? La consulta debe devolver el nombre del país, el nombre de la ciudad, el distrito y la población. 
SELECT countries.name,cities.name
FROM countries
JOIN cities ON countries.code = cities.country_code
WHERE countries.code = 'ARG' AND LOWER(district) = 'buenos aires' AND cities.population > 500000;


-- 8) ¿Qué consulta harías para resumir el número de países en cada región? La consulta debe mostrar el nombre de la región y el número de países. Además, la consulta debe organizar el resultado por el número de países en orden descendente. 
SELECT region, COUNT(*) AS nro_paises
FROM countries
GROUP BY region
ORDER BY nro_paises ASC;





