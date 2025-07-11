# Write your MySQL query statement below
 -- create view per as
-- select email,count(email) counts from person group by (email);
-- select email from per where counts>1;
-- select 
select email from person group by email having count(email)>1 ;


