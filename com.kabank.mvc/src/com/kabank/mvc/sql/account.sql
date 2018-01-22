create sequence customer_num start with 1000;
drop table kakao;
select * from account;
select * from tab;
create table account(
	customer_num decimal primary key,
	account_num varchar2(20),
	money varchar2(20) default 0,
	userid varchar2(20),
	foreign key(userid) references member(userid)
);


insert into account(customer_num,account_num,money,userid)
values(customer_num.nextval, '1234-5678',0, 'kim' );
delete from account where userid = 'kim';

CREATE TABLE Reservation(
  res_seq DECIMAL,
  res_date VARCHAR2(10),
  multi_seq DECIMAL,
  theater_no DECIMAL,
  con_no DECIMAL,
  seat_no VARCHAR2(5),
  PRIMARY KEY(res_seq),
  FOREIGN KEY(multi_seq) REFERENCES Multiplex(multi_seq),
  FOREIGN KEY(theater_no) REFERENCES Theater(theater_no),
  FOREIGN KEY(con_no) REFERENCES Consumer(con_no)
);


