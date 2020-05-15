select Email
from (
    select Email, count(Email) as num
    from Person
    group by Email
) tmp 
where num > 1;

# # Write your MySQL query statement below
# select distinct Email
# from Person p
# where (select count(Email) from Person
#       where Email = p.Email) > 1;