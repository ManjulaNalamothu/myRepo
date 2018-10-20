CREATE DATABASE  IF NOT EXISTS `mydb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `mydb`;

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

INSERT INTO `customer` VALUES 
	(1,'Manjula','Nalamothu','mnalamothu@gmail.com'),
	(2,'John','Doe','john@gmail.com'),
	(3,'Abhi','Y','ayacham@yahoo.com'),
	(4,'Mary','Jones','mary@gmail.com'),
	(5,'Maxwell','Dixon','max@outlook.com');

