declare
  num number := '&num';
  fact number := 1;

begin
  for i in 1..num loop
    fact := fact * i;
  end loop;

  dbms_output.put_line('Factorial is: ' || fact);
end;

/


-- SQL> @C:\\sayan\\codes\\sql\\pl-sql\\factorial.sql
-- Enter value for num: 5
-- old   2:   num number := '&num';
-- new   2:   num number := '5';
-- Factorial is: 120

-- PL/SQL procedure successfully completed.
