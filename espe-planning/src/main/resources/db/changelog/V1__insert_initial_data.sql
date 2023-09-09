INSERT INTO address (id, city, street, zip_code, additional_address, country)
VALUES (1, 'Fleury', '705, boulevard de Diallo', '85997', '', 'France');
INSERT INTO person (id, first_name, last_name, gender, birthday, address_id)
VALUES (1, 'Hélène-Océane', 'Descamps', 'FEMALE', '1981-5-29', 1);
INSERT INTO employee (phone, car, mail, hiring, title, id)
VALUES ('+33 138891409', true, 'rolland.theodore@free.fr', '2023-08-21', 'DIRECTOR', 1);

INSERT INTO address (id, city, street, zip_code, additional_address, country)
VALUES (2, 'BernardVille', '869, rue Ledoux', '20825', '', 'France');
INSERT INTO person (id, first_name, last_name, gender, birthday, address_id)
VALUES (2, 'Geneviève', 'Prevost', 'FEMALE', '1996-07-09', 2);
INSERT INTO employee (phone, car, mail, hiring, title, id)
VALUES ('+33 422624417', false, 'emile74@leclercq.com', '2019-06-03', 'TEAM_MANAGER', 2);
