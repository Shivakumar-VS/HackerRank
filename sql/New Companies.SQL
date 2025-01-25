select a.company_code,a.founder,
count(distinct b.lead_manager_code),
count(distinct b.senior_manager_code),
count(distinct b.manager_code),
count(distinct b.employee_code)
FROM company a
INNER JOIN employee b
ON a.company_code = b.company_code
GROUP BY a.company_code, a.founder;