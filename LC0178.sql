-- Runtime: 260 ms, faster than 87.72% of MySQL online submissions for Rank Scores.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Rank Scores.

# Write your MySQL query statement below
select
Score,
(select count(*) from (select distinct Score s from Scores) tmp where s >= Score) as Rank
from Scores
order by Score desc;


-- -- Runtime: 585 ms, faster than 58.60% of MySQL online submissions for Rank Scores.
-- -- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Rank Scores.

-- # Write your MySQL query statement below
-- select
-- Score, 
-- (select count(distinct Score) from Scores
-- where Score >= s.Score) as Rank
-- from Scores s
-- order by Score desc;