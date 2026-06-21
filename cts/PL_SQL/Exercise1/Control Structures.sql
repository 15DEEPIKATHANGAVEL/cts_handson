SET SERVEROUTPUT ON;
CREATE TABLE Customers(
    Customer_ID NUMBER,
    Name VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER,
    Loan_Interest NUMBER,
    IsVIP VARCHAR2(10)
);


CREATE TABLE Loans(
    Loan_ID NUMBER,
    Customer_ID NUMBER,
    Due_Date DATE
);
INSERT INTO Customers VALUES(1,'John',65,15000,8,'FALSE');

INSERT INTO Customers VALUES(2,'Mary',45,5000,9,'FALSE');

INSERT INTO Customers VALUES(3,'Alex',70,20000,7,'FALSE');


INSERT INTO Loans VALUES(101,1,SYSDATE+10);

INSERT INTO Loans VALUES(102,2,SYSDATE+40);

INSERT INTO Loans VALUES(103,3,SYSDATE+20);


COMMIT;
DECLARE

BEGIN

FOR customer IN (SELECT Customer_ID, Age 
                 FROM Customers)

LOOP

IF customer.Age > 60 THEN

UPDATE Customers
SET Loan_Interest = Loan_Interest - 1
WHERE Customer_ID = customer.Customer_ID;

END IF;

END LOOP;


COMMIT;

DBMS_OUTPUT.PUT_LINE('Interest discount applied');

END;
/
SELECT * FROM Customers;