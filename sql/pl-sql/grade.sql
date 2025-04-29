declare
  marks number := '&marks';

begin
  dbms_output.put('Grade is: ');

  if marks >= 90 then
    dbms_output.put_line('A+');

  elsif marks < 90 and marks >= 80 then
    dbms_output.put_line('A');

  elsif marks < 80 and marks >= 70 then
    dbms_output.put_line('B');

  elsif marks < 70 and marks >= 60 then
    dbms_output.put_line('C');

  elsif marks < 60 and marks >= 50 then
    dbms_output.put_line('D');

  elsif marks < 50 and marks >= 40 then
    dbms_output.put_line('E');

  else
    dbms_output.put_line('Fail');

  end if;
end;

/


-- SQL> @C:\\sayan\\codes\\sql\\pl-sql\\grade.sql
-- Enter value for marks: 50
-- old   2:   marks number := '&marks';
-- new   2:   marks number := '50';
-- Grade is: D

-- PL/SQL procedure successfully completed.

-- SQL> 
