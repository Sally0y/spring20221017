USE mydb6;
SELECT * FROM TableA
UNION ALL
SELECT * FROM TableB;

SELECT * FROM TableA a LEFT JOIN TableB ON a.col1 = b.c1
UNION ALL 
SELECT * FROM TableA a RIGHT JOIN TableB ON a.col1 = b.c1;

-- leetcode 1965

  