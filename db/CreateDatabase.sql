USE ProjectDB;

SET GLOBAL max_allowed_packet = 1024 * 1024 * 256;
SET character_set_client = utf8;
SET character_set_connection = utf8;
SET character_set_results = utf8;
SET collation_connection = utf8_general_ci;

CREATE TABLE user(
    id int NOT NULL AUTO_INCREMENT,
    email varchar(200) NOT NULL,
    name varchar(200) NOT NULL,
    password varchar(200) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO user (email, name, password) VALUES ('programador1@zallpy.com','Programador 1','programador1');
INSERT INTO user (email, name, password) VALUES ('programador1@zallpy.com','Programador 1','programador1');
INSERT INTO user (email, name, password) VALUES ('administrador@zallpy.com','Administrador','administrador');
