declare
  num number := 20000;
  a number := 0;
  b number := 1;
  temp number := 0;

begin
  dbms_output.put(a || ' ');
  dbms_output.put(b || ' ');

  while b <= num loop
    temp := a + b;
    a := b;
    b := temp;

    dbms_output.put(b || ' ');
  end loop;

  dbms_output.new_line;
end;

/

-- SQL> @C:\\sayan\\codes\\sql\\pl-sql\\fibonacci.sql
-- 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711
-- 28657

-- PL/SQL procedure successfully completed.
