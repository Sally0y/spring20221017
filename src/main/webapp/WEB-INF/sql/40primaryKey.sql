-- alter table: 테이블 수정
-- add column: 컬럼 추가
CREATE TABLE MyTable17 (
	col1 INT,
    col2 INT
);

ALTER TABLE MyTable17
ADD COLUMN col3 INT;

DESC MyTable17;