select * from employees order by employee_id;
select * from employees where rowid in (select decode(mod(rownum,2),0,rowid, null) from employees )order by employee_id;
    
select * from (    
SELECT ROW_NUMBER() over(order by employee_id) AS RowNumber, employee_id,first_name,salary
FROM employees) where rownumber =10;

select job_id, max(salary) from (
select e1.*, row_number() over(order by job_id) as k from employees e1 ) e2
group by job_id;



select * from (select employees.* ,rownum k from employees) where mod(k,2)<>0 order by employee_id;

    