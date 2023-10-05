--LAB 5

CREATE TABLE students
(StuID
INT,
FirstName
VARCHAR(25),
LastName
VARCHAR(25),
Website
VARCHAR(50),
City
VARCHAR(25),
Division
VARCHAR(20),
)
INSERT INTO Students
VALUES	(1011,'Keyur','Patel','techonthenet.com','Rajkot','II-BCX'),
		(1022,'Hardik','Shah','digminecraft.com','Ahmedabad','I-BCY'),
		(1033,'Kajal','Trivedi','bigactivities.com','Baroda','IV-DCX'),
		(1044,'Bhoomi','Gajera','checkyourmath.com','Ahmedabad','III-DCW'),
		(1055,'Harmit','Mitel','NULL','Rajkot','II-BCY'),
		(1066,'Ashok','Jani','NULL','Baroda','II-BCZ')

SELECT*FROM Students

--1. Display the name of students whose name starts with ‘k’.
    SELECT*from Students
	where FirstName like 'k%'

--2. Display the name of students whose name consists of five characters.
	select*from Students
	where FirstName like '%'

--3. Retrieve the first name & last name of students whose city name ends with a & contains six characters.
	select * from students
	where FirstName like '_____';
--4. Display all the students whose last name ends with ‘tel’.
	select * from Students
	where LastName like '%tel'

--5. Display all the students whose first name starts with ‘ha’ & ends with ‘t’.
	select * from Students
	where FirstName like 'ha%t'

--6. Display all the students whose first name starts with ‘k’ and third character is ‘y’.
	select * from Students
	where FirstName like 'k_y%'

--7. Display the name of students having no website and name consists of five characters.
	Select * from students 
	where FirstName like '_____' 
	and Website is NULL;

--8. Display all the students whose last name consist of ‘jer’.
	SELECT * from Students
	where LastName like '%jer%'

--9. Display all the students whose city name starts with either ‘r’ or ‘b’.
	select * from students
	where City like 'r%' or City like 'b%';

--10. Display all the name students having websites.
	select FirstName from Students
	where website is not NULL;

--11. Display all the students whose name starts from alphabet A to H.
	select * from students
	where FirstName like '[a-h]%';

--12. Display all the students whose name’s second character is vowel.
	select * from students 
	where FirstName like '_[a,e,i,o,u]%';

--13. Display student’s name whose city name consist of ‘rod’.
	select FirstName from students
	where City like '%rod%';

--14. Retrieve the First & Last Name of students whose website name starts with ‘bi’.
	select FirstName, LastName from students
	where Website like 'bi%';

--15. Display student’s city whose last name consists of six characters.
	select City from students
	where LastName like '______';

--16. Display all the students whose city name consist of five characters & not starts with ‘ba’.
	select * from students
	where City like '_____' and City not like 'ba';  

--17. Show all the student’s whose division starts with ‘II’.
	select * from students
	where Division like 'II%';

--18. Find out student’s first name whose division contains ‘bc’ anywhere in division name.
	select FirstName from students
	where Division like '%bc%';

--19. Show student id and city name in which division consist of six characters and having website name.
	select Stuid,city from students
	where Division like '______' and Website is not NULL;

--20. Display all the students whose name’s third character is consonant.
	select * from students
	where FirstName not like '__[a,e,i,o,u]%';
