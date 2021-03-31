USE ProjectDB;

SET character_set_client = utf8;
SET character_set_connection = utf8;
SET character_set_results = utf8;
SET collation_connection = utf8_general_ci;

CREATE TABLE user(
    id int NOT NULL AUTO_INCREMENT,
    email varchar(200) NOT NULL,
    name varchar(200) NOT NULL,
    password varchar(200) NOT NULL,
    role varchar(200) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO user (email, name, password, role) VALUES ('programador1@zallpy.com','Programador 1','programador1', 'USER');
INSERT INTO user (email, name, password, role) VALUES ('programador2@zallpy.com','Programador 2','programador2', 'USER');
INSERT INTO user (email, name, password, role) VALUES ('administrador@zallpy.com','Administrador','administrador', 'ADMIN');

CREATE TABLE project(
     id int NOT NULL AUTO_INCREMENT,
     name varchar(200) NOT NULL,
     PRIMARY KEY(id)
);

INSERT INTO project (name) VALUES ('Cliente A');
INSERT INTO project (name) VALUES ('Cliente B');

CREATE TABLE userInProjects(
     id int NOT NULL AUTO_INCREMENT,
     idUser int NOT NULL,
     idProject int NOT NULL,
     PRIMARY KEY(id)
);

INSERT INTO userInProjects (idUser, idProject) VALUES (1,1);
INSERT INTO userInProjects (idUser, idProject) VALUES (2,1);
INSERT INTO userInProjects (idUser, idProject) VALUES (2,2);

CREATE TABLE appointments(
    id int NOT NULL AUTO_INCREMENT,
    idUser int NOT NULL,
    idProject int NOT NULL,
    startTime int NOT NULL,
    endTime int NOT NULL,
    PRIMARY KEY(id)
);

ALTER TABLE userInProjects ADD FOREIGN KEY (idUser) REFERENCES user(id);
ALTER TABLE userInProjects ADD FOREIGN KEY (idProject) REFERENCES project(id);

ALTER TABLE appointments ADD FOREIGN KEY (idUser) REFERENCES user(id);
ALTER TABLE appointments ADD FOREIGN KEY (idProject) REFERENCES project(id);