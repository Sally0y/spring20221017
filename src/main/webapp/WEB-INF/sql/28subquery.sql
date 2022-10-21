-- 쿼리가 다른 쿼이 안에 작성될 수 있다.

SELECT * FROM Products
WHERE Price = 
(SELECT MAX(Price) FROM Products);

SELECT * FROM Products
WHERE Price = 
(SELECT MIN(Price) FROM Products);

SELECT * FROM Products
WHERE Price > 
(SELECT AVG(Price) FROM Products);

SELECT * 
FROM
	(SELECT CategoryID,
			AVG(Price) avg
	 FROM Products
     GROUP BY CategoryID) A
WHERE average > 30;