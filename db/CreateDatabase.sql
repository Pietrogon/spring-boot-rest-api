USE ProjectDB;

SET character_set_client = utf8;
SET character_set_connection = utf8;
SET character_set_results = utf8;
SET collation_connection = utf8_general_ci;
set @@session.explicit_defaults_for_timestamp=on;

CREATE TABLE user(
    id int NOT NULL AUTO_INCREMENT,
    email varchar(200) NOT NULL,
    username varchar(200) NOT NULL,
    password varchar(200) NOT NULL,
    role varchar(200) NOT NULL,
    enabled int(4) DEFAULT 1 NULL,
    PRIMARY KEY(id)
);

INSERT INTO user (email, username, password, role) VALUES ('programador1@zallpy.com','Programador 1','programador1', 'USER');
INSERT INTO user (email, username, password, role) VALUES ('programador2@zallpy.com','Programador 2','programador2', 'USER');
INSERT INTO user (email, username, password, role) VALUES ('administrador@zallpy.com','admin','$2a$04$0XCHJpBqL/FeMGqH7YhCj.ZB.8oyy/ywHRBYQtJpgcI/gt8/V9vr.', 'ADMIN');

CREATE TABLE project(
     id int NOT NULL AUTO_INCREMENT,
     name varchar(200) NOT NULL,
     PRIMARY KEY(id)
);

INSERT INTO project (name) VALUES ('Cliente A');
INSERT INTO project (name) VALUES ('Cliente B');

CREATE TABLE user_in_project(
     user_id int NOT NULL,
     project_id int NOT NULL,
     PRIMARY KEY(user_id,project_id)
);

INSERT INTO user_in_project (user_id, project_id) VALUES (1,1);
INSERT INTO user_in_project (user_id, project_id) VALUES (2,1);
INSERT INTO user_in_project (user_id, project_id) VALUES (2,2);

CREATE TABLE appointments(
    id int NOT NULL AUTO_INCREMENT,
    user_id int NOT NULL,
    project_id int NOT NULL,
    startTime timestamp,
    endTime timestamp,
    PRIMARY KEY(id)
);

INSERT INTO appointments (user_id, project_id, startTime, endTime) VALUES (2,2,'1970-01-01 00:00:01','1970-01-01 00:00:01');

alter table user_in_project add constraint fk_project_id foreign key (project_id) references project (id);
alter table user_in_project add constraint fk_user_id foreign key (user_id) references user (id);

ALTER TABLE appointments ADD FOREIGN KEY (user_id) REFERENCES user(id);
ALTER TABLE appointments ADD FOREIGN KEY (project_id) REFERENCES project(id);