# Write your MySQL query statement below
select p1.email
from Person p1 left join Person p2
on p1.email=p2.email
group by p1.email 
having count(*)>1;