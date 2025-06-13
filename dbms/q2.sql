DROP TABLE Employee CASCADE CONSTRAINTS;
DROP TABLE Company CASCADE CONSTRAINTS;

-- Create COMPANY table (referenced table must be created first)
CREATE TABLE Company (
  company_name VARCHAR2(50) PRIMARY KEY,
  city VARCHAR2(30) NOT NULL
);

-- Create EMPLOYEE table
CREATE TABLE Employee (
  person_name VARCHAR2(50) PRIMARY KEY,
  street VARCHAR2(50),
  city VARCHAR2(30),
  company_name VARCHAR2(50),
  salary NUMBER(10,2),
  manager_name VARCHAR2(50),
  FOREIGN KEY (company_name) REFERENCES Company(company_name),
  FOREIGN KEY (manager_name) REFERENCES Employee(person_name)
);

-- Insert 4 records into COMPANY table
INSERT INTO Company VALUES ('First Bank Corporation', 'New York');
INSERT INTO Company VALUES ('Small Bank Corporation', 'Boston');
INSERT INTO Company VALUES ('Tech Solutions Inc', 'San Francisco');
INSERT INTO Company VALUES ('Global Finance Ltd', 'Chicago');

-- Insert 10 records into EMPLOYEE table
-- Insert managers first (to satisfy foreign key constraints)
INSERT INTO Employee VALUES ('John Manager', '123 Wall St', 'New York', 'First Bank Corporation', 75000.00, NULL);
INSERT INTO Employee VALUES ('Sarah Boss', '456 State St', 'Boston', 'Small Bank Corporation', 65000.00, NULL);
INSERT INTO Employee VALUES ('Mike Director', '789 Market St', 'San Francisco', 'Tech Solutions Inc', 80000.00, NULL);
INSERT INTO Employee VALUES ('Lisa Chief', '321 Lake St', 'Chicago', 'Global Finance Ltd', 85000.00, NULL);

-- Insert regular employees
INSERT INTO Employee VALUES ('Alice Smith', '234 Wall St', 'New York', 'First Bank Corporation', 45000.00, 'John Manager');
INSERT INTO Employee VALUES ('Bob Johnson', '567 Broadway', 'New York', 'First Bank Corporation', 52000.00, 'John Manager');
INSERT INTO Employee VALUES ('Carol Wilson', '890 Main St', 'Boston', 'Small Bank Corporation', 38000.00, 'Sarah Boss');
INSERT INTO Employee VALUES ('David Brown', '432 Oak Ave', 'Boston', 'Small Bank Corporation', 41000.00, 'Sarah Boss');
INSERT INTO Employee VALUES ('Eve Davis', '765 Pine St', 'San Francisco', 'Tech Solutions Inc', 68000.00, 'Mike Director');
INSERT INTO Employee VALUES ('Frank Miller', '198 Elm St', 'Chicago', 'Global Finance Ltd', 72000.00, 'Lisa Chief');

SELECT * FROM Company;
SELECT * FROM Employee;



select * from Employee where company_name != 'First Bank Corporation';

update Employee set salary = (salary + 0.1 * salary) where company_name = 'First Bank Corporation' and manager_name is null;
 
create view Employer as select manager_name, avg(salary) as aver from Employee where manager_name is not null group by manager_name;

select * from Employee where salary > (select MAX(salary) from Employee where company_name = 'Small Bank Corporation' ) and company_name != 'Small Bank Corporation';