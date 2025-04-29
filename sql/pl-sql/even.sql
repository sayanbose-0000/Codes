declare
  num number := '&num';
  it number := 1;

begin
  dbms_output.put('The series is: ');

  loop 
    exit when it > num;
    if mod(it, 2) = 0 then
      dbms_output.put(it || ' ');
    end if;

    it := it + 1;
  end loop;

  dbms_output.new_line;
end;

/

-- SQL> @C:\\sayan\\codes\\sql\\pl-sql\\even.sql
-- Enter value for num: 30
-- old   2:   num number := '&num';
-- new   2:   num number := '30';
-- The series is: 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30

-- PL/SQL procedure successfully completed.