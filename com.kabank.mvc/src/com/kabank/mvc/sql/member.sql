select * from member;
alter table member rename column pass to password;
delete from member where id = '%s';
select * from tab;
desc member;
update member set addr = '서울' where id = 'kim';
insert into member(userid,password,name,ssn,phone,email,profile,addr)
values('lee','1','이순신','950101-123456','010-2456-7412','lee@test.com','default-profile.jpg','서울 목동');
select * from member where id like ?;


select 
	m.userid as 아이디,
	m.password as 비번,
	m.name as 이름,
	m.ssn as 주민번호,
	m.phone as 전화번호,
	m.email as 이메일,
	m.profile as 프로필,
	m.addr as 주소,
	a.customer_num as 고객번호,
	a.account_num as 계좌번호,
	a.money as 잔액
from member m, account a
where m.userid = a.userid
order by a.customer_num













