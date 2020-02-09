INSERT INTO Person(id, name, age, blood_type, year_of_birthday, month_of_birthday, day_of_birthday, job) VALUES (1, 'martin', 10, 'A', 1991, 8, 15, 'programmer')
INSERT INTO Person(id, name, age, blood_type, year_of_birthday, month_of_birthday, day_of_birthday) VALUES (2, 'david', 9, 'B', 1992, 7, 21)
INSERT INTO Person(id, name, age, blood_type, year_of_birthday, month_of_birthday, day_of_birthday) VALUES (3, 'dennis', 8, 'O', 1993, 10, 15)
INSERT INTO Person(id, name, age, blood_type, year_of_birthday, month_of_birthday, day_of_birthday) VALUES (4, 'sophia', 7, 'AB', 1994, 8, 31)
INSERT INTO Person(id, name, age, blood_type, year_of_birthday, month_of_birthday, day_of_birthday) VALUES (5, 'benny', 6, 'A', 1995, 12, 23)

INSERT INTO Block(id, name) VALUES (1, 'dennis')
INSERT INTO Block(id, name) VALUES (2, 'sophia')

UPDATE Person SET block_id = 1 WHERE (id = 3)
UPDATE Person SET block_id = 2 WHERE (id = 4)