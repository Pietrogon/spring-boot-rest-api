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
    password varchar(500) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO user (email, username, password) VALUES ('programador1@zallpy.com','Programador1','$2a$10$WqUFsLNlyhnK54HJrr61reR0suCMfHirhy4mZriZK3Yj0.m66SWSm');
INSERT INTO user (email, username, password) VALUES ('programador2@zallpy.com','Programador2','$2a$10$0/v2omgroPhevi5vWfg2OOo/VnPkXMLS1lIycPIOck.AjsRnwycha');
INSERT INTO user (email, username, password) VALUES ('administrador@zallpy.com','admin','$2a$10$LlH7ODzQf9mlfb8HMLusue/f6Be3yf80VrZjaV2RpdgLZ5YbEdjCy');

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
    start_time timestamp,
    end_time timestamp,
    PRIMARY KEY(id)
);

CREATE TABLE role(
     id int NOT NULL AUTO_INCREMENT,
     name varchar(200),
     PRIMARY KEY(id)
);

INSERT INTO role (name) VALUES ('ROLE_ADMIN');
INSERT INTO role (name) VALUES ('ROLE_USER');

CREATE TABLE user_role(
    user_id int NOT NULL,
    role_id int NOT NULL,
    PRIMARY KEY(user_id,role_id)
);

INSERT INTO user_role (user_id,role_id) VALUES (1,2);
INSERT INTO user_role (user_id,role_id) VALUES (2,2);
INSERT INTO user_role (user_id,role_id) VALUES (3,1);

alter table user_in_project add constraint fk_project_id foreign key (project_id) references project (id);
alter table user_in_project add constraint fk_user_id foreign key (user_id) references user (id);

ALTER TABLE appointments ADD FOREIGN KEY (user_id) REFERENCES user(id);
ALTER TABLE appointments ADD FOREIGN KEY (project_id) REFERENCES project(id);

ALTER TABLE user_role ADD FOREIGN KEY (user_id) REFERENCES user(id);
ALTER TABLE user_role ADD FOREIGN KEY (role_id) REFERENCES role(id);

ALTER TABLE user ADD UNIQUE (email);
ALTER TABLE user ADD UNIQUE (username);