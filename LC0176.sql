# Write your MySQL query statement below
select (
    select distinct Salary
    from Employee
    order by Salary desc
    limit 1, 1)
as SecondHighestSalary;


-- # Write your MySQL query statement below
-- select max(Salary) 
-- as SecondHighestSalary
-- from Employee
-- where Salary < (select max(Salary) from Employee);