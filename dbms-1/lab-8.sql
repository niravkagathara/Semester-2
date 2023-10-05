CREATE TABLE Employee
(
	EID int,
	EName varchar(50),
	Department varchar(50),
	Salary Decimal(8,2),
	JoiningDate datetime,
	City varchar(50)
)

insert into Employee
 values (101, 'Rahul', 'Admin', 56000, '1-Jan-90', 'Rajkot'),
		(102, 'Hardik', 'IT', 18000, '25-Sep-90', 'Ahmedabad'),
		(103, 'Bhavin', 'HR', 25000, '14-May-91', 'Baroda'),
		(104, 'Bhoomi', 'Admin', 39000, '8-Feb-91', 'Rajkot'),
		(105, 'Rohit', 'IT', 17000, '23-Jul-90', 'Jamnagar'),
		(106, 'Priya', 'IT', 9000, '18-Oct-90', 'Ahmedabad'),
		(107, 'Neha', 'HR', 34000, '25-Dec-91', 'Rajkot')

select * from Employee

--1. Display the Highest, Lowest, Total, and Average salary of all employees & label the columns Maximum, 
--Minimum, Total_Sal and Average_Sal, respectively.
select max(salary) as Max_salary, min(salary) as Min_salary, 
avg(salary) as Average_salary,sum(salary) as total_salary from Employee

--2. Find total number of employees of EMPLOYEE table.
select count(EName) as total_employee from employee

--3. Retrieve maximum salary from IT department.
select max(salary) as Maximum_salary from Employee
where Department='it'

--4. Count total number of cities of employee without duplication.
select  COUNT(distinct City) as total_city from Employee

--5. Display city with the total number of employees belonging to each city.
select city, COUNT(City) as total_city from Employee
group by City

--6. Display city having more than one employee.
select city,COUNT(city) from Employee
group by City
having count(EName)>1

--7. Give total salary of each department of EMPLOYEE table.
select department,sum(salary) from employee
group by Department

--8. Give average salary of each department of EMPLOYEE table without displaying the respective department name.
select avg(salary) from Employee
group by Department

--9. Give minimum salary of employee who belongs to Ahmedabad.
select min(salary) from Employee
where City='Ahmedabad'

--10. List the departments having total salaries more than 50000 and located in city Rajkot.
select department,SUM(salary) from Employee
where City='Rajkot'
group by Department
having sum(salary)>50000

--11. Count the number of employees living in Rajkot.
select COUNT(ename) from Employee
where City='Rajkot'

--12. Display the difference between the highest and lowest salaries. Label the column name to SAL_DIFFERENCE.
select max(salary)-min(salary) as SAL_DIFFERENCE from Employee

--13. Display the total number of employees hired before 1st January, 1991.
select COUNT(ename) from Employee
where JoiningDate<'1-jan-91'

--14. Display total salary of each department with total salary exceeding 35000 and sort the list by total salary.
select department,sum(salary) from Employee
group by Department
having sum(salary)>35000
order by sum(salary)

--15. List out department names in which more than two employees.
select Department,COUNT(Ename) from Employee
group by department
having count(EName)>2

--16. Display Minimum salary of Rajkot City.
select min(salary) from Employee
where city='Rajkot'

--17. Display City wise total employees count.
select city,count(ename) from employee
group by City

--18. List all departments with minimum salaries.
select department,min(salary) from Employee
group by Department

--19. Give Total salaries of each city without displaying the respective city name.
select distinct city,sum(salary) from Employee
group by City

--20. Find department wise Minimum, Maximum & Total Salaries.
select department,min(salary) as min_salary ,max(salary) as max_salary,sum(salary) as total_salary from Employee
group by Department