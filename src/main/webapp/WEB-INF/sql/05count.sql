-- COUNT()함수 : 레코드가 몇 개 인지 알 수 있음.
SELECT * FROM Customers; -- 91개
SELECT COUNT(*) FROM Customers; -- 91
SELECT COUNT(Country) FROM Customers; -- 91
SELECT COUNT(DISTINCT Country) FROM Custromers; -- 21

-- Employees 테이블의 레코드가 몇 개 인지 알 수 있다.
SELECT COUNT(*) FROM Employees;
-- Suppliers 테이블의 Country 값이 중복 제거 하고 몇 개 인지 알 수 있다.
SELECT COUNT(DISTINCT Country) FROM Suppliers;