-- 현재 구성된 테이블 보기 : SELECR * FROM TAB;
-- 테이블 구조(스키마) 보기 : DESC 테이블이름;
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
 
 --MEMBER02, MEMBER TABLE  삭제
 DROP TABLE MEMBER02;
 DROP TABLE MEMBER04;
 
 --테이블 복사 
 --MEMBER01 테이블의 구조와 내용을 복사해서 C_MEM01 테이블을 만들자
 CREATE TABLE C_MEM01 AS SELECT * FROM MEMBER01 ;
  --MEMBER01 테이블의 구조만 복사해서 C_MEM02 테이블을 만들자
 CREATE TABLE C_MEM02 AS SELECT * FROM MEMBER01 WHERE 1 = 2;  
 

INSERT INTO MEMBER01 VALUES(1, 'HONG', 'H111', '홍길동', 24, SYSDATE); 
COMMIT;
SELECT * FROM MEMBER01;

-- 고객테이블 (고객아이디(PK),고객이름, 나이, 등급,직업, 적립금)
-- 나중에 PK 넣기
CREATE TABLE 고객테이블(
 고객아이디 VARCHAR2(50),
 고객이름 VARCHAR2(50),
 나이 NUMBER,
 등급 VARCHAR2(50),
 직업 VARCHAR2(50),
 적립금 NUMBER
);

--BOOK 테이블 만들기
--도서번호(bookid,pk), 도서이름(bookname,90), 출판사 (publisher,50)가격( price,7)
CREATE TABLE BOOK(
BOOKID NUMBER NOT NULL PRIMARY KEY,
BOOKNAME VARCHAR2(90),
PUBLISHER VARCHAR2(50),
PRICE VARCHAR2(7)
);

ALTER TABLE MEMBER01 ADD M_AADR VARCHAR2(100) ;
 COMMIT;    
 ALTER TABLE MEMBER01 ADD M_AADR2 VARCHAR2(100) DEFAULT '서울';
COMMIT;

ALTER TABLE MEMBER01 DROP COLUMN M_AADR;
COMMIT;
ALTER TABLE MEMBER01 DROP COLUMN M_AADR2;
COMMIT;

ALTER TABLE MEMBER01 MODIFY M_AADR VARCHAR2(50)  ;
   COMMIT;
   
ALTER TABLE MEMBER01 ADD M_ADDR VARCHAR2(100) ;
COMMIT;    
ALTER TABLE MEMBER01 ADD M_ADDR2 VARCHAR2(100) DEFAULT '서울';
COMMIT;


ALTER TABLE MEMBER01 MODIFY M_ADDR VARCHAR2(50)  ;
   COMMIT;


ALTER TABLE MEMBER01 ADD M_ADDR VARCHAR2(100) ;
COMMIT;    
ALTER TABLE MEMBER01 ADD M_ADDR2 VARCHAR2(100) DEFAULT '서울';
COMMIT;
ALTER TABLE MEMBER01 ADD M_ADDR VARCHAR2(100) ;
ALTER TABLE MEMBER01 ADD M_ADDR2 VARCHAR2(100) DEFAULT '서울';
ALTER TABLE MEMBER01 ADD M_ADDR NUMBER(7,0) ;
ALTER TABLE MEMBER01 MODIFY M_ADDR NUMBER(7,0);
INSERT INTO MEMBER01
VALUES(2, 'KIM', 'K111','김둘리', '20', SYSDATE,02,'서울' );

INSERT INTO MEMBER01
VALUES(3, 'PARK', 'P111','박꺽정',NULL, NULL,02,'서울' );
ROLLBACK;

INSERT INTO MEMBER01
VALUES(4, 'LEE', 'L111','이지매',NULL, '2023/01/22',02,'서울' );

-- 속성이 NOT NUILL은 반드시 값을 넣어야 한다.
INSERT INTO MEMBER01(IDX)
VALUES(5);
commit;

INSERT INTO MEMBER01(IDX, M_ID, M_NAME, M_PW)
VALUES(6, 'KANG', '강동원', 'K111');
commit;
ROLLBACK;
ROLLBACK;

INSERT INTO 고객테이블(고객아이디, 고객이름, 나이, 등급, 직업, 적립금)
VALUES('apple', '정소화', 20, 'gold' , '학생', 1000);

INSERT INTO 고객테이블(고객아이디, 고객이름, 나이, 등급, 직업, 적립금)
VALUES('banana', '김선우', 25, 'vip' , '간호사', 2500);

INSERT INTO 고객테이블(고객아이디, 고객이름, 나이, 등급, 직업, 적립금)
VALUES('carrot', '고명석', 28, 'gold' , '교사', 4500);

INSERT INTO 고객테이블(고객아이디, 고객이름, 나이, 등급, 직업, 적립금)
VALUES('orange', '김용욱', 22, 'silver' , '학생', 0);

INSERT INTO 고객테이블(고객아이디, 고객이름, 나이, 등급, 직업, 적립금)
VALUES('melon', '성원용', 35, 'gold' , '회사원', 5000);

INSERT INTO 고객테이블(고객아이디, 고객이름, 나이, 등급, 직업, 적립금)
VALUES('pear', '채광주', 31, 'silver' , '회사원', 500);

INSERT INTO 고객테이블(고객아이디, 고객이름, 나이, 등급, 직업, 적립금)
VALUES('peach', '오형준', NULL, 'silver' , '의사', 300);
commit;
INSERT INTO 고객테이블(고객아이디, 고객이름, 등급, 직업, 적립금)
VALUES('peach1', '오형준1','silver1' , '의사1', 3001);
rollback;
select *from 고객테이블;


CREATE TABLE 제품테이블(
 제품번호 VARCHAR2(50),
 제품명 VARCHAR2(50),
 재고량 NUMBER,
 당가 number,
 제조업체 VARCHAR2(50)
);

ALTER TABLE MEMBER01 MODIFY 제품번호 PRIMARY KEY;

DROP TABLE 제품테이블;

CREATE TABLE 제품테이블(
 제품번호 VARCHAR2(50) NOT NULL PRIMARY KEY,
 제품명 VARCHAR2(50),
 재고량 NUMBER,
 당가 number,
 제조업체 VARCHAR2(50)
);
DROP TABLE 제품테이블;


CREATE TABLE 제품테이블(
 제품번호 VARCHAR2(50) NOT NULL PRIMARY KEY,
 제품명 VARCHAR2(50),
 재고량 NUMBER,
 단가 NUMBER,
 제조업체 VARCHAR2(50)
);
INSERT INTO 제품테이블(제품번호, 제품명, 재고량, 단가, 제조업체)
VALUES('p01', '그냥만두',5000, 4500, '대한식품');

INSERT INTO 제품테이블(제품번호, 제품명, 재고량, 단가, 제조업체)
VALUES('p02', '매운쫄면', 2500,5500, '민국푸드');

INSERT INTO 제품테이블(제품번호, 제품명, 재고량, 단가, 제조업체)
VALUES('p03', '쿵떡파이',3600,2600, '한빛제과');

INSERT INTO 제품테이블(제품번호, 제품명, 재고량, 단가, 제조업체)
VALUES('p04', '맛난초콜릿',1250,2500, '한빛제과');

INSERT INTO 제품테이블(제품번호, 제품명, 재고량, 단가, 제조업체)
VALUES('p05', '얼큰라면',2200, 1200, '대한식품');

INSERT INTO 제품테이블(제품번호, 제품명, 재고량, 단가, 제조업체)
VALUES('p06', '통통우동',1000, 1550, '민국푸드');

INSERT INTO 제품테이블(제품번호, 제품명, 재고량, 단가, 제조업체)
VALUES('p07', '달콤비슷킷',1650, 1500, '한빛제과');
COMMIT;



CREATE TABLE 주문테이블(
 주문번호 VARCHAR2(50) NOT NULL PRIMARY KEY,
 주문고객 VARCHAR2(50),
 주문제품 VARCHAR2(50),
 수량 NUMBER,
 배송지 VARCHAR2(50),
 주문일자 VARCHAR2(50)
);

INSERT INTO 주문테이블(주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자)
VALUES('o01', 'apple','p03', 10, '서울시 마포구', '2022-01-01');

INSERT INTO 주문테이블(주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자)
VALUES('o02', 'melon','p01', 5, '인천시 계양구', '2022-01-10');

INSERT INTO 주문테이블(주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자)
VALUES('o03', 'banana','p06', 45, '경기도 부천시', '2022-01-01');

DROP TABLE 주문테이블;
CREATE TABLE 주문테이블(
 주문번호 VARCHAR2(50) NOT NULL PRIMARY KEY,
 주문고객 VARCHAR2(50),
 주문제품 VARCHAR2(50),
 수량 NUMBER,
 배송지 VARCHAR2(50),
 주문일자 date
);
INSERT INTO 주문테이블(주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자)
VALUES('o01', 'apple','p03', 10, '서울시 마포구', '2022-01-01');

INSERT INTO 주문테이블(주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자)
VALUES('o02', 'melon','p01', 5, '인천시 계양구', '2022-01-10');

INSERT INTO 주문테이블(주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자)
VALUES('o03', 'banana','p06', 45, '경기도 부천시', '2022-01-01');
commit;

INSERT INTO 주문테이블(주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자)
VALUES('o04', 'carrot','p02', 8, '부산시 금정구', '2022-02-01');

INSERT INTO 주문테이블(주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자)
VALUES('o05', 'melon','p06', 36, '경기도 용인시', '2022-02-20');

INSERT INTO 주문테이블(주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자)
VALUES('o06', 'banana','p01', 19, '충청북도 보은군', '2022-03-02');

INSERT INTO 주문테이블(주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자)
VALUES('o07', 'apple','p03', 22, '서울시 영등포구', '2022-03-15');

commit;

INSERT INTO 주문테이블(주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자)
VALUES('o08', 'pear','p02', 50, '강원도 춘천시', '2022-04-10');

INSERT INTO 주문테이블(주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자)
VALUES('o09', 'banana','p04', 15, '전라남도 목포시', '2022-04-11');

INSERT INTO 주문테이블(주문번호, 주문고객, 주문제품, 수량, 배송지, 주문일자)
VALUES('o10', 'carrot','p03', 20, '경기도 안양시', '2022-05-22');
commit;

delete from 제품테이블 where 제조업체 = '한빛제과';
delete from 제품테이블 where 제조업체 = '민국푸드' and 단가 <=3000;
rollback;

update 제품테이블 set 제조업체 ='대한푸드';
update 제품테이블 set 제조업체 ='한빛제과' where 단가 >=2000;

update 제품테이블 set 제조업체 ='대한식품', 재고량 = 10000 where 제품번호 = 'p01' or 제품번호 = 'p05';
rollback;
update 제품테이블 set 제품명 ='통큰파이';
rollback;
update 제품테이블 set 제품명 ='통큰파이' where 제품번호 ='p03' ;
update 제품테이블 set 단가 = 단가*1.1 ; 
rollback;
update 제품테이블 set 단가 = 단가*1.1 ; 

delete from 주문테이블 where 주문일자 = '2022-05-22';
delete from 주문테이블 where 주문일자 = '2022-03-01' and 주문일자 = '2022-03-31' and 주문일자 = '2022-04-01' and 주문일자 = '2022-04-30';
delete from 주문테이블 where 주문일자 = '2022-03-01' or 주문일자 = '2022-03-31' or 주문일자 = '2022-04-01' or 주문일자 = '2022-04-30';
delete from 주문테이블 where 주문일자 >= '2022-03-01' and 주문일자 <= '2022-04-30';

update 주문테이블 set 주문일자 = 주문일자 +5;
rollback;