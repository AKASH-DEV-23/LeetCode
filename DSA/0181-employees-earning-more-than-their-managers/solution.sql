# Write your MySQL query statement below
select e2.name as Employee
from Employee e1 left join Employee e2
on e1.id=e2.managerId
where e2.managerId is not null
and e2.salary>e1.salary;
