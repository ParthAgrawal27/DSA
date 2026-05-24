/* Write your PL/SQL query statement below */
Select stock_name , Sum(Case when operation = 'Buy' then -price
else price end
)
As capital_gain_loss 
From Stocks
Group by stock_name;