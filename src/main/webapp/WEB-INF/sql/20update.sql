SELECT * FROM Customers;

UPDATE Customers
SET CustomerName = 'sally', 
ContactName = 'selru', 
Address = 'Str.26', 
City = 'Berlin', 
PostalCode = '16205', 
Country = 'Germany'
WHERE CustomerID = 92; 