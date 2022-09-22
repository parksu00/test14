drop table product;
create table product(
    pid  number(10),
    pname       varchar(30),
    count    number(10),
    price       number(10)
);
--기본키
alter table product add constraint product_pid_pk primary key(pid);

--시퀀스생성
drop sequence product_pid_seq;
create sequence product_pid_seq;


--생성--
insert into product(pid,pname,count,price)
     values(product_pid_seq.nextval, '사과박스', 5, 20000);

insert into product(pid,pname,count,price)
     values(product_pid_seq.nextval, '수박', 1, 10000);

insert into product(pid,pname,count,price)
     values(product_pid_seq.nextval, '블루베리', 1, 3000);

--조회--
select pid, pname, count, price
  from product
 where pid = 2;

--수정--
update product
   set pname = '체리',
       count = 1,
       price = 20000;

--삭제
delete from product where pid = 1;

--전체조회-
select pid,pname,count,price from product;

commit;