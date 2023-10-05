--ASSINMENET

CREATE TABLE student_assi
(
	StuID decimal(3, 0),
	Name VARCHAR(50),
	EnrollmentNo decimal(12, 0),
	Division VARCHAR(50),
	Sem INT ,
	BirthDate DATETIME,
	Email VARCHAR(50),
	ContactNo decimal(10, 0)

)

INSERT INTO Student_assi
VALUES  (101,'Naimish Patel',090200107051,'BCX-3',3,'1991-12-06','naimishp49@gmail.com',8866566768),
		(102,'Firoz A. S.',090200107090,'BCY-3',3,'1994-05-03','Firoz.me@gmail.com',8888999922),
		(103,'Krunal Vyas',090200107101,'BCZ-5',5,'1984-03-01','Krunal.vyas@gmail.com',9999888877),
		(104,'Vijay Patel',090200107102,'BCX-5',5,'1985-02-15','Vijay.patel123@gmail.com',8787878787),
		(105,'Vimal Trivedi',090200107103,'BCY-3',3,'1988-01-20','Vimal123@gmail.com',NULL)

SELECT*FROM Student_assi

--1. Display all student details who belongs to ‘bcx-3’ division.
   
  SELECT * FROM student_assi
  WHERE Division = 'BCX-3';


--2. Display name of student who belongs to either semester 3 or 5. (or & in)

  SELECT Name FROM student_assi
  WHERE Sem = 3
      OR sem = 5;
 
 SELECT Name FROM student_assi
  WHERE Sem IN (3,5);


--3. Find all students whose name does not starts with ‘v’.

  SELECT Name FROM student_assi
  WHERE Name NOT LIKE 'v%';


--4. Display all the details of first three students.

  SELECT TOP 3 * FROM student_assi;


--5. Display unique divisions.

  SELECT DISTINCT Division FROM student_assi;


--6. Display name, enrollment no of first 30% students who’s contact number ends with 7.

  /*SELECT Name,EnrollmentNo TOP 30% FROM Student_assi 
  WHERE ContactNo LIKE '%7';
*/

--7. Find all students in which email contains ‘3@g’ with division bcz-5.

  SELECT * FROM student_assi
  WHERE Email LIKE '3@g'
  AND Division = 'BCZ-5';


--8. Display student id, name & email address of all students.

  SELECT StuID,Name,Email FROM student_assi;


--9. Find students after born date 01-01-1990.

  SELECT * FROM student_assi
  WHERE BirthDate > 1990-01-01;



--10. Display student name in which student belongs to semester 3 and enrollment number 
    --contains ‘107’.

  SELECT Name from student_assi
  WHERE Sem IN (3)
    AND EnrollmentNo LIKE '%107%';


--11. Display student name & division name of all students, also do arrange the list in 
    --ascending order.

  SELECT Division,Name FROM student_assi
  ORDER BY Division ASC 
  SELECT Division,Name FROM student_assi
   ORDER BY Name ASC;


--12. Display all the students in which mobile number is empty.

  SELECT * FROM student_assi
  WHERE ContactNo IS NULL;


--13. Show all unique semesters & label the column Semester.
 
  SELECT DISTINCT Sem  AS Semester FROM student_assi;

  SELECT DISTINCT Sem [Semester] FROM student_assi;


--14. Display name, enrollment no & semester of such students who belongs to division ‘BCX-3’,‘BCZ-5’ Or ‘BCY-3’ and Birthdate after 15-3-86.

  SELECT Name,EnrollmentNo,Sem FROM student_assi
  WHERE Division IN ('BCX-3','BCZ-5','BCY-3')
  AND BirthDate > 1986-03-15;


--15. Retrieve all the records of student table as per their Birthdate column in descending order

  SELECT * FROM student_assi
  ORDER BY BirthDate DESC;



