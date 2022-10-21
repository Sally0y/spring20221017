-- table명, 컬럼명 작성 관습
-- 회사의 관례를 따름

-- 대소문자 구분 안 함
-- snake_lower_case
-- your_car_name

-- 강의에서는
--   컬럼명: lowerCamelCase
--   테이블명: UpperCamelCase

CREATE TABLE MyTable09 (
	yourCarName VARCHAR(255)
);
INSERT INTO MyTable09 (yourCarName)
VALUES ('tesla');
INSERT INTO MyTable09 (yourCarName)
VALUES ('kia');

SELECT * FROM MyTable09;