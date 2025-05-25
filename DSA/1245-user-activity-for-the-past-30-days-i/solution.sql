# Write your MySQL query statement below
SELECT activity_date AS day , COUNT(DISTINCT user_id) AS active_users  
FROM Activity
WHERE activity_date >= '2019-6-28' AND activity_date <= '2019-7-27'
GROUP BY activity_date;
