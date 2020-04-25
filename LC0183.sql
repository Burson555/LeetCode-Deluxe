# Write your MySQL query statement below
select Name as Customers
from Customers
where Id not in
(select CustomerId from Orders);

-- # Write your MySQL query statement below
-- select Name as Customers
-- from Customers
-- left join Orders
-- on Customers.Id = Orders.CustomerId
-- where Orders.CustomerId is null;

-- # Write your MySQL query statement below
-- select Name as Customers
-- from 
-- (select Customers.Name as Name, Orders.Id as Id
-- from Customers
-- left join Orders
-- on Customers.Id = Orders.CustomerId) tmp
-- where Id is NULL;