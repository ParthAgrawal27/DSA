/* Write your PL/SQL query statement below */
Update salary 
set sex = Case
    When sex = 'm' then 'f'
    When sex = 'f' then 'm'
    end;