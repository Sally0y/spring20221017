USE w3school;
-- AS :컬럼/테이블에 별칭을 줄 수 있다.


SELECT EmployeeID AS id,
	   FirstName AS fname,
       LastName AS lname,
       BirthDate AS birth
FROM Employees;
