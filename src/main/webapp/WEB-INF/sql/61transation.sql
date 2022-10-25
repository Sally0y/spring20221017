USE w3schools;
CREATE TABLE Salary (
	EmployeeID INT PRIMARY KEY,
    Salary INT DEFAULT 0
);
INSERT INTO Salary (EmployeeID, Salary)
VALUES (1, 1000)
	  ,(2, 2000)
      ,(3, 3000)
      ,(4, 4000)
      ,(5, 5000)
      ,(6, 6000)
      ,(7, 7000)
      ,(8, 8000)
      ,(9, 9000);

SELECT * FROM Employees;
DELETE FROM Employees WHERE EmployeeID > 9;