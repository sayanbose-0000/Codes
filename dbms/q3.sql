-- 1. TABLE CREATION

-- Drop tables if they exist (for clean execution)
DROP TABLE Employee CASCADE CONSTRAINTS;
DROP TABLE Company CASCADE CONSTRAINTS;

-- Create COMPANY table (modified to allow companies in multiple cities)
CREATE TABLE Company (
    company_name VARCHAR2(50),
    city VARCHAR2(30),
    PRIMARY KEY (company_name, city)
);

-- Create EMPLOYEE table
CREATE TABLE Employee (
    person_name VARCHAR2(50) PRIMARY KEY,
    street VARCHAR2(50),
    city VARCHAR2(30),
    company_name VARCHAR2(50),
    salary NUMBER(10,2),
    manager_name VARCHAR2(50),
    FOREIGN KEY (manager_name) REFERENCES Employee(person_name)
);

-- 2. DATA INSERTION
-- ================

-- Insert 4+ records into COMPANY table (companies in multiple cities)
INSERT INTO Company VALUES ('First Bank Corporation', 'New York');
INSERT INTO Company VALUES ('First Bank Corporation', 'Boston');
INSERT INTO Company VALUES ('Small Bank Corporation', 'Boston');
INSERT INTO Company VALUES ('Small Bank Corporation', 'Chicago');
INSERT INTO Company VALUES ('Small Bank Corporation', 'Miami');
INSERT INTO Company VALUES ('Tech Solutions Inc', 'San Francisco');
INSERT INTO Company VALUES ('Global Finance Ltd', 'Chicago');

-- Insert 10+ records into EMPLOYEE table
-- Insert managers first (to satisfy foreign key constraints)
INSERT INTO Employee VALUES ('John Manager', '123 Wall St', 'New York', 'First Bank Corporation', 75000.00, NULL);
INSERT INTO Employee VALUES ('Sarah Boss', '456 State St', 'Boston', 'Small Bank Corporation', 65000.00, NULL);
INSERT INTO Employee VALUES ('Mike Director', '789 Market St', 'San Francisco', 'Tech Solutions Inc', 80000.00, NULL);
INSERT INTO Employee VALUES ('Lisa Chief', '321 Lake St', 'Chicago', 'Global Finance Ltd', 85000.00, NULL);

-- Insert regular employees including Jones
INSERT INTO Employee VALUES ('Jones', '234 Oak St', 'Springfield', 'First Bank Corporation', 45000.00, 'John Manager');
INSERT INTO Employee VALUES ('Alice Smith', '567 Wall St', 'New York', 'First Bank Corporation', 52000.00, 'John Manager');
INSERT INTO Employee VALUES ('Bob Johnson', '890 Broadway', 'Boston', 'First Bank Corporation', 48000.00, 'John Manager');
INSERT INTO Employee VALUES ('Carol Wilson', '432 Main St', 'Boston', 'Small Bank Corporation', 38000.00, 'Sarah Boss');
INSERT INTO Employee VALUES ('David Brown', '765 Oak Ave', 'Chicago', 'Small Bank Corporation', 41000.00, 'Sarah Boss');
INSERT INTO Employee VALUES ('Eve Davis', '198 Pine St', 'San Francisco', 'Tech Solutions Inc', 68000.00, 'Mike Director');
INSERT INTO Employee VALUES ('Frank Miller', '654 Elm St', 'Chicago', 'Global Finance Ltd', 72000.00, 'Lisa Chief');
INSERT INTO Employee VALUES ('Grace Lee', '987 Cedar Rd', 'Miami', 'Small Bank Corporation', 43000.00, 'Sarah Boss');

-- Commit the data
COMMIT;


select person_name from employee where salary > (select avg(salary) from employee);


select company_name from (select company_name, sum(salary) as s from employee group by company_name order by sum(salary) where );


select distinct C2.company_name from Company C1, Company C2 where C1.company_name = 'Small Bank Corporation' and C2.city = C1.city;