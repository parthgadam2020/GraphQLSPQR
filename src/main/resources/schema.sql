
DROP TABLE IF EXISTS USER;  
CREATE TABLE USER (
  id VARCHAR(45) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  age INT(3) NOT NULL,
  gender VARCHAR(2) NOT NULL,
  salary INT(6) NOT NULL,
  city VARCHAR(45) NOT NULL,
  PRIMARY KEY (id)
)