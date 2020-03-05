-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: evote
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `candidates`
--

DROP TABLE IF EXISTS `candidates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `candidates` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `vin` int NOT NULL,
  `city` varchar(45) DEFAULT NULL,
  `age` int NOT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `partyname` varchar(45) DEFAULT NULL,
  `password` varchar(45) NOT NULL,
  `flag` int DEFAULT '0',
  `votecount` int DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `vin_UNIQUE` (`vin`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `candidates`
--

LOCK TABLES `candidates` WRITE;
/*!40000 ALTER TABLE `candidates` DISABLE KEYS */;
INSERT INTO `candidates` VALUES (1,'Nitisha',1001,'Bhopal',34,'female','BJP','1234',1,1),(2,'Raj',1002,'Bhopal',34,'male','Congress','1234',0,0),(3,'Anvitha',1003,'Bengaluru',32,'female','AAP','1234',1,1),(4,'Akanksha',1004,'Bengaluru',40,'female','Congress','1234',1,0),(5,'Farhan',1005,'Bhopal',39,'male','AAP','1234',1,0),(6,'Ashwin',1006,'Bengaluru',47,'male','BSP','1234',0,0),(7,'Neha',1007,'Bhopal',40,'female','BSP','1234',0,0),(8,'Nitin',1008,'Bengaluru',32,'male','SP','1234',0,0),(9,'Numan',1009,'Bengaluru',49,'male','ShivSena','1234',0,0),(10,'Pavithra',1010,'Bhopal',39,'female','ShivSena','1234',1,0);
/*!40000 ALTER TABLE `candidates` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-05 16:42:18
