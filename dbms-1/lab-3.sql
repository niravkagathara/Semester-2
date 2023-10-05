--lab 3

create table student_1
(enrollment_no varchar(20),
 name varchar(25),
 cpi decimal(5,2),
 birthdate datetime
 );

 /*
	alter command
	syntax 1: to add new column to table
		alter table table_name
		add newcol_name1 datatype(size),

	syntax 2 : to droop existing column
		alter table table_name
		drop column column_name;

	synatx 3 : to change the datatype and size of the columns
		alter table table_name
		alter column column_name new datatype(newsize); 
	*/


--1.
 alter table student_1
	add city varchar(20),backlog int;

--2.
 alter table student_1
	alter column name varchar(35);

--3.
alter table student_1
	alter column cpi int;

--4.
sp_rename 'student_1.enrollment_no','eno'

--5.
alter table student_1
	drop column city;

--6.
sp_rename 'student_1','student'
	select * from student_1 


---7.
alter table student_1
	drop column backlog

--8.
alter table student_1
	alter column name varchar(50) not null

--9.
sp_rename 'student_1.birthdate','bdate'

--10.
alter table student_1
alter column eno varchar(12)

/* rename commnad

syntax 1: to rename column  name
	sp_rename 'table_name.old_col_name','new_col_name'

synatax 2: to rename table  name
	sp_rename 'old_table_name','new_table_name'

*/

select*from student_1
