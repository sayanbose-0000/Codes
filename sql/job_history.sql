-- Create Schema

create table job_history (
  employee_id number(3),
  start_date date,
  end_date date,
  job_id varchar2(10),
  department_id number(3)
);



desc job_history;


 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 EMPLOYEE_ID                                        NUMBER(3)
 START_DATE                                         DATE
 END_DATE                                           DATE
 JOB_ID                                             VARCHAR2(10)
 DEPARTMENT_ID                                      NUMBER(3)



-- 1) Insert Values into the table

insert into job_history values (102, '13-JAN-1993', '4-JUL-1998', 'IT_PROG', 60);
insert into job_history values (101, '21-SEP-1998', '27-OCT-1993', 'AC_ACCOUNT', 110);
insert into job_history values (101, '28-OCT-1993', '15-MAR-1997', 'AC_MGR', 110);
insert into job_history values (201, '17-FEB-1996', '19-DEC-1999', 'MK_REP', 20);
insert into job_history values (114, '4-MAR-1998', '31-DEC-1999', 'ST_CLERK', 50);
insert into job_history values (122, '01-JAN-1999', '31-DEC-1999', 'ST_CLERK', 50);
insert into job_history values (200, '17-SEP-1987', '17-JUL-1993', 'AD_ASST', 90);
insert into job_history values (176, '24-MAR-1998', '31-DEC-1998', 'SA_REP', 80);



-- Display table
select * from job_history;


EMPLOYEE_ID START_DAT END_DATE  JOB_ID     DEPARTMENT_ID
----------- --------- --------- ---------- -------------
        102 13-JAN-93 04-JUL-98 IT_PROG               60
        101 21-SEP-98 27-OCT-93 AC_ACCOUNT           110
        101 28-OCT-93 15-MAR-97 AC_MGR               110
        201 17-FEB-96 19-DEC-99 MK_REP                20
        114 04-MAR-98 31-DEC-99 ST_CLERK              50
        122 01-JAN-99 31-DEC-99 ST_CLERK              50
        200 17-SEP-87 17-JUL-93 AD_ASST               90
        176 24-MAR-98 31-DEC-98 SA_REP                80

8 rows selected.



-- 2) employee_id job_id department_id for all employees
select employee_id, job_id, department_id from job_history;


EMPLOYEE_ID JOB_ID     DEPARTMENT_ID
----------- ---------- -------------
        102 IT_PROG               60
        101 AC_ACCOUNT           110
        101 AC_MGR               110
        201 MK_REP                20
        114 ST_CLERK              50
        122 ST_CLERK              50
        200 AD_ASST               90
        176 SA_REP                80

8 rows selected.



-- 3) employee_id job_id department_id where employee_id = 102
select employee_id, job_id, department_id from job_history where employee_id = 102;

EMPLOYEE_ID JOB_ID     DEPARTMENT_ID
----------- ---------- -------------
        102 IT_PROG               60



-- 4) employee_id job_id department_id where employee_id < 115
select employee_id, job_id, department_id from job_history where employee_id < 115;

EMPLOYEE_ID JOB_ID     DEPARTMENT_ID
----------- ---------- -------------
        102 IT_PROG               60
        101 AC_ACCOUNT           110
        101 AC_MGR               110
        114 ST_CLERK              50




-- 5) employee_id job_id department_id where employee_id < 115 and department_id < 100
select employee_id, job_id, department_id from job_history where employee_id < 115 and department_id < 100;

EMPLOYEE_ID JOB_ID     DEPARTMENT_ID
----------- ---------- -------------
        102 IT_PROG               60
        114 ST_CLERK              50




-- NOTE the OR in this question -> It is different from the previous question
-- 6) employee_id job_id department_id where employee_id < 115 or department_id < 100
select employee_id, job_id, department_id from job_history where employee_id < 115 or department_id < 100;

EMPLOYEE_ID JOB_ID     DEPARTMENT_ID
----------- ---------- -------------
        102 IT_PROG               60
        101 AC_ACCOUNT           110
        101 AC_MGR               110
        201 MK_REP                20
        114 ST_CLERK              50
        122 ST_CLERK              50
        200 AD_ASST               90
        176 SA_REP                80




-- 7) for employee_id = 114, make end_date = 30-Nov-2000
update job_history set end_date = '30-Nov-2000' where employee_id = 114

select * from job_history where employee_id = 114;

EMPLOYEE_ID START_DAT END_DATE  JOB_ID     DEPARTMENT_ID
----------- --------- --------- ---------- -------------
        114 04-MAR-98 30-NOV-00 ST_CLERK              50




-- 8) for department_id = 20, make start_date = 15-Feb-1995
update job_history set start_date = '15-Feb-1995' where department_id = 20

select * from job_history where department_id = 20;

EMPLOYEE_ID START_DAT END_DATE  JOB_ID     DEPARTMENT_ID
----------- --------- --------- ---------- -------------
        201 15-FEB-95 19-DEC-99 MK_REP                20



-- 9) change job_id values to new job for your own rows

update job_history set job_id = 'new_job' where employee_id = 201;

select * from job_history where employee_id = 201;

EMPLOYEE_ID START_DAT END_DATE  JOB_ID     DEPARTMENT_ID
----------- --------- --------- ---------- -------------
        201 15-FEB-95 19-DEC-99 new_job               20



-- 10) find no of days passed since he/she left the job
select employee_id, job_id, sysdate - end_date as time_passed_since_left from job_history;

EMPLOYEE_ID JOB_ID     TIME_PASSED_SINCE_LEFT
----------- ---------- ----------------------
        102 IT_PROG                9733.97309
        101 AC_ACCOUNT             11444.9731
        101 AC_MGR                 10209.9731
        201 MK_REP                 9200.97309
        114 ST_CLERK               8853.97309
        122 ST_CLERK               9188.97309
        200 AD_ASST                11546.9731
        176 SA_REP                 9553.97309



-- 11) find joining month of each employee

select employee_id, to_char(start_date, 'Month') as start_month from job_history;

EMPLOYEE_ID START_MONTH
----------- ------------------------------------
        102 January
        101 September
        101 October
        201 February
        114 March
        122 January
        200 September
        176 March



-- 12) Distince departments
select count(distinct department_id) as distinct_department_count from job_history;

DISTINCT_DEPARTMENT_COUNT
-------------------------
                        6


SQL> select distinct department_id as distinct_departments from job_history;

DISTINCT_DEPARTMENTS
--------------------
                  50
                 110
                  90
                  20
                  60
                  80



-- 13) Find rows where job_id has the word ST

select * from job_history where job_id like '%ST%';

EMPLOYEE_ID START_DAT END_DATE  JOB_ID     DEPARTMENT_ID
----------- --------- --------- ---------- -------------
        114 04-MAR-98 30-NOV-00 ST_CLERK              50
        122 01-JAN-99 31-DEC-99 ST_CLERK              50
        200 17-SEP-87 17-JUL-93 AD_ASST               90