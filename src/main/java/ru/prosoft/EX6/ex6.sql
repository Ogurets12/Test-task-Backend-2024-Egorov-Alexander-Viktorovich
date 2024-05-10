SELECT
    d.ID AS Department_ID,
    COUNT(u.ID) AS Employee_Count,
    AVG(u.SALARY) AS Average_Salary
FROM
    Department d
        LEFT JOIN
    Users u ON d.ID = u.DEPARTMENT_ID
GROUP BY
    d.ID;