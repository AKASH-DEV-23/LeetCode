# Write your MySQL query statement below
SELECT 
IFNULL( (SELECT DISTINCT salary AS SecondHighestSalary
FROM Employee
ORDER BY salary DESC
LIMIT 1,1),
NULL)
AS SecondHighestSalary
