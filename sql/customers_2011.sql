SQL> select * from customers_2011; 

   CUST_ID FIRST_NAME      LAST_NAME       TERRITORY  CREDIT_LIMIT     MGR_ID DOB       MARITIAL_S S     INCOME
---------- --------------- --------------- ---------- ------------ ---------- --------- ---------- - ----------
         1 John            Doe             USA             5000.75          2 11-NOV-90 Single     M    45000.5
         2 Jane            Smith           Canada           6000.9          2 22-MAR-85 Married    F   55000.75
         3 Alice           Johnson         UK               7000.6          2 11-JUL-92 Single     F    60000.8
         4 Bob             Williams        Germany          7500.3          4 30-OCT-80 Married    M    70000.9
         5 Charlie         Brown           Australia        8000.2          2 05-MAY-88 Single     M   75000.25
         6 David           Miller          France           8500.1          4 12-DEC-95 Married    M   80000.65
         7 Eva             Davis           Italy            9000.5          2 18-FEB-90 Single     F    95000.9

7 rows selected.




17.  Show all customers id along with their manager id

SQL> select cust_id, mgr_id from customers_2011;

   CUST_ID     MGR_ID
---------- ----------
         1          2
         2          2
         3          2
         4          4
         5          2
         6          4
         7          2

7 rows selected.


18. 

Show each customers name along with their manager name

SQL> select c1.first_name as customer, c2.first_name as manager from customers_2011 c1 join customers_2011 c2 on c1.mgr_id = c2.cust_id;       

CUSTOMER        MANAGER
--------------- ---------------
John            Jane
Jane            Jane
Alice           Jane
Charlie         Jane
Eva             Jane
Bob             Bob
David           Bob



19. 

Add attribute city varchar2(25) and set value to this for each custoner.

SQL> alter table customers_2011 add city varchar2(25);


update customers_2011 set city = 'London' where cust_id = 1;
update customers_2011 set city = 'Paris' where cust_id = 2;
update customers_2011 set city = 'Conneticut' where cust_id = 3;
update customers_2011 set city = 'Yorkshire' where cust_id = 4;
update customers_2011 set city = 'NYC' where cust_id = 5;
update customers_2011 set city = 'Washington' where cust_id = 6;
update customers_2011 set city = 'Chicago' where cust_id = 7;



SQL> select * from customers_2011;

   CUST_ID FIRST_NAME      LAST_NAME       TERRITORY  CREDIT_LIMIT     MGR_ID DOB       MARITIAL_S S     INCOME CITY
---------- --------------- --------------- ---------- ------------ ---------- --------- ---------- - ---------- -------------------------
         1 John            Doe             USA             5000.75          2 11-NOV-90 Single     M    45000.5 London
         2 Jane            Smith           Canada           6000.9          2 22-MAR-85 Married    F   55000.75 Paris
         3 Alice           Johnson         UK               7000.6          2 11-JUL-92 Single     F    60000.8 Conneticut
         4 Bob             Williams        Germany          7500.3          4 30-OCT-80 Married    M    70000.9 Yorkshire
         5 Charlie         Brown           Australia        8000.2          2 05-MAY-88 Single     M   75000.25 NYC
         6 David           Miller          France           8500.1          4 12-DEC-95 Married    M   80000.65 Washington
         7 Eva             Davis           Italy            9000.5          2 18-FEB-90 Single     F    95000.9 Chicago

7 rows selected.



20. insert three more rows into the table.

INSERT INTO customers_2011 VALUES (8, 'Charles', 'Darney', 'England', 5663.75, 2, '14-Dec-99', 'Married', 'M', 47600.55, 'Nottingham');
INSERT INTO customers_2011 VALUES (9, 'Jonathan', 'Harker', 'America', 7500.90, 4, '25-Apr-85', 'Single', 'M', 95400.75, 'Houston');
INSERT INTO customers_2011 VALUES (10, 'Robert', 'Langdon', 'Italy', 5050.90, 4, '27-Dec-85', 'Single', 'M', 65080.75, 'Milan');


SQL> select * from customers_2011;

   CUST_ID FIRST_NAME      LAST_NAME       TERRITORY  CREDIT_LIMIT     MGR_ID DOB       MARITIAL_S S     INCOME CITY
---------- --------------- --------------- ---------- ------------ ---------- --------- ---------- - ---------- -------------------------
         1 John            Doe             USA             5000.75          2 11-NOV-90 Single     M    45000.5 London
         2 Jane            Smith           Canada           6000.9          2 22-MAR-85 Married    F   55000.75 Paris
         3 Alice           Johnson         UK               7000.6          2 11-JUL-92 Single     F    60000.8 Conneticut
         4 Bob             Williams        Germany          7500.3          4 30-OCT-80 Married    M    70000.9 Yorkshire
         5 Charlie         Brown           Australia        8000.2          2 05-MAY-88 Single     M   75000.25 NYC
         6 David           Miller          France           8500.1          4 12-DEC-95 Married    M   80000.65 Washington
         7 Eva             Davis           Italy            9000.5          2 18-FEB-90 Single     F    95000.9 Chicago
         8 Charles         Darney          England         5663.75          2 14-DEC-99 Married    M   47600.55 Nottingham
         9 Jonathan        Harker          America          7500.9          4 25-APR-85 Single     M   95400.75 Houston
        10 Robert          Langdon         Italy            5050.9          4 27-DEC-85 Single     M   65080.75 Milan

10 rows selected.



21. Now insert three more rows with only supplying values for (cust_id, first_name, last_name,city)

INSERT INTO customers_2011 VALUES (11, 'Sydney', 'Carton', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Cuttack');
INSERT INTO customers_2011 VALUES (12, 'Lucy', 'Manette', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Paris');
INSERT INTO customers_2011 VALUES (13, 'Aurthur', 'James', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Luxembourg');

   CUST_ID FIRST_NAME      LAST_NAME       TERRITORY  CREDIT_LIMIT     MGR_ID DOB       MARITIAL_S S     INCOME CITY
---------- --------------- --------------- ---------- ------------ ---------- --------- ---------- - ---------- -------------------------
         1 John            Doe             USA             5000.75          2 11-NOV-90 Single     M    45000.5 London
         2 Jane            Smith           Canada           6000.9          2 22-MAR-85 Married    F   55000.75 Paris
         3 Alice           Johnson         UK               7000.6          2 11-JUL-92 Single     F    60000.8 Conneticut
         4 Bob             Williams        Germany          7500.3          4 30-OCT-80 Married    M    70000.9 Yorkshire
         5 Charlie         Brown           Australia        8000.2          2 05-MAY-88 Single     M   75000.25 NYC
         6 David           Miller          France           8500.1          4 12-DEC-95 Married    M   80000.65 Washington
         7 Eva             Davis           Italy            9000.5          2 18-FEB-90 Single     F    95000.9 Chicago
         8 Charles         Darney          England         5663.75          2 14-DEC-99 Married    M   47600.55 Nottingham
         9 Jonathan        Harker          America          7500.9          4 25-APR-85 Single     M   95400.75 Houston
        10 Robert          Langdon         Italy            5050.9          4 27-DEC-85 Single     M   65080.75 Milan
        11 Sydney          Carton                                                                               Cuttack
        12 Lucy            Manette                                                                              Paris
        13 Aurthur         James                                                                                Luxembourg


22. Delete the records for customers whose name starts with 'A'

SQL> delete from customers_2011 where first_name like 'A%'; 

2 rows deleted.



   CUST_ID FIRST_NAME      LAST_NAME       TERRITORY  CREDIT_LIMIT     MGR_ID DOB       MARITIAL_S S     INCOME CITY
---------- --------------- --------------- ---------- ------------ ---------- --------- ---------- - ---------- -------------------------
         1 John            Doe             USA             5000.75          2 11-NOV-90 Single     M    45000.5 London
         2 Jane            Smith           Canada           6000.9          2 22-MAR-85 Married    F   55000.75 Paris
         4 Bob             Williams        Germany          7500.3          4 30-OCT-80 Married    M    70000.9 Yorkshire
         5 Charlie         Brown           Australia        8000.2          2 05-MAY-88 Single     M   75000.25 NYC
         6 David           Miller          France           8500.1          4 12-DEC-95 Married    M   80000.65 Washington
         7 Eva             Davis           Italy            9000.5          2 18-FEB-90 Single     F    95000.9 Chicago
         8 Charles         Darney          England         5663.75          2 14-DEC-99 Married    M   47600.55 Nottingham
         9 Jonathan        Harker          America          7500.9          4 25-APR-85 Single     M   95400.75 Houston
        10 Robert          Langdon         Italy            5050.9          4 27-DEC-85 Single     M   65080.75 Milan
        11 Sydney          Carton                                                                               Cuttack
        12 Lucy            Manette                                                                              Paris



23. update and set credit limit to 1000 whose salary greater than 100000 but less than 120000.

SQL> update customers_2011 set credit_limit = 1000 where income > 100000 and income < 120000; 

0 rows updated.


24. drop this table to recycle bin.

SQL> drop table customers_2011;

Table dropped.


25.revert this table back with new name.

flashback table customers_2011 to before drop rename to customer_2011_new;

27. make a second copy of this table and truncate the original table.

create table customer_2011_new_again as select * from customer_2011_new;
truncate table customer_2011_new;