SELECT CO.Continent, FLOOR(AVG(CI.Population)) AS AvgPopulation
FROM CITY CI
JOIN COUNTRY CO ON CI.CountryCode = CO.Code
GROUP BY CO.Continent;

