CREATE TABLE Quiz(
	ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	Name nvarchar(50) NULL
);

CREATE TABLE Question(
	ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	Question nvarchar(100) NULL,
	Quiz_ID BIGINT NOT NULL
);

CREATE TABLE Answer(
	ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	Answer nvarchar(50) NULL,
	RESULT_CHAR nchar(1) NULL,
	Question_ID BIGINT NULL
);

CREATE TABLE Result(
	ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	Result nvarchar(50) NULL,
	Description nvarchar(MAX) NULL,
	Img_Url nvarchar(50) NULL,
	RESULT_CHAR nchar(1) NULL,
	Quiz_ID BIGINT NULL
);

ALTER TABLE Question ADD FOREIGN KEY (QUIZ_ID) REFERENCES Quiz(ID);
ALTER TABLE Answer ADD FOREIGN KEY (QUESTION_ID) REFERENCES Question(ID);
ALTER TABLE Result ADD FOREIGN KEY (QUIZ_ID) REFERENCES Quiz(ID);

