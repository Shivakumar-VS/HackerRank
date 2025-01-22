select distinct city from station 
where right(city, 1) NOT IN ('A','E','I','O','U');