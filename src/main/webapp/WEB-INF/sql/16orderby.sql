-- ORDER BY : 조회된 레코드(행, row) 정렬

SELECT * FROM Customers;

SELECT * FROM Customers
ORDER BY CustomerID;

SELECT * FROM Customers
ORDER BY CustomerName;

SELECT * 
FROM Customers
ORDER BY Country;

SELECT * 
FROM Customers
ORDER BY Country, City;

-- ASC: 오름차순 (기본값)
-- DESC: 내림차순

SELECT * 
FROM Customers
ORDER BY Country ASC;

SELECT * 
FROM Customers
ORDER BY Country DESC;

SELECT * 
FROM Customers
ORDER BY Country ASC, City ASC;



