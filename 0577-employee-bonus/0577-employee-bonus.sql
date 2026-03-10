/* Write your PL/SQL query statement below */
Select e.name , b.bonus from Employee e 
Left Join Bonus b  
on e.empId = b.empId
where b.bonus < 1000 Or
b.bonus is Null;