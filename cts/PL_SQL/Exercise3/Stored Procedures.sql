CREATE TABLE SavingsAccount(
    Account_ID NUMBER,
    Customer_Name VARCHAR2(50),
    Balance NUMBER
);

INSERT INTO SavingsAccount VALUES(101,'John',10000);

INSERT INTO SavingsAccount VALUES(102,'Mary',20000);

COMMIT;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
AS

BEGIN


UPDATE SavingsAccount

SET Balance = Balance + (Balance * 0.01);


COMMIT;


DBMS_OUTPUT.PUT_LINE('Monthly interest processed');


END;
/

BEGIN

ProcessMonthlyInterest;

END;
/

SELECT * FROM SavingsAccount;