
Select user_id ,MAX(time_stamp) as last_stamp 
from Logins
Where time_stamp >= '2020-01-01'
AND time_stamp < '2021-01-01'
group by user_id
order by user_id;
