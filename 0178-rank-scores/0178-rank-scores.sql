/* Write your PL/SQL query statement below */
Select score,
Dense_Rank() Over (Order by score desc) As rank from Scores ;
