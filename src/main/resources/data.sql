--INSERT INTO Quiz (NAME) VALUES ('Cheese Quiz');
--
--INSERT INTO Question (QUIZ_ID, QUESTIONBODY) VALUES (1, 'Question 1');
--INSERT INTO Question (QUIZ_ID, QUESTIONBODY) VALUES (1, 'Question 2');
--
--INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (1, 'Answer 1', 'A');
--INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (1, 'Answer 2', 'B');
--INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (1, 'Answer 3', 'C');
--INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (1, 'Answer 4', 'D');
--
--INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (2, 'Answer 1', 'A');
--INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (2, 'Answer 2', 'B');
--INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (2, 'Answer 3', 'C');
--INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (2, 'Answer 4', 'D');
--
--INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (1, 'A', 'Result 1', 'Its result #1!', '/audi.jpg');
--INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (1, 'B', 'Result 2', 'Its result #2!', '/audi.jpg');
--INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (1, 'C', 'Result 3', 'Its result #3!', '/audi.jpg');
--INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (1, 'D', 'Result 4', 'Its result #4!', '/audi.jpg');


INSERT INTO Quiz (Name) VALUES ('Cheese');
INSERT INTO Quiz (Name) VALUES ('ShoeQuiz');
INSERT INTO Quiz (Name) VALUES ('MarvelQuiz');
INSERT INTO Quiz (Name) VALUES ('CarBrandQuiz');
INSERT INTO Quiz (Name) VALUES ('MusicGenreQuiz');
INSERT INTO Quiz (Name) VALUES ('RailWayEngineQuiz');
INSERT INTO Quiz (Name) VALUES ('WhoAreYou');

INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (1, 'Favourite food?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (1,'Favourite color?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (1,'How would you define your style?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (1,'Favourite country?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (1,'Pick a sport');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (2,'Favourite drink?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (2,'How do you like the outdoors');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (2,'What is your favourite beer?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (2,'What do you think about cars?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (2,'How do you prefer to travel?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (3,'What kind of pizza do you like?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (3,'Favorite Tv-show when you were young?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (3,'Your choice of liquid?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (3,'Choose the destination you would like to travel to?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (3,'Choose a president?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (4,'How do you like speed?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (4,'When you accomplish a task…');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (4,'Sunglasses are...');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (4,'Favourite food?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (4,'What''s on your wrist?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (5,'The first thing I do when I wake up is:');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (5,'Which of these video games would you prefer to play?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (5,'My pants are:');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (5,'After work/school I go straight to:');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (6,'Do you even lift?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (6,'What is your opinion on protein powder?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (6,'What is your favourite metal?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (6,'What is your opinion on climate change?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (6,'What is most important - speed or strength?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (6,'What food do you prefer?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (7,'Favourite food?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (7,'Favourite color?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (7,'Favourite beverage?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (7,'Shoe size?');
INSERT INTO Question (QUIZ_ID,  QUESTIONBODY) VALUES (7,'Pick a sport');

INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (1,  'Pasta!',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (1,  'Pizza!',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (1,  'Hamburgers!',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (1,  'Spicy food!',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (2,  'Gree',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (2,  'Blue',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (2,  'Yellow',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (2,  'Red',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (3,  'Fancy',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (3,  'Casual',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (3,  'Whatever is on the floor when I wake up',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (3,  'Rocker',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (4,  'Italy',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (4,  'Netherlands',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (4,  'The United Kingdom',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (4,  'USA',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (5,  'Soccer',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (5,  'Curling',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (5,  'Rugby',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (5,  'Football',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (7,  'Beer',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (7,  'Coffee',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (7,  'Milk',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (7,  'Water',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (8,  'It''s the best!',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (8,  'It''s dirty!',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (8,  'I''d rather stay inside',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (8,  'Can I run in it?',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (9,  'Budweiser',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (9,  'Beer?',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (9,  'Whatever is in the fridge',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (9,  'Something I can hardly pronounce',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (10,  'It''s only a car if it''s a convertible',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (10,  'A mode of transportation',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (10,  'I''d prefer not to use one',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (10,  'They''re ok I guess!',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (11,  'By horse',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (11,  'By airplane',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (11,  'I don''t',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (11,  'By bike',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (12,  'Oxfilé-pizza',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (12,  'Kebabpizza',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (12,  'Margarita',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (12,  'Calzone',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (13,  'Fresh prince in bel air',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (13,  'Magnum PI',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (13,  'Full house',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (13,  'Golden girls',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (14,  'Whisky',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (14,  'Milk',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (14,  'Manhatta',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (14,  'Mead',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (15,  'The Moo',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (15,  'Cave',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (15,  'City',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (15,  'Alps',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (16,  'Vladimir Puti',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (16,  'Kim Jong U',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (16,  'George W Bush',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (16,  'Donald Trump',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (17,  'Fastest possible is the only choice',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (17,  'I wish I was faster',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (17,  'A lot  as long as it is also quiet',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (17,  'Doesn''t matter  as long as it''s done in style',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (18,  '...make sure everything is done properly.',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (18,  '...finish as soon as I can  even if the result is bad.',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (18,  '...want to be as efficient as possible.',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (18,  '...don''t.',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (19,  '...neccesary!',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (19,  '...useless.',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (19,  '...an opportunity!',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (19,  '...sunglasses?',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (20,  'Schnitzel!',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (20,  'Baguette',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (20,  'Pizza hut',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (20,  'Tiny schnitzels',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (21,  'An expensive watch',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (21,  'Nothing',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (21,  'A smartwatch',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (21,  'A bracelet',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (22,  'Scream at the top of my lungs',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (22,  'Do complex math',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (22,  'Have breakfast',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (22,  'Go back to bed',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (23,  'Facemelting shooter',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (23,  'Nothing  I don''t bother with video games',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (23,  'The Sims',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (23,  'An adventurous role-playing game',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (24,  'Studded with spikes for some reaso',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (24,  'Second hand pants from the 60s',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (24,  'Way too revealing',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (24,  'Hanging on to my knees for dear life',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (25,  'The pub',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (25,  'The book store',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (25,  'The gym',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (25,  'Prison (do not pass go)',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (26,  'No.',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (26,  'Occasionally',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (26,  'Yeah  YOU WANNA GO?!',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (26,  'Mmmmmhmmm.',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (27,  'Eh...',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (27,  'It provides some extra taste for my milk.',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (27,  'Workout is worthless without it!',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (27,  'Pseudo-science',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (28,  'Gold.',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (28,  'Steel.',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (28,  'The music kind',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (28,  'Whatever is shiny.',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (29,  'It''s not real.',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (29,  'We''ve known about it forever...',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (29,  'F*ck the climate!',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (29,  'Something has to be done now!',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (30,  'Neither.',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (30,  'Strength  but you can never skip leg day',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (30,  'POWEEEEER!',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (30,  'I''d say 50/50',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (31,  'Unicorns',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (31,  'Meatballs.',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (31,  'Deepfried stuff!',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (31,  'Whatever as long as it is served with a sweet Reisling',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (32,  'Carbonara!',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (32,  'Pizza!',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (32,  'Hamburgers!',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (32,  'Seafood risotto',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (33,  'Yellow',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (33,  'Burgundy',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (33,  'Orange',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (33,  'Blue',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (34,  'Coke',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (34,  'Juice',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (34,  'Beer',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (34,  'Diet Coke',  'D');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (35,  '42',  'A');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (35,  '44',  'B');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (35,  '42',  'C');
INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (35,  '41',  'D');
--INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (36,  'E-sport',  'A');
--INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (36,  'Football',  'B');
--INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (36,  'Golf',  'C');
--INSERT INTO Answer (QUESTION_ID, answer, RESULT_CHAR) VALUES (36,  'Nah',  'D');

INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (1, 'A', 'Parmesan', 'Parmigiano-Reggiano or Parmesan is an Italian hard, granular cheese. It has been called the "King of Cheeses" and a "practically perfect food".', '/parmesan.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (1, 'B', 'Gouda', 'Gouda is a mild, yellow cheese, originating from the Netherlands, made from cow''s milk. It is one of the most popular cheeses worldwide.', '/gouda.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (1, 'C', 'Cheddar', 'Cheddar cheese is a relatively hard, off-white or orange if colourings such as annatto are added), sometimes sharp-tasting, natural cheese. Originating in the English village of Cheddar in Somerset, cheeses of this style are now produced beyond the region and in several countries around the world.', '/cheddar.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (1, 'D', 'Pepper Jack', 'Pepper Jack is a derivative of Monterey Jack, the original “American” cheese invented by Mexican Franciscan friars of Monterey, California. As the name suggests, the cheese is flavoured with sweet peppers, rosemary, habañero chilies and garlic and spicy jalapeños for an extra kick.', '/pepperjack.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (2, 'A', 'Boots', 'A boot, plural boots, is a type of specific footwear. Most boots mainly cover the foot and the ankle, while some also cover some part of the lower calf.', '/boots.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (2, 'B', 'Pumps', 'A court shoe (British English), coort shoe (Scottish English), or pump (American English), is a shoe with a low-cut front, or vamp, with either a shoe buckle or a black bow as ostensible fastening.', '/pumps.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (2, 'C', 'slippers', 'Slippers are light footwear that are easy to put on and off and are intended to be worn indoors, Slippers are light footwear that are easy to put on and off and are intended to be worn indoors, Slippers are light footwear that are easy to put on and off and are intended to be worn indoors, particularly at home. ', '/slippers.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (2, 'D', 'sneakers', 'Sneakers also called trainers, athletic shoes, tennis shoes, gym shoes, kicks, sport shoes or runners) are shoes primarily designed for sports or other forms of physical exercise, but which are now also widely used for everyday wear.', '/sneakers.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (3, 'A', 'Iron-man', 'Genius. Billionaire. Playboy. Philanthropist.', '/iron man.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (3, 'B', 'Hulk', 'Dr. Bruce Banner lives a life caught between the soft-spoken scientist he’s always been and the uncontrollable green monster powered by his rage.', '/hulc.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (3, 'C', 'Captian America', 'Recipient of the Super-Soldier serum, World War II hero Steve Rogers fights for American ideals as one of the world’s mightiest heroes and the leader of the Avengers.', '/captain america.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (3, 'D', 'Thor', 'The son of Odin uses his mighty abilities as the God of Thunder to protect his home Asgard and planet Earth alike.', '/Ebba thor.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (4, 'A', 'Audi', 'Audi AG is a German automobile manufacturer that designs, engineers, produces, markets and distributes luxury vehicles.', '/audi.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (4, 'B', 'Renault', 'Groupe Renault is a French multinational automobile manufacturer established in 1899. The company produces a range of cars and vans, and in the past has manufactured trucks, tractors, tanks, buses/coaches, aircraft and aircraft engines, and autorail vehicles.', '/renault.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (4, 'C', 'Tesla', 'Tesla, Inc. (formerly Tesla Motors, Inc.), is an American electric vehicle and clean energy company based in Palo Alto, California.', '/tesla.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (4, 'D', 'Mini', 'Mini is a British automotive marque founded in 1969, owned by German automotive company BMW since 2000, and used by them for a range of small cars.', '/mini.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (5, 'A', 'Death metal', 'Hard, fast and with indecipherable vocals, you make everyone''s friends shift in their seats when someone puts you on during a party.', '/deathmetal.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (5, 'B', 'Jazz', 'Technical, inaccessible and elitist, you turn your listeners into the most obnoxious people around, ruining friendships and relationships alike.', '/jazz.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (5, 'C', 'Pop', 'Simple, easy to listen to, and commercially viable, you are the envy of the other genres, although they would never dare admit it.', '/pop.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (5, 'D', 'Rap', 'Whether it''s quick and techincal or mumbled and autotuned, you have taken the world by storm. While other genres debate on whether something with no melody can be considered music you are too busy partying and living it up to care.', '/rap.jp');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (6, 'A', 'Thomas the tank engine', 'Thomas the Tank Engine is a fictional anthropomorphised steam locomotive in The Railway Series books by the Reverend Wilbert Awdry and his son, Christopher, published from 1945.', '/thomastank.jpeg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (6, 'B', 'Rc4', 'The SJ Class Rc is the most used electric locomotive in Sweden. Rc is a universal locomotive used both in freight and passenger trains.', '/Rc4.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (6, 'C', 'TMZ', 'DSB class MZ was a series of 61 diesel-electric locomotives operated by Danske Statsbaner. They were built by NOHAB between 1967 and 1978 under licence from General Motors EMD with subcontractors Thrige-Titan traction motors) and Frichs chassis, bodywork). ', '/tmz.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (6, 'D', 'Siemens taurus', 'The EuroSprinter family of electric locomotives is a modular concept of locomotives for the European market built by Siemens. The internal Siemens product name is ES 64, with ES for EuroSprinter and the number 64 indicating the 6,400 kW power at rail. In Sweden the locomotives are called Taurus.', '/taurus.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (7, 'A', 'Ludwig', 'Ludwig likes trains.', '/ludwig.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (7, 'B', 'Johan', 'Johan is quite tall.', '/johan.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (7, 'C', 'Henrik', 'Henrik likes plaid shirts and screwdrivers.', '/henrik.jpg');
INSERT INTO Result (QUIZ_ID, RESULT_CHAR, result, description, IMG_URL) VALUES (7, 'D', 'Hanna', 'Hanna often secretly takes pictures of strangers'' dogs on the subway.', '/Hanna.jpg');


