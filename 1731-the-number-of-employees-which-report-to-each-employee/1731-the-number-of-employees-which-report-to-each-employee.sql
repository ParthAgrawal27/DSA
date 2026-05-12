/* Write your PL/SQL query statement below */
Select e.employee_id , e.name , Count(r.employee_id) as reports_count  , ROUND(AVG(r.age)) as average_age from Employees e
Join Employees r
On e.employee_id = r.reports_to
Group by e.employee_id , e.name
Order by e.employee_id;
