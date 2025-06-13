-- INSURANCE DATABASE - Oracle SQL Implementation
-- ================================================

-- 1. TABLE CREATION
-- ================

-- Drop tables if they exist (for clean execution)
DROP TABLE participated CASCADE CONSTRAINTS;
DROP TABLE owns CASCADE CONSTRAINTS;
DROP TABLE accident CASCADE CONSTRAINTS;
DROP TABLE car CASCADE CONSTRAINTS;
DROP TABLE person CASCADE CONSTRAINTS;

-- Create PERSON table
CREATE TABLE person (
    driver_id NUMBER(10) PRIMARY KEY,
    name VARCHAR2(50) NOT NULL,
    address VARCHAR2(100)
);

-- Create CAR table  
CREATE TABLE car (
    license VARCHAR2(20) PRIMARY KEY,
    model VARCHAR2(30) NOT NULL,
    year NUMBER(4)
);

-- Create ACCIDENT table
CREATE TABLE accident (
    report_number NUMBER(10) PRIMARY KEY,
    date_acc DATE NOT NULL,
    location VARCHAR2(100)
);

-- Create OWNS table (relationship between person and car)
CREATE TABLE owns (
    driver_id NUMBER(10),
    license VARCHAR2(20),
    PRIMARY KEY (driver_id, license),
    FOREIGN KEY (driver_id) REFERENCES person(driver_id),
    FOREIGN KEY (license) REFERENCES car(license)
);

-- Create PARTICIPATED table (relationship between person, car, and accident)
CREATE TABLE participated (
    driver_id NUMBER(10),
    license VARCHAR2(20),
    report_number NUMBER(10),
    damage_amount NUMBER(10,2),
    PRIMARY KEY (driver_id, license, report_number),
    FOREIGN KEY (driver_id) REFERENCES person(driver_id),
    FOREIGN KEY (license) REFERENCES car(license),
    FOREIGN KEY (report_number) REFERENCES accident(report_number)
);

-- 2. DATA INSERTION (5 records each)
-- =================================

-- Insert data into PERSON table
INSERT INTO person VALUES (1001, 'John Smith', '123 Main St, New York');
INSERT INTO person VALUES (1002, 'Sarah Johnson', '456 Oak Ave, Los Angeles');
INSERT INTO person VALUES (1003, 'Mike Wilson', '789 Pine Rd, Chicago');
INSERT INTO person VALUES (1004, 'Lisa Brown', '321 Elm St, Houston');
INSERT INTO person VALUES (1005, 'David Davis', '654 Maple Dr, Phoenix');

-- Insert data into CAR table
INSERT INTO car VALUES ('ABC123', 'Toyota Camry', 1988);
INSERT INTO car VALUES ('XYZ789', 'Honda Civic', 1989);
INSERT INTO car VALUES ('DEF456', 'Mazda 626', 1987);
INSERT INTO car VALUES ('GHI012', 'Ford Escort', 1989);
INSERT INTO car VALUES ('JKL345', 'Nissan Sentra', 1990);

-- Insert data into ACCIDENT table
INSERT INTO accident VALUES (2001, DATE '1989-03-15', 'Highway 101, Mile 25');
INSERT INTO accident VALUES (2002, DATE '1989-07-22', 'Main St & Oak Ave Intersection');
INSERT INTO accident VALUES (2003, DATE '1988-11-10', 'Interstate 95, Exit 12');
INSERT INTO accident VALUES (2004, DATE '1989-12-05', 'Pine Rd & Elm St Corner');
INSERT INTO accident VALUES (2005, DATE '1990-02-18', 'Downtown Parking Lot');
INSERT INTO accident VALUES (2006, '02-Mar-1996', 'Downtown Ai Lot');

-- Insert data into OWNS table
INSERT INTO owns VALUES (1001, 'ABC123');
INSERT INTO owns VALUES (1001, 'DEF456');  -- John Smith owns Mazda
INSERT INTO owns VALUES (1002, 'XYZ789');
INSERT INTO owns VALUES (1003, 'GHI012');
INSERT INTO owns VALUES (1004, 'JKL345');

-- Insert data into PARTICIPATED table
INSERT INTO participated VALUES (1001, 'ABC123', 2001, 2500.00);
INSERT INTO participated VALUES (1001, 'DEF456', 2002, 3200.00);  -- John Smith's Mazda in accident
INSERT INTO participated VALUES (1002, 'XYZ789', 2002, 1800.00);
INSERT INTO participated VALUES (1003, 'GHI012', 2004, 4100.00);
INSERT INTO participated VALUES (1004, 'JKL345', 2005, 2900.00);

-- Commit the data
COMMIT;

-- 3. SHOW RESULTS (Display all tables data)
-- ==========================================

SELECT * FROM person;
SELECT * FROM car;
SELECT * FROM accident;
SELECT * FROM owns;
SELECT * FROM participated;

select count (distinct P.driver_id) as counted from participated P, accident A where A.report_number = P.report_number and A.date_acc >= '01-Jan-1989' and A.date_acc <= '31-Dec-1989';

select count (distinct A.report_number) as counted from participated P, accident A, person Pe where A.report_number = P.report_number and P.driver_id = Pe.driver_id and Pe.name = 'John Smith';

delete from Person P where P.name = 'John Smith' and exists (
    select * from Owns O, Car C
    where O.driver_id = P.driver_id and
    C.license = O.license and
    C.model = 'Mazda'
);

update participated set damage_amount = 3000 where license = 'AABB2000' and report_number = 'AR2197';