/*
SQLyog Ultimate - MySQL GUI v8.21 
MySQL - 5.0.96-community-nt : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `bookId` int(11) NOT NULL auto_increment,
  `detail` varchar(30) default NULL,
  `bookAuthor` varchar(20) default NULL,
  `bookImage` varchar(30) default NULL,
  `bookEdition` int(11) default NULL,
  `bookPageNum` int(11) default NULL,
  `Isbn` varchar(20) default NULL,
  `bookSize` int(11) default NULL,
  `bookWordNum` int(11) default NULL,
  `bookOrigPrice` float default NULL,
  `bookContext` varchar(500) default NULL,
  `bookRecommend` varchar(200) default NULL,
  `bookNum` int(11) default NULL,
  `bookDiscount` float default NULL,
  PRIMARY KEY  (`bookId`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

/*Data for the table `book` */

insert  into `book`(`bookId`,`detail`,`bookAuthor`,`bookImage`,`bookEdition`,`bookPageNum`,`Isbn`,`bookSize`,`bookWordNum`,`bookOrigPrice`,`bookContext`,`bookRecommend`,`bookNum`,`bookDiscount`) values (1,'sdfsdfsdf','zy','xxx.jpg',0,198,'222-2212',40,11133,23,NULL,NULL,2123,22),(2,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(3,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(4,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(5,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(6,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(7,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(8,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(9,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(10,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(11,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(12,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(13,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(14,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(15,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(16,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(17,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(18,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(19,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(20,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(21,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(22,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(23,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(24,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(25,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(26,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(27,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(28,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(29,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(30,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(31,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22),(32,'asfdfy','zy','xxx.jpg',0,198,'222-2212',40,11133,44,NULL,NULL,33,22);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
