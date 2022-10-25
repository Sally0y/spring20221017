CREATE DATABASE mydb6;
USE mydb6;

CREATE TABLE TableA (
	col1 INT
);

CREATE TABLE TableB (
	c1 INT
);

INSERT INTO TableA (col1)
VALUES(1), (2), (3), (4), (5);

INSERT INTO TableB
VALUES(2), (4), (5), (7), (8);

SELECT*FROM TableA;
SELECT*FROM TableB;

-- INNER JOIN: 두 컬럼에 값이 모두 있는 경우만
SELECT*FROM TableA A INNER JOIN TableB B ON A.col1 = B.c1;
-- INNER 생략가능
SELECT*FROM TableA A JOIN TableB B ON A.col1 = B.c1;

-- LEFT OUTER JOIN: 결과 +  왼쪽 테이블의 레코드들
SELECT*FROM TableA A LEFT OUTER JOIN TableB B ON A.col1 = B.c1;
-- OUTER 생략가능
SELECT*FROM TableA A LEFT JOIN TableB B ON A.col1 = B.c1;

-- LEFT OUTER JOIN: INNER JOIN 결과 + 왼쪽 테이블의 레코드들
SELECT * FROM Tacle