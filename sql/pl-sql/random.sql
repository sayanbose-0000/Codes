begin
  for i in 1..10 loop
    insert into randomTable values (trunc(dbms_random.value(0, 999)));
  end loop;

  for rec in (select * from randomTable) loop
    dbms_output.put_line(rec.randomColumn);
  end loop;
end;

/


-- SQL> @C:\\sayan\\codes\\sql\\pl-sql\\random.sql 
-- 981
-- 446
-- 110
-- 83
-- 500
-- 869
-- 373
-- 234
-- 316
-- 638

-- PL/SQL procedure successfully completed.

-- Commit complete.
-- SQL>