/* Write your PL/SQL query statement below */
Select MAX(num) as num
FROM( 
    Select num from MyNumbers group by num 
    having COUNT(*) = 1
);