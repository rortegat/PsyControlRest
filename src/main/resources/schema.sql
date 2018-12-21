CREATE TABLE IF NOT EXISTS patient (
  pid INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50),
  apellido_paterno VARCHAR(50),
  apellido_materno VARCHAR(50),
  email VARCHAR(50),
  telefono INT
);