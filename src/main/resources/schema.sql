CREATE TABLE [Quiz](
	[ID] [BIGINT] IDENTITY(1,1) NOT NULL,
	[QuizName] [nvarchar](50) NULL,
);

CREATE TABLE [Question](
	[ID] [BIGINT] IDENTITY(1,1) NOT NULL,
	[Question] [nvarchar](100) NULL,
	[QuizID] [BIGINT] NOT NULL,
);

CREATE TABLE [Answer](
	[ID] [BIGINT] IDENTITY(1,1) NOT NULL,
	[Answer] [nvarchar](50) NULL,
	[ResultChar] [nchar](1) NULL,
	[QuestionID] [BIGINT] NULL
);

CREATE TABLE [Result](
	[ID] [BIGINT] IDENTITY(1,1) NOT NULL,
	[Result] [nvarchar](50) NULL,
	[Description] [nvarchar](MAX) NULL,
	[ImgUrl] [nvarchar](50) NULL,
	[ResultChar] [nchar](1) NULL,
	[QuizID] [BIGINT] NULL,
);

ALTER TABLE Question ADD FOREIGN KEY (QuizID) REFERENCES Quiz(ID);
ALTER TABLE Answer ADD FOREIGN KEY (QuestionID) REFERENCES Question(ID);
ALTER TABLE Result ADD FOREIGN KEY (QuizID) REFERENCES Quiz(ID);

