
CREATE TABLE BOARDMEMBER(
    ID VARCHAR2(20) PRIMARY KEY,
    PW VARCHAR2(20)
);

CREATE TABLE BOARD(
    BOARDSEQ VARCHAR2(30) PRIMARY KEY,
    ID VARCHAR2(20),
    BOARDTITLE VARCHAR2(60),
    BOARDCONTENT VARCHAR2(3000),
    INDATE DATE,
    HITCOUNT NUMBER,
    FOREIGN KEY(ID) REFERENCES BOARDMEMBER(ID)
);

CREATE SEQUENCE BOARDSEQ;