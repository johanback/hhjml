INSERT INTO Quiz (Name) VALUES ('Cheese Quiz');

INSERT INTO Question (QUIZFK, question) VALUES (1, 'Question 1');
INSERT INTO Question (QUIZFK, question) VALUES (1, 'Question 2');

INSERT INTO Answer (QUESTIONFK, answer, resultChar) VALUES (1, 'Answer 1', 'A');
INSERT INTO Answer (QUESTIONFK, answer, resultChar) VALUES (1, 'Answer 2', 'B');
INSERT INTO Answer (QUESTIONFK, answer, resultChar) VALUES (1, 'Answer 3', 'C');
INSERT INTO Answer (QUESTIONFK, answer, resultChar) VALUES (1, 'Answer 4', 'D');

INSERT INTO Answer (QUESTIONFK, answer, resultChar) VALUES (2, 'Answer 1', 'A');
INSERT INTO Answer (QUESTIONFK, answer, resultChar) VALUES (2, 'Answer 2', 'B');
INSERT INTO Answer (QUESTIONFK, answer, resultChar) VALUES (2, 'Answer 3', 'C');
INSERT INTO Answer (QUESTIONFK, answer, resultChar) VALUES (2, 'Answer 4', 'D');

INSERT INTO Result (QUIZFK, resultChar, result, description, imgUrl) VALUES (1, 'A', 'Result 1', 'Its result #1!', '/audi.jpg');
INSERT INTO Result (QUIZFK, resultChar, result, description, imgUrl) VALUES (1, 'B', 'Result 2', 'Its result #2!', '/audi.jpg');
INSERT INTO Result (QUIZFK, resultChar, result, description, imgUrl) VALUES (1, 'C', 'Result 3', 'Its result #3!', '/audi.jpg');
INSERT INTO Result (QUIZFK, resultChar, result, description, imgUrl) VALUES (1, 'D', 'Result 4', 'Its result #4!', '/audi.jpg');


--INSERT INTO Quiz (Name) VALUES ('CheesQuiz');
--INSERT INTO Quiz (Name) VALUES ('ShoeQuiz');
--INSERT INTO Quiz (Name) VALUES ('MarvelQuiz');
--INSERT INTO Quiz (Name) VALUES ('CarBrandQuiz');
--INSERT INTO Quiz (Name) VALUES ('MusicGenreQuiz');
--INSERT INTO Quiz (Name) VALUES ('RailWayEngineQuiz');
--INSERT INTO Quiz (Name) VALUES ('WhoAreYou');
--INSERT INTO Question (QUIZFK,  question) VALUES (1, 'Favourite food?');
--INSERT INTO Question (QUIZFK,  question) VALUES (1,'Favourite color?');
--INSERT INTO Question (QUIZFK,  question) VALUES (1,'How would you define your style?');
--INSERT INTO Question (QUIZFK,  question) VALUES (1,'Favourite country?');
--INSERT INTO Question (QUIZFK,  question) VALUES (1,'Pick a sport');
--INSERT INTO Question (QUIZFK,  question) VALUES (2,'Favourite drink?');
--INSERT INTO Question (QUIZFK,  question) VALUES (2,'How do you like the outdoors');
--INSERT INTO Question (QUIZFK,  question) VALUES (2,'What is your favourite beer?');
--INSERT INTO Question (QUIZFK,  question) VALUES (2,'What do you think about cars?');
--INSERT INTO Question (QUIZFK,  question) VALUES (2,'How do you prefer to travel?');
--INSERT INTO Question (QUIZFK,  question) VALUES (3,'What kind of pizza do you like?');
--INSERT INTO Question (QUIZFK,  question) VALUES (3,'Favorite Tv-show when you were young?');
--INSERT INTO Question (QUIZFK,  question) VALUES (3,'Your choice of liquid?');
--INSERT INTO Question (QUIZFK,  question) VALUES (3,'Choose the destination you would like to travel to?');
--INSERT INTO Question (QUIZFK,  question) VALUES (3,'Choose a president?');
--INSERT INTO Question (QUIZFK,  question) VALUES (4,'How do you like speed?');
--INSERT INTO Question (QUIZFK,  question) VALUES (4,'When you accomplish a task….);
--INSERT INTO Question (QUIZFK,  question) VALUES (4,'Sunglasses are...');
--INSERT INTO Question (QUIZFK,  question) VALUES (4,'Favourite food?');
--INSERT INTO Question (QUIZFK,  question) VALUES (4,'What's on your wrist?');
--INSERT INTO Question (QUIZFK,  question) VALUES (5,'The first thing I do when I wake up is:');
--INSERT INTO Question (QUIZFK,  question) VALUES (5,'Which of these video games would you prefer to play?');
--INSERT INTO Question (QUIZFK,  question) VALUES (5,'My pants are:');
--INSERT INTO Question (QUIZFK,  question) VALUES (5,'After work/school I go straight to:');
--INSERT INTO Question (QUIZFK,  question) VALUES (6,'Do you even lift?');
--INSERT INTO Question (QUIZFK,  question) VALUES (6,'What is your opinion on protein powder?');
--INSERT INTO Question (QUIZFK,  question) VALUES (6,'What is your favourite metal?');
--INSERT INTO Question (QUIZFK,  question) VALUES (6,'What is your opinion on climate change?');
--INSERT INTO Question (QUIZFK,  question) VALUES (6,'What is most important - speed or strength?');
--INSERT INTO Question (QUIZFK,  question) VALUES (6,'What food do you prefer?');
--INSERT INTO Question (QUIZFK,  question) VALUES (7,'Favourite food?');
--INSERT INTO Question (QUIZFK,  question) VALUES (7,'Favourite color?');
--INSERT INTO Question (QUIZFK,  question) VALUES (7,'Favourite beverage?');
--INSERT INTO Question (QUIZFK,  question) VALUES (7,'Shoe size?');
--INSERT INTO Question (QUIZFK,  question) VALUES (7,'Pick a sport');
--

--

--
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (1, 'A', 'Parmesan', 'Parmigiano-Reggiano or Parmesan is an Italian hard, granular cheese. It has been called the "King of Cheeses" and a "practically perfect food".', '/parmesan.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (1, 'B', 'Gouda', 'Gouda is a mild, yellow cheese, originating from the Netherlands, made from cow\'s milk. It is one of the most popular cheeses worldwide.', '/gouda.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (1, 'C', 'Cheddar', 'Cheddar cheese is a relatively hard, off-white or orange if colourings such as annatto are added), sometimes sharp-tasting, natural cheese. Originating in the English village of Cheddar in Somerset, cheeses of this style are now produced beyond the region and in several countries around the world.', '/cheddar.jpg '');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (1, 'D', 'Pepper Jack', 'Pepper Jack is a derivative of Monterey Jack, the original “American” cheese invented by Mexican Franciscan friars of Monterey, California. As the name suggests, the cheese is flavoured with sweet peppers, rosemary, habañero chilies and garlic and spicy jalapeños for an extra kick.', '/pepperjack.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (2, 'A', 'Boots', 'A boot, plural boots, is a type of specific footwear. Most boots mainly cover the foot and the ankle, while some also cover some part of the lower calf.', '/boots.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (2, 'B', 'Pumps', 'A court shoe (British English), coort shoe (Scottish English), or pump (American English), is a shoe with a low-cut front, or vamp, with either a shoe buckle or a black bow as ostensible fastening.', '/pumps.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (2, 'C', 'slippers', 'Slippers are light footwear that are easy to put on and off and are intended to be worn indoors, Slippers are light footwear that are easy to put on and off and are intended to be worn indoors, Slippers are light footwear that are easy to put on and off and are intended to be worn indoors, particularly at home. ', '/slippers.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (2, 'D', 'sneakers', 'Sneakers also called trainers, athletic shoes, tennis shoes, gym shoes, kicks, sport shoes or runners) are shoes primarily designed for sports or other forms of physical exercise, but which are now also widely used for everyday wear.', '/sneakers.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (3, 'A', 'Iron-man', 'Genius. Billionaire. Playboy. Philanthropist.', '/iron man.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (3, 'B', 'Hulk', 'Dr. Bruce Banner lives a life caught between the soft-spoken scientist he’s always been and the uncontrollable green monster powered by his rage.', '/hulc.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (3, 'C', 'Captian America', 'Recipient of the Super-Soldier serum, World War II hero Steve Rogers fights for American ideals as one of the world’s mightiest heroes and the leader of the Avengers.', '/captain america.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (3, 'D', 'Thor', 'The son of Odin uses his mighty abilities as the God of Thunder to protect his home Asgard and planet Earth alike.', '/Ebba thor.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (4, 'A', 'Audi', 'Audi AG is a German automobile manufacturer that designs, engineers, produces, markets and distributes luxury vehicles.', '/audi.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (4, 'B', 'Renault', 'Groupe Renault is a French multinational automobile manufacturer established in 1899. The company produces a range of cars and vans, and in the past has manufactured trucks, tractors, tanks, buses/coaches, aircraft and aircraft engines, and autorail vehicles.', '/renault.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (4, 'C', 'Tesla', 'Tesla, Inc. (formerly Tesla Motors, Inc.), is an American electric vehicle and clean energy company based in Palo Alto, California.', '/tesla.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (4, 'D', 'Mini', 'Mini is a British automotive marque founded in 1969, owned by German automotive company BMW since 2000, and used by them for a range of small cars.', '/mini.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (5, 'A', 'Death metal', 'Hard, fast and with indecipherable vocals, you make everyone\'s friends shift in their seats when someone puts you on during a party.', '/deathmetal.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (5, 'B', 'Jazz', 'Technical, inaccessible and elitist, you turn your listeners into the most obnoxious people around, ruining friendships and relationships alike.', '/jazz.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (5, 'C', 'Pop', 'Simple, easy to listen to, and commercially viable, you are the envy of the other genres, although they would never dare admit it.', '/pop.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (5, 'D', 'Rap', 'Whether it\'s quick and techincal or mumbled and autotuned, you have taken the world by storm. While other genres debate on whether something with no melody can be considered music you are too busy partying and living it up to care.', '/rap.jp'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (6, 'A', 'Thomas the tank engine', 'Thomas the Tank Engine is a fictional anthropomorphised steam locomotive in The Railway Series books by the Reverend Wilbert Awdry and his son, Christopher, published from 1945.', '/thomastank.jpeg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (6, 'B', 'Rc4', 'The SJ Class Rc is the most used electric locomotive in Sweden. Rc is a universal locomotive used both in freight and passenger trains.', '/Rc4.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (6, 'C', 'TMZ', 'DSB class MZ was a series of 61 diesel-electric locomotives operated by Danske Statsbaner. They were built by NOHAB between 1967 and 1978 under licence from General Motors EMD with subcontractors Thrige-Titan traction motors) and Frichs chassis, bodywork). ', '/tmz.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (6, 'D', 'Siemens taurus', 'The EuroSprinter family of electric locomotives is a modular concept of locomotives for the European market built by Siemens. The internal Siemens product name is ES 64, with ES for EuroSprinter and the number 64 indicating the 6,400 kW power at rail. In Sweden the locomotives are called Taurus.', '/taurus.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (7, 'A', 'Ludwig', 'Ludwig likes trains.', '/ludwig.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (7, 'B', 'Johan', 'Johan is quite tall.', '/johan.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (7, 'C', 'Henrik', 'Henrik likes plaid shirts and screwdrivers.', '/henrik.jpg'');
--INSERT INTO Answer (QUIZFK, resultChar, result, description, imgUrl) VALUES (7, 'D', 'Hanna', 'Hanna often secretly takes pictures of strangers\'  dogs on the subway.', '/Hanna.jpg'');
--
--
--
