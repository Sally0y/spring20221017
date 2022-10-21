-- 날짜 시간

-- DATE : 날짜
-- DATETIME : 날짜 시간

CREATE TABLE MyTable06 (
	col1 DATE, 
    col2 DATETIME
);
INSERT INTO MyTable06 (col1, col2) 
VALUES ('2022-10-21', '2022-10-21 11:02:00');
SELECT * FROM MyTable06;

-- DATE : java.sql.Date
-- DATETIME : java.sql.Timestamp 


CREATE TABLE MyTable07 (
	col1 INT,
    col2 DEC(10, 3),
    col3 VARCHAR(255),
    col4 CHAR(3),
    col5 DATE,
    col6 DATETIME
);
SELECT * FROM MyTable07;


CREATE TABLE MyTable08 (
	name VARCHAR(255),
    age INT,
    score DEC(10, 2),
    address VARCHAR(255),
    birthDate DATE,
    inserted DATETIME
);
SELECT * FROM MyTable08;


