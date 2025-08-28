# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary 
from Employee e join department d on e.departmentId=d.id 
where (selecT count(distinct salary) from employee where salary>e.salary and 
departmentId=e.departmentId)<3;