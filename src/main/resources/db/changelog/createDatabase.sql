# https://docs.liquibase.com/change-types/community/add-column.html
# https://docs.liquibase.com/change-types/community/sql.html
# just a cheat sheet to create database and user;
CREATE DATABASE TT_LIQUIBASE
    DEFAULT CHARACTER SET utf8
    DEFAULT COLLATE utf8_general_ci;

CREATE USER ttliq@localhost IDENTIFIED BY '1234';
GRANT ALL ON TT_LIQUIBASE.* TO ttliq@localhost;

