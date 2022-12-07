CREATE TABLE games (
  id SERIAL PRIMARY KEY,
  name VARCHAR NOT NULL,
  url VARCHAR,
  author VARCHAR,
  published_on DATE
);
