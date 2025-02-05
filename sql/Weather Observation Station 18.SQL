-- Manhattan Distance Formula: |x1 - x2| + |y1 - y2|
SELECT ROUND(ABS(MIN(LAT_N) - MAX(LAT_N)) + ABS(MIN(LONG_W) - MAX(LONG_W)), 4) 
FROM STATION;
