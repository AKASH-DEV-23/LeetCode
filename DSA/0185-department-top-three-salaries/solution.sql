# Write your MySQL query statement below
SELECT Department, Employee, Salary FROM (
SELECT *, DENSE_RANK() OVER(PARTITION BY Department ORDER BY Salary DESC) AS rnk
FROM (  
    SELECT d.name Department, e.name Employee,e.salary Salary
    FROM Employee e
    INNER JOIN Department d
    ON e.departmentId=d.id ) t
) t WHERE rnk<=3;

