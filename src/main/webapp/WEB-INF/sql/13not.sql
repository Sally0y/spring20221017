-- NOT : flase -> true, true -> false

SELECT *
FROM Customers
WHERE 
	NOT Country = 'USA';

SELECT *
FROM Suppliers
WHERE 
	NOT Country = 'USA';
    
SELECT*
FROM Oders
WHERE 
	NOT OderDate >= 1997-01-01
    AND OderDate < 1998-01-01;

    