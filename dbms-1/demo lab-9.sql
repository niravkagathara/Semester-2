---LAB-9------

CREATE TABLE CRICKET
( Name varchar (50),
  City varchar (50), 
  Age Int
)
INSERT INTO CRICKET
VALUES('Sachin Tendulkar', 'Mumbai', 30),	
	  ('Rahul Dravid ','Bombay', 35),
      ('M. S. Dhoni' ,'Jharkhand', 31),  
      ('Suresh Raina' ,'Gujarat' ,30)
----LAB-9------

CREATE TABLE COMPUTER
(
	 RollNo Int,
	 Name varchar (50) 
)
CREATE TABLE ELECTRICAL
(
	 RollNo Int,
	 Name varchar (50) 
)
INSERT INTO COMPUTER
	VALUES(101,'AJAY'),
		  (109, 'Haresh'),
		  (115 ,'Manish')
INSERT INTO ELECTRICAL
	VALUES(105 ,'Ajay'),
		  (107 ,'Mahesh'),
		  (115 ,'Manish')


SELECT NAME FROM COMPUTER
UNION

