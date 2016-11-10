CREATE TABLE "User"
(
  id SERIAL PRIMARY KEY,
  user_name VARCHAR(255),
  first_name VARCHAR(255),
  last_name VARCHAR(255),
  user_type VARCHAR(255)
);

CREATE TABLE "Article"
(
  id SERIAL PRIMARY KEY,
  title VARCHAR(255),
  body TEXT,
  date_created DATE,
  nb_like INTEGER,
  author INTEGER
);

CREATE TABLE "Comment"
(
  id SERIAL PRIMARY KEY,
  body TEXT,
  date_created DATE,
  author INTEGER,
  article INTEGER
);

ALTER TABLE "Article" ADD CONSTRAINT FK_ID_ARTICLE_AUTHOR FOREIGN KEY (author) REFERENCES "User" (id);
ALTER TABLE "Comment" ADD CONSTRAINT FK_ID_COMMENT_AUTHOR FOREIGN KEY (author) REFERENCES "User" (id);
ALTER TABLE "Comment" ADD CONSTRAINT FK_ID_COMMENT_ARTICLE FOREIGN KEY (article) REFERENCES "Article" (id);
ALTER TABLE "User" ADD CONSTRAINT USER_NAME_UNIQUE UNIQUE (user_name);
ALTER TABLE "Article" ADD CONSTRAINT ARTICLE_TITLE_UNIQUE UNIQUE (title);


INSERT INTO "User" (user_name, first_name, last_name) VALUES ('Toto','John','Doe');
INSERT INTO "User" (user_name, first_name, last_name) VALUES ('Tata','Jane','Doe');
INSERT INTO "Article" (title, body, date_created, nb_like, author) VALUES ('Article 1','Mon premier article', '2016-10-22', 3, (SELECT id FROM "User" WHERE user_name = 'Toto'));
INSERT INTO "Article" (title, body, date_created, nb_like, author) VALUES ('Article 2','Second article du wiki', '2016-10-23', 5, (SELECT id FROM "User" WHERE user_name = 'Tata'));
INSERT INTO "Comment" (body, date_created, author, article) VALUES ('Mon premier commentaire', '2016-10-24', (SELECT id FROM "User" WHERE user_name = 'Toto'), (SELECT id FROM "Article" WHERE title = 'Article 2'));
INSERT INTO "Comment" (body, date_created, author, article) VALUES ('Second commentaire', '2016-10-25', (SELECT id FROM "User" WHERE user_name = 'Tata'), (SELECT id FROM "Article" WHERE title = 'Article 2'));
INSERT INTO "Comment" (body, date_created, author, article) VALUES ('Jamais deux sans trois', '2016-10-25', (SELECT id FROM "User" WHERE user_name = 'Toto'), (SELECT id FROM "Article" WHERE title = 'Article 2'));
