select sum(city.population) from city
inner join country
ON CITY.CountryCode=Country.code
where country.continent='Asia';