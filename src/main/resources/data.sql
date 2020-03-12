INSERT INTO Quiz (Name) VALUES ('Cheese Quiz');

INSERT INTO Question (quizID, question) VALUES (1, 'Question 1');
INSERT INTO Question (quizID, question) VALUES (1, 'Question 2');

INSERT INTO Answer (questionID, answer, resultChar) VALUES (1, 'Answer 1', 'A');
INSERT INTO Answer (questionID, answer, resultChar) VALUES (1, 'Answer 2', 'B');
INSERT INTO Answer (questionID, answer, resultChar) VALUES (1, 'Answer 3', 'C');
INSERT INTO Answer (questionID, answer, resultChar) VALUES (1, 'Answer 4', 'D');

INSERT INTO Answer (questionID, answer, resultChar) VALUES (2, 'Answer 1', 'A');
INSERT INTO Answer (questionID, answer, resultChar) VALUES (2, 'Answer 2', 'B');
INSERT INTO Answer (questionID, answer, resultChar) VALUES (2, 'Answer 3', 'C');
INSERT INTO Answer (questionID, answer, resultChar) VALUES (2, 'Answer 4', 'D');

INSERT INTO Result (quizID, resultChar, result, description, imgUrl) VALUES (1, 'A', 'Result 1', 'Its result #1!', '/audi.jpg');
INSERT INTO Result (quizID, resultChar, result, description, imgUrl) VALUES (1, 'B', 'Result 2', 'Its result #2!', '/audi.jpg');
INSERT INTO Result (quizID, resultChar, result, description, imgUrl) VALUES (1, 'C', 'Result 3', 'Its result #3!', '/audi.jpg');
INSERT INTO Result (quizID, resultChar, result, description, imgUrl) VALUES (1, 'D', 'Result 4', 'Its result #4!', '/audi.jpg');
