CREATE DATABASE CURRINFO
USE CURRINFO
CREATE TABLE INFO( CUSTNAME VARCHAR(20),ACCNO VARCHAR(6),BALANCE FLOAT,PASS VARCHAR(4))
INSERT INTO INFO VALUES('Shreyas Shetty','123456',10000,'1234')
INSERT INTO INFO VALUES('Shivam Patkar','234567',20000,'2345')
INSERT INTO INFO VALUES('Ayesha Banarse','345678',30000,'3456')
SELECT * FROM INFO

DROP TABLE INFO