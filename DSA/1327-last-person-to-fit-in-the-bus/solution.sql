SELECT COALESCE(
    (SELECT person_name FROM (
        SELECT *, 
            SUM(weight) OVER(ORDER BY turn ROWS BETWEEN 
            UNBOUNDED PRECEDING AND CURRENT ROW) AS runningSum
        FROM Queue
    ) t WHERE runningSum <= 1000
    ORDER BY runningSum DESC
    LIMIT 1),
    
    (SELECT person_name FROM Queue ORDER BY turn DESC LIMIT 1)
) AS person_name;
