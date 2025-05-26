# Write your MySQL query statement below
SELECT Employee.name, Bonus.bonus
FROM Employee LEFT JOIN Bonus
ON Employee.empId = Bonus.empId
WHERE bonus is NULL OR bonus < 1000;