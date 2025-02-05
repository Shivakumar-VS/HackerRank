select months*salary as earnings, count(*) from Employee group by earnings order by earnings desc limit 1;

