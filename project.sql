show databases;
create database revature;
use revature;
show tables;
create table e_web_details(uname varchar(250) , password varchar(250), role varchar(250) default "user");
create table items (itemId int(2), itemName varchar(2), itemQty  int(2));
select * from e_web_details;
select * from items;
delete from items where id=1;



