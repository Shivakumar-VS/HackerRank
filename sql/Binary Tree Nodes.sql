select n,case when p is null then 'Root'
when n in (SELECT DISTINCT P FROM BST) THEN 'Inner'
else 'Leaf' end as output from bst order by n;