 create table User_master
 (
 userid number(4),
 username varchar2(20),
 password varchar2(20)
 );
insert into User_master values(1,'kathir','kathir123');
insert into User_master values(2,'sengu','sengu123');


CREATE TABLE department
(
dept_id NUMBER(2) PRIMARY KEY,
dept_Name VARCHAR2(50)
);
INSERT INTO department VALUES(10,'CLERK');
INSERT INTO department VALUES(20,'SALESMAN');
INSERT INTO department VALUES(30,'MANAGER');
INSERT INTO department VALUES(40,'ANALYST');


CREATE TABLE GRADE_MASTER
(
grade_code VARCHAR2(2) PRIMARY KEY,
description VARCHAR2(10),
min_salary NUMBER,
max_salary NUMBER
);


INSERT INTO GRADE_MASTER VALUES('M1','PAY_SCALE',10000,15000);
INSERT INTO GRADE_MASTER VALUES('M2','PAY_SCALE',9000,10000);
INSERT INTO GRADE_MASTER VALUES('M3','PAY_SCALE',8000,9000);
INSERT INTO GRADE_MASTER VALUES('M4','PAY_SCALE',6000,7000);
INSERT INTO GRADE_MASTER VALUES('M5','PAY_SCALE',4O00,5000);
INSERT INTO GRADE_MASTER VALUES('M6','PAY_SCALE',2000,3000);
INSERT INTO GRADE_MASTER VALUES('M7','PAY_SCALE',1000,2000);


SELECT * FROM EMPLOYEE;
DESC EMPLOYEE;
DROP TABLE EMPLOYEE;

CREATE TABLE EMPLOYEE
(
Emp_ID VARCHAR2(6) PRIMARY KEY, 
Emp_First_Name VARCHAR2(25), 
Emp_Last_Name VARCHAR2(25), 
Emp_Date_of_Birth DATE, 
Emp_Date_of_Joining DATE, 
Emp_Dept_ID NUMBER(20) REFERENCES DEPARTMENT(DEPT_ID), 
Emp_Grade VARCHAR2(2) REFERENCES GRADE_MASTER(GRADE_CODE), 
Emp_Designation VARCHAR2(50), 
Emp_Basic NUMBER, 
Emp_Gender VARCHAR2(1), 
Emp_Marital_Status VARCHAR2(15), 
Emp_Home_Address VARCHAR2(100), 
Emp_Contact_Num VARCHAR2(15)
);
DESC EMPLOYEE;
CREATE SEQUENCE EMPIDSEQ START WITH 100000;