create database huashuo;
--产品
--t1.主表1
create table Sale( 
	Sid int , 
	Sname varchar(100), 
	Sstatus int
	)
	
--t2.主表2
create table Type(
	Tid int ,
	Sid int ,
	Tname varchar(100) ,
	Tstatus int
	)
	
--t3.主表3
create table series(
	Seid int,
	Tid int ,
	Sename varchar(100),
	Sestatus int
	)
	
--t3.主表3
--t4.产品表
create table product(
	Pid int ,
	Tid int ,
	Seid int, 
	Pname varchar(100), 
	Pdetails text,
	Pparameter text
	Pprice double(8,2), 
	Pcount int, 
	Pstatus int
	)


--用户
--t5.管理员
create table admin(
	Aid int,
	Aname varchar(20),
	Apwd varchar(500)
	)
	
--t6.客服operator
create table operator(
	Oid int,
	Oname varchar(20) ,
	Opwd varchar(20)
	)
	
--t7.顾客Customer
create table customer(
	Cid int,
	Cname varchar(20),
	Cpwd varchar(20),
	Ctel varchar(11) ,
	Cbirthday date
	)


--t8.流水Bill 要有2个表 -bid=date+cid  did=date+cid+pid
create table bill(
	Bid varchar(100),
	Cid int,Btime date, 
	Btotalprice double(8,2) ,
	Btotalsize int ,
	)

create table detail(
	Did varchar(100),
	Bid varchar(100),
	Pid int ,
	Dcount int,
	Dprice double(8,2)
 )





