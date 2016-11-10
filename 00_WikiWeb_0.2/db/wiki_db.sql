CREATE TABLE "User"
(
  id SERIAL PRIMARY KEY,
  user_name VARCHAR(255)
);

INSERT INTO "User" (user_name) VALUES ('Toto');
INSERT INTO "User" (user_name) VALUES ('Tata');
