INSERT INTO Quiz (Name) VALUES ('Cheese Quiz');

INSERT INTO Question (quizID, question) VALUES (1, 'Question 1');
INSERT INTO Question (quizID, question) VALUES (1, 'Question 2');

INSERT INTO Question (quizID,  question) VALUES (1, 'Favourite food?');
INSERT INTO Question (quizID,  question) VALUES (1,'Favourite color?');
--INSERT INTO Question (quizID,  question) VALUES (1,'How would you define your style?');
--INSERT INTO Question (quizID,  question) VALUES (1,'Favourite country?');
--INSERT INTO Question (quizID,  question) VALUES (1,'Pick a sport');
--INSERT INTO Question (quizID,  question) VALUES (2,'Favourite drink?');
--INSERT INTO Question (quizID,  question) VALUES (2,'How do you like the outdoors');
--INSERT INTO Question (quizID,  question) VALUES (2,'What is your favourite beer?');
--INSERT INTO Question (quizID,  question) VALUES (2,'What do you think about cars?');
--INSERT INTO Question (quizID,  question) VALUES (2,'How do you prefer to travel?');
--INSERT INTO Question (quizID,  question) VALUES (3,'What kind of pizza do you like?');
--INSERT INTO Question (quizID,  question) VALUES (3,'Favorite Tv-show when you were young?');
--INSERT INTO Question (quizID,  question) VALUES (3,'Your choice of liquid?');
--INSERT INTO Question (quizID,  question) VALUES (3,'Choose the destination you would like to travel to?');
--INSERT INTO Question (quizID,  question) VALUES (3,'Choose a president?');
--INSERT INTO Question (quizID,  question) VALUES (4,'How do you like speed?');
--INSERT INTO Question (quizID,  question) VALUES (4,'When you accomplish a task….);
--INSERT INTO Question (quizID,  question) VALUES (4,'Sunglasses are...');
--INSERT INTO Question (quizID,  question) VALUES (4,'Favourite food?');
--INSERT INTO Question (quizID,  question) VALUES (4,'What's on your wrist?');
--INSERT INTO Question (quizID,  question) VALUES (5,'The first thing I do when I wake up is:');
--INSERT INTO Question (quizID,  question) VALUES (5,'Which of these video games would you prefer to play?');
--INSERT INTO Question (quizID,  question) VALUES (5,'My pants are:');
--INSERT INTO Question (quizID,  question) VALUES (5,'After work/school I go straight to:');
--INSERT INTO Question (quizID,  question) VALUES (6,'Do you even lift?');
--INSERT INTO Question (quizID,  question) VALUES (6,'What is your opinion on protein powder?');
--INSERT INTO Question (quizID,  question) VALUES (6,'What is your favourite metal?');
--INSERT INTO Question (quizID,  question) VALUES (6,'What is your opinion on climate change?');
--INSERT INTO Question (quizID,  question) VALUES (6,'What is most important - speed or strength?');
--INSERT INTO Question (quizID,  question) VALUES (6,'What food do you prefer?');
--INSERT INTO Question (quizID,  question) VALUES (7,'Favourite food?');
--INSERT INTO Question (quizID,  question) VALUES (7,'Favourite color?');
--INSERT INTO Question (quizID,  question) VALUES (7,'Favourite beverage?');
--INSERT INTO Question (quizID,  question) VALUES (7,'Shoe size?');
--INSERT INTO Question (quizID,  question) VALUES (7,'Pick a sport');

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
