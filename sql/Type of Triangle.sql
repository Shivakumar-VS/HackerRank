select case
when A+B<=C OR B+C<=A OR A+C<=B THEN "Not A Triangle"
when A=B AND B=C THEN 'Equilateral'
when A=B OR B=C OR A=C THEN 'Isosceles'
ELSE 'Scalene'
END
FROM TRIANGLES;