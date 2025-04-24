CREATE TABLE course (
    id BIGINT NOT NULL,
    name VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    PRIMARY KEY(id)
);


INSERT INTO course(id, name, author) VALUES(1, 'Learn JPA', 'Monkey');
INSERT INTO course(id, name, author) VALUES(2, 'Learn Hibernate', 'Monkey');
INSERT INTO course(id, name, author) VALUES(3, 'Learn Spring', 'Monkey');
INSERT INTO course(id, name, author) VALUES(4, 'Learn Spring Boot', 'Monkey');