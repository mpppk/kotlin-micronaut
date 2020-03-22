create table board
(
    id serial UNIQUE,
    name text,
    description text
);

INSERT INTO board VALUES
    (1, 'test name', 'test description');