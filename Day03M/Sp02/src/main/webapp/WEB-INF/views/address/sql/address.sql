alter session set "_oracle_script"=true;
create user spring identified by java;
grant connect, resource, unlimited tablespace to spring;
conn spring/java;


drop table ADDRESS;
drop sequence ADDRESS_SEQ;

create table ADDRESS(
   SEQ number constraint ADDRESS_PK primary key, 
   NAME varchar2(10), 
   ADDR varchar2(20), 
   RDATE date
); 
create sequence ADDRESS_SEQ increment by 1 start with 1 nocache;

insert into ADDRESS values(ADDRESS_SEQ.nextval, '홍길동', '서울시', SYSDATE);
insert into ADDRESS values(ADDRESS_SEQ.nextval, '이순신', '부산시', SYSDATE);
insert into ADDRESS values(ADDRESS_SEQ.nextval, '강감찬', '인천시', SYSDATE);
insert into ADDRESS values(ADDRESS_SEQ.nextval, '유관순', '광주시', SYSDATE);

commit;

select CONSTRAINT_NAME, CONSTRAINT_TYPE from user_constraints where TABLE_NAME='ADDRESS';
select * from ADDRESS;