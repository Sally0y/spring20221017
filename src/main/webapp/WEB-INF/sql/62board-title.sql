CREATE DATABASE prj1;
USE prj1;

CREATE TABLE Board (
	id INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(255) NOT NULL,
    content VARCHAR(1000) NOT NULL
);
SELECT * FROM Board ORDER BY 1 DESC;


-- 작성자 컬럼 추가
ALTER TABLE Board
ADD COLUMN writer VARCHAR(255) NOT NULL;

-- 작성자 컬럼 추가
ALTER TABLE Board
ADD COLUMN inserted DATETIME NOT NULL DEFAULT NOW();