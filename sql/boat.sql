create table Sailor (
  sid varchar2(4) constraint pk_sid primary key  constraint start_with_s check (sid like 's%'),
  sname varchar2(15) constraint init_cap_sname check (substr(sname, 1, 1) = upper(substr(sname, 1, 1))),
  mname varchar2(15),
  surname varchar2(15),
  rating number(2),
  age number(3,1)
);

create table Boat (
  bid number(3) constraint pk_bid primary key,
  bname varchar2(10) constraint all_lower_bname check (bname = lower(bname)),
  color varchar2(6) constraint rgb_set_color check (color in ('red', 'green', 'blue'))
);

create table Reserve (
  sid varchar2(4) constraint rf_sailor_sid  references Sailor(sid),
  bid number(3) constraint rf_boat_bid  references Boat(bid),
  day date constraint less_than_1_Jan_2000 check (day < to_date('1-Jan-2000', 'dd-mon-yyyy')),
  constraint ck_sid_bid primary key (sid, bid)
);

insert into sailor values ('s22', 'Fredrico', null, 'Roberts', 7, 45);
insert into sailor values ('s45', 'Lubber', null, 'Sheen', 8, 55.5);
insert into sailor values ('s32', 'Charlotte', null, 'Gordin', 8, 25.5);
insert into sailor values ('s558', 'Mary', 'Beth', 'Lyon', 10, 35);
insert into sailor values ('s564', 'Horatio', null, 'Powell', 7, 35.4);
insert into sailor values ('s71', 'Zorba', null, 'Brutus', 10, 16);
insert into sailor values ('s1', 'Upto', null, 'Slater', 1, 33.8);
insert into sailor values ('s495', 'Deep', 'Graceb', 'Davis', 3, 63.5);
insert into sailor values ('s574', 'Horatio', null, 'Forrest', 0, 35);
insert into sailor values ('s185', 'Sara', 'Art', 'Powell', 3, 25.5);
insert into sailor values ('s580', 'Deep', 'Kumar', 'Kumar', 6, 17);
insert into sailor values ('s87', 'Deep', 'Jha', null, 8, 51);s

insert into Boat values (101, 'interlake', 'blue');
insert into Boat values (102, 'interlake', 'red');
insert into Boat values (103, 'clipper', 'green');
insert into Boat values (104, 'marine', 'red');

INSERT INTO Reserve VALUES ('s22', 101, TO_DATE('10-OCT-98', 'DD-MON-YY'));
INSERT INTO Reserve VALUES ('s22', 103, TO_DATE('10-AUG-98', 'DD-MON-YY'));
INSERT INTO Reserve VALUES ('s22', 102, TO_DATE('10-OCT-98', 'DD-MON-YY'));
INSERT INTO Reserve VALUES ('s22', 104, TO_DATE('10-JUL-98', 'DD-MON-YY'));
INSERT INTO Reserve VALUES ('s31', 102, TO_DATE('11-OCT-98', 'DD-MON-YY'));
INSERT INTO Reserve VALUES ('s31', 103, TO_DATE('11-JUN-98', 'DD-MON-YY'));
INSERT INTO Reserve VALUES ('s31', 104, TO_DATE('11-DEC-98', 'DD-MON-YY'));
INSERT INTO Reserve VALUES ('s64', 101, TO_DATE('09-MAY-98', 'DD-MON-YY'));
INSERT INTO Reserve VALUES ('s64', 102, TO_DATE('09-AUG-98', 'DD-MON-YY'));
INSERT INTO Reserve VALUES ('s74', 103, TO_DATE('09-AUG-98', 'DD-MON-YY'));
INSERT INTO Reserve VALUES ('s80', 102, TO_DATE('07-JUL-98', 'DD-MON-YY'));
INSERT INTO Reserve VALUES ('s87', 101, TO_DATE('08-JUL-98', 'DD-MON-YY'));
INSERT INTO Reserve VALUES ('s87', 102, TO_DATE('12-DEC-98', 'DD-MON-YY'));






-- 1) Find the names and ages of all sailors.
SQL> select sname || ' ' || mname || ' ' || surname, age from sailor;

SNAME||''||MNAME||''||SURNAME                          AGE
----------------------------------------------- ----------
Fredrico  Roberts                                       45
Lubber  Sheen                                         55.5
Charlotte  Gordin                                     25.5
Mary Beth Lyon                                          35
Horatio  Powell                                       35.4
Zorba  Alex                                             16
Brutus  Slater                                        33.8
Deep Graceb Davis                                     63.5
Horatio  Forrest                                        35
Sara Art Powell                                       25.5
Deep Kumar Kumar                                        17
Deep Kumar Jha                                          51

12 rows selected.









-- 2) Show names under the heading of names_of_sailors and add 2 to age

SQL> select sname || ' ' || mname || ' ' || surname as name, age + 2 from sailor; 

NAME                                                 AGE+2
----------------------------------------------- ----------
Fredrico  Roberts                                       47
Lubber  Sheen                                         57.5
Charlotte  Gordin                                     27.5
Mary Beth Lyon                                          37
Horatio  Powell                                       37.4
Zorba  Alex                                             18
Brutus  Slater                                        35.8
Deep Graceb Davis                                     65.5
Horatio  Forrest                                        37
Sara Art Powell                                       27.5
Deep Kumar Kumar                                        19
Deep Kumar Jha                                          53

12 rows selected.



-- 3) Select all records from sailors in ascending order by name;

SQL> select * from sailor order by sname asc; 

SID  SNAME           MNAME           SURNAME             RATING        AGE
---- --------------- --------------- --------------- ---------- ----------
s29  Brutus                          Slater                   1       33.8
s32  Charlotte                       Gordin                   8       25.5
s87  Deep            Kumar           Jha                      8         51
s95  Deep            Graceb          Davis                    3       63.5
s80  Deep            Kumar           Kumar                    6         17
s22  Fredrico                        Roberts                  7         45
s74  Horatio                         Forrest                  9         35
s64  Horatio                         Powell                   7       35.4
s31  Lubber                          Sheen                    8       55.5
s58  Mary            Beth            Lyon                    10         35
s85  Sara            Art             Powell                   3       25.5
s71  Zorba                           Alex                    10         16

12 rows selected.


-- 4) Show all sailors name.

SQL> select sname || ' ' || mname || ' ' || surname as name from sailor; 

NAME
-----------------------------------------------
Fredrico  Roberts
Lubber  Sheen
Charlotte  Gordin
Mary Beth Lyon
Horatio  Powell
Zorba  Alex
Brutus  Slater
Deep Graceb Davis
Horatio  Forrest
Sara Art Powell
Deep Kumar Kumar
Deep Kumar Jha



-- 5) Select all distinct sailors name.

SQL> select distinct sname || ' ' || mname || ' ' || surname as name from sailor; 

NAME
-----------------------------------------------
Charlotte  Gordin
Brutus  Slater
Mary Beth Lyon
Fredrico  Roberts
Zorba  Alex
Deep Kumar Jha
Lubber  Sheen
Deep Graceb Davis
Horatio  Forrest
Deep Kumar Kumar
Horatio  Powell
Sara Art Powell

12 rows selected.


-- 6) Show all distinct sailors names, ratings who have rating between 5 and 10.


SQL> select distinct sname || ' ' || mname || ' ' || surname as name, rating from sailor where rating >= 5 and rating <= 10; 

NAME                                                RATING
----------------------------------------------- ----------
Charlotte  Gordin                                        8
Horatio  Forrest                                         9
Deep Kumar Kumar                                         6
Horatio  Powell                                          7
Lubber  Sheen                                            8
Fredrico  Roberts                                        7
Mary Beth Lyon                                          10
Zorba  Alex                                             10
Deep Kumar Jha                                           8

9 rows selected.




-- 7) Select all records from Sailors in ascending order by rating and descending order by age

SQL> select * from sailor order by rating asc, age desc;

SID  SNAME           MNAME           SURNAME             RATING        AGE
---- --------------- --------------- --------------- ---------- ----------
s29  Brutus                          Slater                   1       33.8
s95  Deep            Graceb          Davis                    3       63.5
s85  Sara            Art             Powell                   3       25.5
s80  Deep            Kumar           Kumar                    6         17
s22  Fredrico                        Roberts                  7         45
s64  Horatio                         Powell                   7       35.4
s31  Lubber                          Sheen                    8       55.5
s87  Deep            Kumar           Jha                      8         51
s32  Charlotte                       Gordin                   8       25.5
s74  Horatio                         Forrest                  9         35
s58  Mary            Beth            Lyon                    10         35
s71  Zorba                           Alex                    10         16

12 rows selected.


-- 11 12 14 15 17 20 21 25 26 30a 30b 35

--  11) Select names of sailors who have reserved boat 104

SQL> select Sailor.sname from Sailor, Reserve where Sailor.sid = Reserve.sid and Reserve.bid = 104; 

SNAME
---------------
Fredrico
Lubber

-- 12) Find sid of sailors who have reserved red boat

SQL> select Sailor.sname from Sailor, Reserve, Boat where Sailor.sid = Reserve.sid and Reserve.bid = Boat.bid and Boat.color = 'red'; 

SNAME
---------------
Fredrico
Fredrico
Lubber
Lubber
Horatio
Deep
Deep

7 rows selected.


-- 14) Select records for name containing 'B'/'b'.

SQL> select sname from Sailor where sname like '%b%' or sname like '%B'; 

SNAME
---------------
Lubber
Zorba


-- 15) Select names for middle name present.

SQL> select sname || ' ' || mname || ' ' || surname from Sailor where mname is not null; 

SNAME||''||MNAME||''||SURNAME
-----------------------------------------------
Mary Beth Lyon
Deep Graceb Davis
Sara Art Powell
Deep Kumar Kumar
Deep Kumar Jha


-- 17) Find color of boats reserved by Lubber.

SQL> select unique Boat.color from Sailor, Reserve, Boat where Sailor.sid = Reserve.sid and Reserve.bid = Boat.bid and Sailor.sname = 'Lubber'; 

COLOR
------
red
green


-- 20) Compute the increments of rating of persons who have sailed on diff boats on the same day

SQL> select distinct S.sname from Sailor S, Reserve R1, Reserve R2 where S.sid = R1.sid and R1.bid != R2.bid and R1.sid = R2.sid and R1.day = R2.day; 

SNAME
---------------
Fredrico

-- 21) Find name of sailors whose name begins and ends with B and has at least 3 characters

SQL> select sname from Sailor where sname like 'B%B' and length(sname) >= 3; 

no rows selected

-- 25) Find names of sailors who have reserved boat 103. 

SQL> select Sailor.sname from Sailor, Reserve where Sailor.sid = Reserve.sid and Reserve.bid = '103';

SNAME
---------------
Fredrico
Lubber
Horatio

-- 26) Find names of sailors who have reserved red boat.

SQL> select distinct Sailor.sname from Sailor, Reserve, Boat where Sailor.sid = Reserve.sid and Reserve.Bid = Boat.bid and Boat.color = 'red';

SNAME
---------------
Fredrico
Lubber
Horatio
Deep


-- 30 a) Find all records for the rating > some sailor name where sailor name like 'Horatio;

SQL> select S1.sname || ' ' || S1.surname as SailorName from Sailor S1, Sailor S2 where S2.sname = 'Horatio' and S1.rating > S2.rating;      

SAILORNAME
-------------------------------
Lubber Sheen
Charlotte Gordin
Mary Lyon
Zorba Alex
Horatio Forrest
Deep Jha
Mary Lyon
Zorba Alex

8 rows selected.

-- 30 b) Find all records for the ratingsall sailor name schere sailor name like "Horatie.

SQL> select S1.sname || ' ' || S1.surname as SailorName from Sailor S1, Sailor S2 where S2.sname = 'Horatio' and S1.rating > S2.rating;      

SAILORNAME
-------------------------------
Lubber Sheen
Charlotte Gordin
Mary Lyon
Zorba Alex
Horatio Forrest
Deep Jha
Mary Lyon
Zorba Alex

8 rows selected.

-- 35) Find average age of sailors with rating 10

SQL> select avg(age) from Sailor where rating = 10;     

  AVG(AGE)
----------
      25.5
