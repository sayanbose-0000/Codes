-- create jobs schema 

create table jobs (
  job_id varchar2(10),
  job_title varchar2(35),
  min_salary number(5),
  max_salary number(6)
);



-- View Schema

SQL> desc jobs  

 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 JOB_ID                                             VARCHAR2(10)
 JOB_TITLE                                          VARCHAR2(35)
 MIN_SALARY                                         NUMBER(5)
 MAX_SALARY                                         NUMBER(6)

SQL> 




-- insert records

insert into jobs values ('ST_MAN', 'Stock Manager', 5500, 8500);
insert into jobs values ('ST_CLERK', 'Stock Clerk', 2000, 5000);
insert into jobs values ('SH_CLERK', 'Shipping Clerk', 2500, 5500);
insert into jobs values ('IT_PROG', 'Programmer', 4000, 10000);
insert into jobs values ('MK_MAN', 'Marketing Manager', 9000, 15000);
insert into jobs values ('MK_REP', 'Marketing Representative', 4000, 9000);
insert into jobs values ('HR_REP', 'Human Resource Representative', 4000, 9000);
insert into jobs values ('PR_REP', 'Public Relations Representative', 4500, 10500);



-- Show records

SQL> select * from jobs;

JOB_ID     JOB_TITLE                           MIN_SALARY MAX_SALARY
---------- ----------------------------------- ---------- ----------
ST_MAN     Stock Manager                             5500       8500
ST_CLERK   Stock Clerk                               2000       5000
SH_CLERK   Shipping Clerk                            2500       5500
IT_PROG    Programmer                                4000      10000
MK_MAN     Marketing Manager                         9000      15000
MK_REP     Marketing Representative                  4000       9000
HR_REP     Human Resource Representative             4000       9000
PR_REP     Public Relations Representative           4500      10500




-- Show one record

SQL> select * from jobs where MIN_SALARY >= 5000;

JOB_ID     JOB_TITLE                           MIN_SALARY MAX_SALARY
---------- ----------------------------------- ---------- ----------
ST_MAN     Stock Manager                             5500       8500
MK_MAN     Marketing Manager                         9000      15000

SQL>