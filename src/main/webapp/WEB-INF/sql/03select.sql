-- SELECT: 데이터를 얻는 명령문 (꺼내오는)
/*
SELECT 컬럼명 리스트 FROM 테이블명;
*/
-- Customers 테이블의 모든 레코드와 모든 컬럼 조회
SELECT * FROM Customers;

-- Customers 테이블의 모든 레코드를 CustomerName열 조회
SELECT CustomerName FROM Customers;

-- Customers 테이블의 모든 레코드를 CustormerName, Address열 조회
SELECT CustomerName, Address FROM Customers;

-- Employees 테이블의 모든 레코드(행)을 LastName, BirthDate열 조회
SELECT LastName, BirthDate From Employees;

-- SQL 작성 시 주의할 점
-- 대소문자를 구별하지 않는다.
-- DB에 종류에 따라 구분할 수도 있다. 
-- 키워드는 대문자
-- 그 외에는 소문자 or CamelCase
SELECT LastName,BirthDate FROM Employees; -- 권장
select lastname, birthdate from Employees;
select lastname, birthdate from employees;

-- 모든 컬럼: *
SELECT * FROM Customers;
SELECT
	CustomerID,
    CustomerName,
    ContactName,
    Address,
    City,
    PostalCode,
    Country
FROM
	Customers;
    
-- Employees 테이블의 모든 레코드와 모든 컬럼 조회
SELECT * FROM Employees;

-- SELECT 이후의 컬럼의 순서가 결과의 순서가 됨
SELECT CustomerName, Adress FROM Customers;
SELECT Address, CustomerName FROM Customers;

-- Employees 테이블의 모든 레코드를 FirstName, LastName, BirthDate 컬럼으로 조회
SELECT LastName, FirstName, BirthDate FROM Employees;
SELECT FirstName, LastName, BirthDate FROM Employees;
