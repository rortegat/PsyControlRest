/*CREATE DATABASE IF NOT EXISTS psycontrol_db
DEFAULT CHARACTER SET utf8
DEFAULT COLLATE utf8_general_ci;

CREATE USER IF NOT EXISTS 'psyuser'@'localhost' IDENTIFIED BY 'P4ssw0rd*';

GRANT ALL PRIVILEGES ON psycontrol_db.* TO 'psyuser'@'localhost';

USE psycontrol_db;
*/
CREATE TABLE patient (
  pid INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50),
  apellido_paterno VARCHAR(50),
  apellido_materno VARCHAR(50),
  email VARCHAR(50),
  telefono VARCHAR(20)
);