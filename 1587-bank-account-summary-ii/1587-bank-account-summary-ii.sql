/* Write your PL/SQL query statement below */
Select u.name , sum(amount) as balance 
from Users u 
Inner JOin Transactions t
on u.account = t.account
group by u.account , u.name
having sum(amount) > 10000;