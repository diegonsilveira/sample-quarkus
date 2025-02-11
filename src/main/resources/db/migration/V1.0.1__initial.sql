CREATE TABLE jedi (
	id int NOT NULL,
	name varchar(255) NULL,
	gender varchar(255) NULL,
	CONSTRAINT jedi_pkey PRIMARY KEY (id)
);

CREATE TABLE movie (
	id int NOT NULL,
	name varchar(255) NULL,
	CONSTRAINT movie_pkey PRIMARY KEY (id)
);

CREATE TABLE jedi_movie (
	jedi_id int NOT NULL,
	movie_id int NOT NULL
);

INSERT INTO jedi (id, name, gender) VALUES (1, 'Qui-Gon Jinn', 'male');
INSERT INTO jedi (id, name, gender) VALUES (2, 'Obi-Wan Kenobi', 'male');
INSERT INTO jedi (id, name, gender) VALUES (3, 'Anakin Skywalker', 'male');
INSERT INTO jedi (id, name, gender) VALUES (4, 'Yoda', 'male');
INSERT INTO jedi (id, name, gender) VALUES (5, 'Mace Windu', 'male');
INSERT INTO jedi (id, name, gender) VALUES (6, 'Count Dooku', 'male');
INSERT INTO jedi (id, name, gender) VALUES (7, 'Luke Skywalker', 'male');
INSERT INTO jedi (id, name, gender) VALUES (8, 'Rey', 'female');

INSERT INTO movie (id, name) VALUES (1, 'The Phantom Menace');
INSERT INTO movie (id, name) VALUES (2, 'Attack of the Clones');
INSERT INTO movie (id, name) VALUES (3, 'Revenge of the Sith');
INSERT INTO movie (id, name) VALUES (4, 'A New Hope');
INSERT INTO movie (id, name) VALUES (5, 'The Empire Strikes Back');
INSERT INTO movie (id, name) VALUES (6, 'The Return of the Jedi');
INSERT INTO movie (id, name) VALUES (7, 'The Force Awakens');
INSERT INTO movie (id, name) VALUES (8, 'The Last Jedi');
INSERT INTO movie (id, name) VALUES (9, 'Test');

INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (1, 1);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (2, 1);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (2, 2);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (2, 3);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (2, 4);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (2, 5);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (2, 6);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (3, 1);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (3, 2);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (3, 3);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (4, 1);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (4, 2);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (4, 3);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (4, 4);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (4, 5);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (4, 6);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (5, 1);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (5, 2);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (5, 3);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (6, 2);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (6, 3);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (7, 4);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (7, 5);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (7, 6);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (7, 7);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (7, 8);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (8, 7);
INSERT INTO jedi_movie (jedi_id, movie_id) VALUES (8, 8);
