create table customer (
  customer_id number(3),
  first_name varchar2(15),
  last_name varchar2(15),
  territory varchar2(10),
  credit_limit number(6, 2),
  mgr_id number(3),
  dob date,
  maritial_status varchar2(10),
  gender varchar2(1),
  income_level varchar2(20)
);

insert into customer values('&customer_id', '&first_name', '&last_name', '&territory', '&credit_limit', '&mgr_id', '&dob', '&maritial_status', '&gender', '&income_level');


1)
create table abc as select * from customer where 1 = 2;

SQL> desc abc
 Name                                                                                                              Null?    Type
 ----------------------------------------------------------------------------------------------------------------- -------- ----------------------------------------------------------------------------
 CUSTOMER_ID                                                                                                                NUMBER(3)
 FIRST_NAME                                                                                                                 VARCHAR2(15)
 LAST_NAME                                                                                                                  VARCHAR2(15)
 TERRITORY                                                                                                                  VARCHAR2(10)
 CREDIT_LIMIT                                                                                                               NUMBER(6,2)
 MGR_ID                                                                                                                     NUMBER(3)
 DOB                                                                                                                        DATE
 MARITIAL_STATUS                                                                                                            VARCHAR2(10)
 GENDER                                                                                                                     VARCHAR2(1)
 INCOME_LEVEL                                                                                                               VARCHAR2(20)

SQL> 

2) 
alter table abc rename to customers_2011;


3)

SQL> desc customers_2011
 Name                                                                                                              Null?    Type
 ----------------------------------------------------------------------------------------------------------------- -------- ----------------------------------------------------------------------------
 CUSTOMER_ID                                                                                                                NUMBER(3)
 FIRST_NAME                                                                                                                 VARCHAR2(15)
 LAST_NAME                                                                                                                  VARCHAR2(15)
 TERRITORY                                                                                                                  VARCHAR2(10)
 CREDIT_LIMIT                                                                                                               NUMBER(6,2)
 MGR_ID                                                                                                                     NUMBER(3)
 DOB                                                                                                                        DATE
 MARITIAL_STATUS                                                                                                            VARCHAR2(10)
 GENDER                                                                                                                     VARCHAR2(1)
 INCOME_LEVEL                                                                                                               VARCHAR2(20)


 4)

 select * from tab;



 5)

 alter table customers_2011 modify INCOME_LEVEL number(8, 2);

 SQL> desc customers_2011 
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 CUSTOMER_ID                                        NUMBER(3)
 FIRST_NAME                                         VARCHAR2(15)
 LAST_NAME                                          VARCHAR2(15)
 TERRITORY                                          VARCHAR2(10)
 CREDIT_LIMIT                                       NUMBER(6,2)
 MGR_ID                                             NUMBER(3)
 DOB                                                DATE
 MARITIAL_STATUS                                    VARCHAR2(10)
 GENDER                                             VARCHAR2(1)
 INCOME_LEVEL                                       NUMBER(8,2)


 6)

 alter table customers_2011 rename column income_level to income;

 SQL> desc customers_2011
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 CUSTOMER_ID                                        NUMBER(3)
 FIRST_NAME                                         VARCHAR2(15)
 LAST_NAME                                          VARCHAR2(15)
 TERRITORY                                          VARCHAR2(10)
 CREDIT_LIMIT                                       NUMBER(6,2)
 MGR_ID                                             NUMBER(3)
 DOB                                                DATE
 MARITIAL_STATUS                                    VARCHAR2(10)
 GENDER                                             VARCHAR2(1)
 INCOME                                             NUMBER(8,2)

SQL> 




7)
INSERT INTO customers_2011 VALUES('&customer_id', '&first_name', '&last_name', '&territory', '&credit_limit', '&mgr_id', '&dob', '&maritial_status', '&gender', '&income_level');



INSERT INTO customers_2011 VALUES (1, 'John', 'Doe', 'USA', 5000.75, 2, '11-Nov-90', 'Single', 'M', 45000.50);
INSERT INTO customers_2011 VALUES (2, 'Jane', 'Smith', 'Canada', 6000.90, 2, '22-Mar-85', 'Married', 'F', 55000.75);
INSERT INTO customers_2011 VALUES (3, 'Alice', 'Johnson', 'UK', 7000.60, 2, '11-Jul-92', 'Single', 'F', 60000.80);
INSERT INTO customers_2011 VALUES (4, 'Bob', 'Williams', 'Germany', 7500.30, 4, '30-Oct-80', 'Married', 'M', 70000.90);
INSERT INTO customers_2011 VALUES (5, 'Charlie', 'Brown', 'Australia', 8000.20, 2, '05-May-88', 'Single', 'M', 75000.25);
INSERT INTO customers_2011 VALUES (6, 'David', 'Miller', 'France', 8500.10, 4, '12-Dec-95', 'Married', 'M', 80000.65);
INSERT INTO customers_2011 VALUES (7, 'Eva', 'Davis', 'Italy', 9000.50, 2, '18-Feb-90', 'Single', 'F', 95000.90);



8)


9)

alter table customers_2011 rename column gender to sex;
alter table customers_2011 rename column customer_id to cust_id;



10)

SQL> select cust_id, first_name, last_name, maritial_status, sex, income from customers_2011;

   CUST_ID FIRST_NAME      LAST_NAME       MARITIAL_S S     INCOME
---------- --------------- --------------- ---------- - ----------
         1 John            Doe             Single     M    45000.5
         2 Jane            Smith           Married    F   55000.75
         3 Alice           Johnson         Single     F    60000.8
         4 Bob             Williams        Married    M    70000.9
         5 Charlie         Brown           Single     M   75000.25
         6 David           Miller          Married    M   80000.65
         7 Eva             Davis           Single     F    95000.9

