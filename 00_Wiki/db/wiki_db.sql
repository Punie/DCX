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

ALTER TABLE "Article" ADD CONSTRAINT FK_ID_ARTICLE_AUTHOR FOREIGN KEY author REFERENCES User (id);
ALTER TABLE "Comment" ADD CONSTRAINT FK_ID_COMMENT_AUTHOR FOREIGN KEY author REFERENCES User (id);
ALTER TABLE "Comment" ADD CONSTRAINT FK_ID_COMMENT_ARTICLE FOREIGN KEY article REFERENCES Article (id);
