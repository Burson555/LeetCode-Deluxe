-- https://leetcode.com/problems/employees-earning-more-than-their-managers/solution/
-- Solution 1 is worth looking at.
-- Selecting from two tables will give us the Cartesian product of two tables.

# Write your MySQL query statement below
select a.Name as Employee
from Employee as a, Employee as b
where a.ManagerId = b.Id and a.Salary > b.Salary;