# Write your MySQL query statement below
SELECT product_name, year, price from Sales cross join Product on Sales.product_id = Product.product_id
