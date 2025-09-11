# Write your MySQL query statement below
SELECT customer_number FROM Orders GROUP BY customer_number HAVING COUNT(customer_number)=
(SELECT COUNT(*) AS cnt FROM Orders GROUP BY customer_number ORDER BY cnt DESC LIMIT 1);
