--LAB 2

CREATE TABLE DEPOSIT
(
 ACTNO INT,
 CNAME VARCHAR(50),
 BNAME VARCHAR(50),
 AMOUNT DECIMAL(8,2),
 ADATE DATETIME

)

CREATE TABLE CUSTOMERS
(
CNAME
VARCHAR(50),
CITY
VARCHAR(50)
)


CREATE TABLE BRANCH
(
 BNAME VARCHAR(50),
 CITY VARCHAR(50)

)
CREATE TABLE BORROW
(
LOANNO
INT,
CNAME
VARCHAR(50),
BNAME
VARCHAR(50),
AMOUNT
DECIMAL(8,2)
)

INSERT INTO DEPOSIT
VALUES (101,'ANIL','VRCE',1000.00,'1995-3-1'),
	   (102,'SUNIL','AJNI',5000.00,'1996-1-4'),
	   (103,'MEHUL','KAROLBAGH',3500.00,'1995-11-17'),
	   (104,'MADHURI','CHANDI',1200.00,'1995-12-17'),
	   (105,'PRMOD','M.G. ROAD',3000.00,'1996-3-27'),
       (106,'SANDIP','ANDHERI',2000.00,'1996-3-31'),
	   (107,'SHIVANI','VIRAR',1000.00,'1995-9-5'),
	   (108,'KRANTI','NEHRU PLACE',5000.00,'1995-7-2'),
       (109,'MINU','POWAI',7000.00,'1995-8-10')


INSERT INTO BRANCH
VALUES ('VRCE','NAGPUR'), 
	   ('AJNI','NAGPUR'),
	   ('KAROLBAGH','DELHI'), 
       ('CHANDI','DELHI0'),
       ('DHARAMPETH','NAGPUR'), 
       ('M.G. ROAD','BANGLORE'), 
       ('ANDHERI','BOMBAY'), 
       ('VIRAR','BOMBAY'), 
       ('NEHRU PLACE','DELHI'), 
       ('POWAI','BOMBAY')

INSERT INTO CUSTOMERS
  VALUES('ANIL','CALCUTTA'), 
		('SUNIL','DELHI'), 
		('MEHUL',' BARODA'), 
		('MANDAR',' PATNA '),
        ('MADHURI ','NAGPUR'), 
		('PRAMOD','NAGPUR '),
		('SANDIP',' SURAT '),
		('SHIVANI',' BOMBAY'), 
		('KRANTI',' BOMBAY' ),
		('NAREN',' BOMBAY')

INSERT INTO BORROW 
  VALUES(201,'ANIL','VRCE',1000.00),
		(206,'MEHUL','AJNI',5000.00),
		(311,'SUNIL','DHARAMPETH',3000.00),
		(321,'MADHURI','ANDHERI',2000.00),
		(375,'PRMOD','VIRAR',8000.00),
		(481,'KRANTI','NEHRU PLACE',3000.00)

SELECT*FROM BORROW
SELECT*FROM CUSTOMERS
SELECT*FROM BRANCH
SELECT*FROM DEPOSIT

--LAB 2.1 From the above given tables perform the following queries using SELECT statement:

--1. Retrieve all data from table DEPOSIT.
SELECT * FROM Deposit

--2. Retrieve all data from table BORROW.
SELECT * FROM Borrow

--3. Retrieve all data from table CUSTOMERS.
SELECT * FROM Customers

--4. Display Account No, Customer Name & Amount from DEPOSIT.
SELECT Actno, Cname, Amount FROM Deposit

--5. Display Loan No, Amount from BORROW.
SELECT Loanno, Amount FROM Borrow

--6. Display loan details of all customers who belongs to �ANDHERI� branch.
SELECT * FROM Borrow
WHERE Bname ='ANDHERI'

--7. Give account no and amount of depositor, whose account no is equals to 106.
SELECT Actno, Amount FROM Deposit
WHERE Actno=106

--8. Give name of borrowers having amount greater than 5000.
SELECT Cname FROM Borrow
WHERE Amount>5000

--9. Give name of customers who opened account after date '1-12-96'.
SELECT Cname FROM Deposit
WHERE Adate > '1996-12-01'

--10. Display name of customers whose account no is less than 105.
SELECT Cname FROM Deposit
WHERE Actno<105

--11. Display name of customer who belongs to either �NAGPUR� Or �DELHI�. (OR & IN)
--Using OR: 
SELECT Cname FROM Customers
WHERE City='nagpur' OR City='delhi'
--Using IN: 
SELECT Cname FROM Customers
WHERE City IN('nagpur','delhi')

--12. Display name of customers with branch whose amount is greater than 4000 and account no is less than 105.
SELECT Cname, Bname FROM Deposit
WHERE Amount>4000 AND Actno<105

--13. Find all borrowers whose amount is greater than equals to 3000 & less than equals to 8000.
--(AND & BETWEEN)
--Using AND: 
SELECT * FROM Borrow
WHERE Amount>=3000 AND Amount<=8000
--Using BETWEEN:
 SELECT * FROM Borrow
WHERE Amount BETWEEN 3000 AND 8000

--14. Find all depositors who do not belongs to �ANDHERI� branch.
SELECT * FROM Deposit
WHERE Bname <> 'andheri'

--15. Display the name of borrowers whose amount is NULL.
SELECT Cname FROM Borrow
WHERE Amount IS NULL

--16. Display Account No, Customer Name & Amount of such customers who belongs to �AJNI�, �KAROLBAGH� Or �M.G. ROAD� and Account No is less than 104.
SELECT Actno, Cname, Amount FROM Deposit
WHERE Bname IN ('ajni','karolbagh','m.g.road') AND Actno<104

--17. Display all the details of first five customers.
SELECT TOP 5 * FROM Customers

--18. Display all the details of first three depositors whose amount is greater than 1000.
SELECT TOP 3 * FROM Deposit
WHERE Amount>1000

--19. Display Loan No, Customer Name of first five borrowers whose branch name does not belongs to �ANDHERI�.
SELECT TOP 5 Loanno, Cname FROM Borrow
WHERE Bname <> 'andheri'

--20. Retrieve all unique cities using DISTINCT. (Use Customers Table)
SELECT DISTINCT City FROM Customers

--21. Retrieve all unique branches using DISTINCT. (Use Branch Table)
SELECT DISTINCT Bname FROM Branch

--22. Retrieve all the records of customer table as per their city name in ascending order.
SELECT * FROM Customers
ORDER BY City;

--23. Retrieve all the records of deposit table as per their amount column in descending order.
SELECT * FROM Deposit
ORDER BY Amount DESC;

--24. Retrieve all the details of customers in which descending order of their city name.
SELECT * FROM Customers
ORDER BY City DESC;

--25. Show all unique borrowers & label the column UNI_Borrowers. (Display only Names)
--1.
 SELECT DISTINCT Cname [UNI_Borrowers] FROM Borrow;
--2.
 SELECT DISTINCT Cname AS UNI_Borrowers FROM Borrow;


/*LAB 2.2 From the above given tables perform the following queries using UPDATE statement:*/

--1. Update deposit amount of all customers from 3000 to 5000.

UPDATE Deposit SET Amount=5000
WHERE Amount=3000

--2. Change branch name of ANIL from VRCE to C.G. ROAD. (Use Borrow Table)

UPDATE Borrow SET Bname='c.g.road'
WHERE Cname='anil' AND Bname='VRCE'

--3. Update Account No of SANDIP to 111 & Amount to 5000.

UPDATE Deposit SET Actno=111, Amount=5000
WHERE Cname='sandip'

--4. Give 10% Increment in Loan Amount.

UPDATE Borrow SET Amount=Amount+(Amount*10/100)

--5. Update deposit amount of all depositors to 5000 whose account no between 103 & 107.

UPDATE Deposit SET Amount=5000
WHERE Actno>103 AND Actno<107

--6. Update amount of loan no 321 to NULL.

UPDATE Borrow SET Amount=NULL
WHERE Loanno=321

--7. Change Loan number from 201 to 401 & also change branch name from VRCE to AJNI.

UPDATE Borrow SET Loanno=401, Bname='AJNI'
WHERE Loanno=201 AND Bname='VRCE'


--8. Modify customer name ANIL to ANIL JAIN.

UPDATE Customers SET Cname = 'ANIL JAIN'
WHERE Cname = 'ANIL'

--9. Change Name to Ramesh, Branch Name VRCE & Amount 5500, Whose Account Number is 102.
UPDATE Deposit SET Cname='Ramesh', BName ='VRCE', Amount=5500
WHERE Actno=102


--10. Make Branch Name & Amount NULL, Whose Loan Number is 481 & Name is KRANTI.

UPDATE Borrow SET Bname = NULL, Amount = NULL
WHERE Loanno = 481 AND Cname = 'KRANTI'




/*LAB 2.3 From the above given tables perform the following queries using DELETE/DROP/TRUNCATE statement:*/

--1. Delete records of Customer table who belongs to BOMBAY City.

DELETE FROM Customer WHERE City = 'BOMBAY'

--2. Delete all account numbers whose amount less than equals to 1000.

DELETE FROM Deposit WHERE Amount <=1000

--3. Delete borrowers whose branch name is �AJNI�.

DELETE FROM Borrow WHERE Bname = 'AJNI'

--4. Delete all the borrowers whose loan number between 201 to 210.

DELETE FROM Borrow WHERE Loanno>201 AND Loanno<210

--5. Delete customers who opened account after date '1-12-96'. (Use DEPOSIT table)

DELETE FROM Deposit WHERE Adate > '1996-12-01'

--6. Delete all the records of Customers table. (Use TRUNCATE)

TRUNCATE TABLE Customers

--7. Remove all customers whose name is ANIL & Account Number is 101.

DELETE FROM Deposit WHERE Cname = 'ANIL' AND Actno = 101

--8. Delete all the depositors who do not belongs to �ANDHERI� branch.

DELETE FROM Deposit WHERE Bname <> 'ANDHERI'

--9. Delete all the borrowers whose loan amount is less than 2000 and does not belong to VRCE branch.

DELETE FROM Borrow WHERE Amount < 2000 AND Bname <> 'VRCE'

--10. Remove Branch table. (Use DROP)

DROP TABLE Branch

