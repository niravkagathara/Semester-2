/****** Script for SelectTopNRows command from SSMS  ******/
SELECT TOP 1000 [EID]
      ,[EName]
      ,[Department]
      ,[Salary]
      ,[JoiningDate]
      ,[City]
  FROM [BANK_INFO_DB].[dbo].[Employee]
  
  --1
  select max(salary) as max_sal from Employee
  
  select mIN(salary) as mIN_sal from Employee

  SELECT*FROM Employee


  select  Department
  ,count (*)
  from Employee
  group by Department
 
 select Department ,count(*) 
,sum(Salary)
 from Employee
 group by Department 


   select
   distinct City from Employee 

   select count(distinct City) from Employee
--5
   select City , count (*) 
   from Employee group by City
--6
  select City , count (*) 
   from Employee group by City
  HAVING COUNT (*)>1

  
 select City , count (*) 
   from Employee
    where City  LIKE 'r%'
 group by City
 

	select City , count (*) 
   from Employee group by City
HAVING COUNT(*)>1
AND City LIKE 'r%'
