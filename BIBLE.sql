-- ���� ������ ���̺� ���� : SELECR * FROM TAB;
-- ���̺� ����(��Ű��) ���� : DESC ���̺��̸�;
SELECT * FROM TAB;

CREATE TABLE MEMBER01(
 IDX NUMBER NOT NULL PRIMARY KEY,
 M_ID VARCHAR(50),
 M_PW VARCHAR(50),
 M_NAME VARCHAR(50),
 M_AGE NUMBER(3),
 M_REG DATE
 );
 DESC MEMBER01;
 
 
 CREATE TABLE MEMBER02(
 IDX NUMBER NOT NULL,
 M_ID VARCHAR(50),
 M_PW VARCHAR(50),
 M_NAME VARCHAR(50),
 M_AGE NUMBER(3),
 M_REG DATE,
 PRIMARY KEY(IDX)
 );
 
 CREATE TABLE MEMBER03(
 IDX NUMBER NOT NULL PRIMARY KEY,
 M_ID VARCHAR(50)NOT NULL PRIMARY KEY,
 M_PW VARCHAR(50),
 M_NAME VARCHAR(50),
 M_AGE NUMBER(3),
 M_REG DATE
 );
  
 CREATE TABLE MEMBER04(
 IDX NUMBER NOT NULL,
 M_ID VARCHAR(50)NOT NULL,
 M_PW VARCHAR(50),
 M_NAME VARCHAR(50),
 M_AGE NUMBER(3),
 M_REG DATE,
 PRIMARY KEY(IDX, M_ID)
 );
 
 --MEMBER02, MEMBER TABLE  ����
 DROP TABLE MEMBER02;
 DROP TABLE MEMBER04;
 
 --���̺� ���� 
 --MEMBER01 ���̺��� ������ ������ �����ؼ� C_MEM01 ���̺��� ������
 CREATE TABLE C_MEM01 AS SELECT * FROM MEMBER01 ;
  --MEMBER01 ���̺��� ������ �����ؼ� C_MEM02 ���̺��� ������
 CREATE TABLE C_MEM02 AS SELECT * FROM MEMBER01 WHERE 1 = 2;  
 

INSERT INTO MEMBER01 VALUES(1, 'HONG', 'H111', 'ȫ�浿', 24, SYSDATE); 
COMMIT;
SELECT * FROM MEMBER01;

-- �����̺� (�����̵�(PK),���̸�, ����, ���,����, ������)
-- ���߿� PK �ֱ�
CREATE TABLE �����̺�(
 �����̵� VARCHAR2(50),
 ���̸� VARCHAR2(50),
 ���� NUMBER,
 ��� VARCHAR2(50),
 ���� VARCHAR2(50),
 ������ NUMBER
);

--BOOK ���̺� �����
--������ȣ(bookid,pk), �����̸�(bookname,90), ���ǻ� (publisher,50)����( price,7)
CREATE TABLE BOOK(
BOOKID NUMBER NOT NULL PRIMARY KEY,
BOOKNAME VARCHAR2(90),
PUBLISHER VARCHAR2(50),
PRICE VARCHAR2(7)
);

ALTER TABLE MEMBER01 ADD M_AADR VARCHAR2(100) ;
 COMMIT;    
 ALTER TABLE MEMBER01 ADD M_AADR2 VARCHAR2(100) DEFAULT '����';
COMMIT;

ALTER TABLE MEMBER01 DROP COLUMN M_AADR;
COMMIT;
ALTER TABLE MEMBER01 DROP COLUMN M_AADR2;
COMMIT;

ALTER TABLE MEMBER01 MODIFY M_AADR VARCHAR2(50)  ;
   COMMIT;
   
ALTER TABLE MEMBER01 ADD M_ADDR VARCHAR2(100) ;
COMMIT;    
ALTER TABLE MEMBER01 ADD M_ADDR2 VARCHAR2(100) DEFAULT '����';
COMMIT;


ALTER TABLE MEMBER01 MODIFY M_ADDR VARCHAR2(50)  ;
   COMMIT;


ALTER TABLE MEMBER01 ADD M_ADDR VARCHAR2(100) ;
COMMIT;    
ALTER TABLE MEMBER01 ADD M_ADDR2 VARCHAR2(100) DEFAULT '����';
COMMIT;
ALTER TABLE MEMBER01 ADD M_ADDR VARCHAR2(100) ;
ALTER TABLE MEMBER01 ADD M_ADDR2 VARCHAR2(100) DEFAULT '����';
ALTER TABLE MEMBER01 ADD M_ADDR NUMBER(7,0) ;
ALTER TABLE MEMBER01 MODIFY M_ADDR NUMBER(7,0);
INSERT INTO MEMBER01
VALUES(2, 'KIM', 'K111','��Ѹ�', '20', SYSDATE,02,'����' );

INSERT INTO MEMBER01
VALUES(3, 'PARK', 'P111','�ڲ���',NULL, NULL,02,'����' );
ROLLBACK;

INSERT INTO MEMBER01
VALUES(4, 'LEE', 'L111','������',NULL, '2023/01/22',02,'����' );

-- �Ӽ��� NOT NUILL�� �ݵ�� ���� �־�� �Ѵ�.
INSERT INTO MEMBER01(IDX)
VALUES(5);
commit;

INSERT INTO MEMBER01(IDX, M_ID, M_NAME, M_PW)
VALUES(6, 'KANG', '������', 'K111');
commit;
ROLLBACK;
ROLLBACK;

INSERT INTO �����̺�(�����̵�, ���̸�, ����, ���, ����, ������)
VALUES('apple', '����ȭ', 20, 'gold' , '�л�', 1000);

INSERT INTO �����̺�(�����̵�, ���̸�, ����, ���, ����, ������)
VALUES('banana', '�輱��', 25, 'vip' , '��ȣ��', 2500);

INSERT INTO �����̺�(�����̵�, ���̸�, ����, ���, ����, ������)
VALUES('carrot', '���', 28, 'gold' , '����', 4500);

INSERT INTO �����̺�(�����̵�, ���̸�, ����, ���, ����, ������)
VALUES('orange', '����', 22, 'silver' , '�л�', 0);

INSERT INTO �����̺�(�����̵�, ���̸�, ����, ���, ����, ������)
VALUES('melon', '������', 35, 'gold' , 'ȸ���', 5000);

INSERT INTO �����̺�(�����̵�, ���̸�, ����, ���, ����, ������)
VALUES('pear', 'ä����', 31, 'silver' , 'ȸ���', 500);

INSERT INTO �����̺�(�����̵�, ���̸�, ����, ���, ����, ������)
VALUES('peach', '������', NULL, 'silver' , '�ǻ�', 300);
commit;
INSERT INTO �����̺�(�����̵�, ���̸�, ���, ����, ������)
VALUES('peach1', '������1','silver1' , '�ǻ�1', 3001);
rollback;
select *from �����̺�;


CREATE TABLE ��ǰ���̺�(
 ��ǰ��ȣ VARCHAR2(50),
 ��ǰ�� VARCHAR2(50),
 ��� NUMBER,
 �簡 number,
 ������ü VARCHAR2(50)
);

ALTER TABLE MEMBER01 MODIFY ��ǰ��ȣ PRIMARY KEY;

DROP TABLE ��ǰ���̺�;

CREATE TABLE ��ǰ���̺�(
 ��ǰ��ȣ VARCHAR2(50) NOT NULL PRIMARY KEY,
 ��ǰ�� VARCHAR2(50),
 ��� NUMBER,
 �簡 number,
 ������ü VARCHAR2(50)
);
DROP TABLE ��ǰ���̺�;


CREATE TABLE ��ǰ���̺�(
 ��ǰ��ȣ VARCHAR2(50) NOT NULL PRIMARY KEY,
 ��ǰ�� VARCHAR2(50),
 ��� NUMBER,
 �ܰ� NUMBER,
 ������ü VARCHAR2(50)
);
INSERT INTO ��ǰ���̺�(��ǰ��ȣ, ��ǰ��, ���, �ܰ�, ������ü)
VALUES('p01', '�׳ɸ���',5000, 4500, '���ѽ�ǰ');

INSERT INTO ��ǰ���̺�(��ǰ��ȣ, ��ǰ��, ���, �ܰ�, ������ü)
VALUES('p02', '�ſ��̸�', 2500,5500, '�α�Ǫ��');

INSERT INTO ��ǰ���̺�(��ǰ��ȣ, ��ǰ��, ���, �ܰ�, ������ü)
VALUES('p03', '��������',3600,2600, '�Ѻ�����');

INSERT INTO ��ǰ���̺�(��ǰ��ȣ, ��ǰ��, ���, �ܰ�, ������ü)
VALUES('p04', '�������ݸ�',1250,2500, '�Ѻ�����');

INSERT INTO ��ǰ���̺�(��ǰ��ȣ, ��ǰ��, ���, �ܰ�, ������ü)
VALUES('p05', '��ū���',2200, 1200, '���ѽ�ǰ');

INSERT INTO ��ǰ���̺�(��ǰ��ȣ, ��ǰ��, ���, �ܰ�, ������ü)
VALUES('p06', '����쵿',1000, 1550, '�α�Ǫ��');

INSERT INTO ��ǰ���̺�(��ǰ��ȣ, ��ǰ��, ���, �ܰ�, ������ü)
VALUES('p07', '���޺��Ŷ',1650, 1500, '�Ѻ�����');
COMMIT;



CREATE TABLE �ֹ����̺�(
 �ֹ���ȣ VARCHAR2(50) NOT NULL PRIMARY KEY,
 �ֹ��� VARCHAR2(50),
 �ֹ���ǰ VARCHAR2(50),
 ���� NUMBER,
 ����� VARCHAR2(50),
 �ֹ����� VARCHAR2(50)
);

INSERT INTO �ֹ����̺�(�ֹ���ȣ, �ֹ���, �ֹ���ǰ, ����, �����, �ֹ�����)
VALUES('o01', 'apple','p03', 10, '����� ������', '2022-01-01');

INSERT INTO �ֹ����̺�(�ֹ���ȣ, �ֹ���, �ֹ���ǰ, ����, �����, �ֹ�����)
VALUES('o02', 'melon','p01', 5, '��õ�� ��籸', '2022-01-10');

INSERT INTO �ֹ����̺�(�ֹ���ȣ, �ֹ���, �ֹ���ǰ, ����, �����, �ֹ�����)
VALUES('o03', 'banana','p06', 45, '��⵵ ��õ��', '2022-01-01');

DROP TABLE �ֹ����̺�;
CREATE TABLE �ֹ����̺�(
 �ֹ���ȣ VARCHAR2(50) NOT NULL PRIMARY KEY,
 �ֹ��� VARCHAR2(50),
 �ֹ���ǰ VARCHAR2(50),
 ���� NUMBER,
 ����� VARCHAR2(50),
 �ֹ����� date
);
INSERT INTO �ֹ����̺�(�ֹ���ȣ, �ֹ���, �ֹ���ǰ, ����, �����, �ֹ�����)
VALUES('o01', 'apple','p03', 10, '����� ������', '2022-01-01');

INSERT INTO �ֹ����̺�(�ֹ���ȣ, �ֹ���, �ֹ���ǰ, ����, �����, �ֹ�����)
VALUES('o02', 'melon','p01', 5, '��õ�� ��籸', '2022-01-10');

INSERT INTO �ֹ����̺�(�ֹ���ȣ, �ֹ���, �ֹ���ǰ, ����, �����, �ֹ�����)
VALUES('o03', 'banana','p06', 45, '��⵵ ��õ��', '2022-01-01');
commit;

INSERT INTO �ֹ����̺�(�ֹ���ȣ, �ֹ���, �ֹ���ǰ, ����, �����, �ֹ�����)
VALUES('o04', 'carrot','p02', 8, '�λ�� ������', '2022-02-01');

INSERT INTO �ֹ����̺�(�ֹ���ȣ, �ֹ���, �ֹ���ǰ, ����, �����, �ֹ�����)
VALUES('o05', 'melon','p06', 36, '��⵵ ���ν�', '2022-02-20');

INSERT INTO �ֹ����̺�(�ֹ���ȣ, �ֹ���, �ֹ���ǰ, ����, �����, �ֹ�����)
VALUES('o06', 'banana','p01', 19, '��û�ϵ� ������', '2022-03-02');

INSERT INTO �ֹ����̺�(�ֹ���ȣ, �ֹ���, �ֹ���ǰ, ����, �����, �ֹ�����)
VALUES('o07', 'apple','p03', 22, '����� ��������', '2022-03-15');

commit;

INSERT INTO �ֹ����̺�(�ֹ���ȣ, �ֹ���, �ֹ���ǰ, ����, �����, �ֹ�����)
VALUES('o08', 'pear','p02', 50, '������ ��õ��', '2022-04-10');

INSERT INTO �ֹ����̺�(�ֹ���ȣ, �ֹ���, �ֹ���ǰ, ����, �����, �ֹ�����)
VALUES('o09', 'banana','p04', 15, '���󳲵� ������', '2022-04-11');

INSERT INTO �ֹ����̺�(�ֹ���ȣ, �ֹ���, �ֹ���ǰ, ����, �����, �ֹ�����)
VALUES('o10', 'carrot','p03', 20, '��⵵ �Ⱦ��', '2022-05-22');
commit;

delete from ��ǰ���̺� where ������ü = '�Ѻ�����';
delete from ��ǰ���̺� where ������ü = '�α�Ǫ��' and �ܰ� <=3000;
rollback;

update ��ǰ���̺� set ������ü ='����Ǫ��';
update ��ǰ���̺� set ������ü ='�Ѻ�����' where �ܰ� >=2000;

update ��ǰ���̺� set ������ü ='���ѽ�ǰ', ��� = 10000 where ��ǰ��ȣ = 'p01' or ��ǰ��ȣ = 'p05';
rollback;
update ��ǰ���̺� set ��ǰ�� ='��ū����';
rollback;
update ��ǰ���̺� set ��ǰ�� ='��ū����' where ��ǰ��ȣ ='p03' ;
update ��ǰ���̺� set �ܰ� = �ܰ�*1.1 ; 
rollback;
update ��ǰ���̺� set �ܰ� = �ܰ�*1.1 ; 

delete from �ֹ����̺� where �ֹ����� = '2022-05-22';
delete from �ֹ����̺� where �ֹ����� = '2022-03-01' and �ֹ����� = '2022-03-31' and �ֹ����� = '2022-04-01' and �ֹ����� = '2022-04-30';
delete from �ֹ����̺� where �ֹ����� = '2022-03-01' or �ֹ����� = '2022-03-31' or �ֹ����� = '2022-04-01' or �ֹ����� = '2022-04-30';
delete from �ֹ����̺� where �ֹ����� >= '2022-03-01' and �ֹ����� <= '2022-04-30';

update �ֹ����̺� set �ֹ����� = �ֹ����� +5;
rollback;