# Write your MySQL query statement below
SELECT s.name FROM SalesPerson s WHERE NOT EXISTS(
SELECT o.sales_id FROM Orders o INNER JOIN Company c on o.com_id=c.com_id WHERE o.sales_id=s.sales_id AND c.name="RED");