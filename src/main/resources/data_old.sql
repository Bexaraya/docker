-- para mysql
create database healthapp;
use healthapp;

DROP TABLE IF EXISTS doctor;

CREATE TABLE doctor (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  speciality_code VARCHAR(250) DEFAULT NULL,
  location VARCHAR(250) DEFAULT NULL
);

INSERT INTO doctor (first_name, last_name, speciality_code, location) VALUES
  ('Fatimetu', 'AbdSamad', 'ENDOC', 'Girona'),
  ('Ahmed', 'Said', 'GEN', 'Madrid'),
  ('Ana', 'Rodríguez', 'DR', 'Barcelona');