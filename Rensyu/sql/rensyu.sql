set names utf8;
set foreign_key_checks = 0;
drop database if exists rensyu;

create database rensyu;

use rensyu;

drop table if exists User;

create table User(

	id int not null primary key auto_increment,
	userId varchar(50) unique,
	userPassword varchar(16),
	userName varchar(50),
	insertdate datetime,
	updatedate datetime);

drop table if exists Item;

create table Item(
	id int not null primary key auto_increment,
	itemName varchar(50),
	itemPrice int,
	itemStock int,
	insertdate datetime,
	updatedate datetime);

drop table if exists History;

create table History(
	id int not null primary key auto_increment,
	itemid int,
	totalPrice int,
	totalCount int,
	userid varchar(50),
	pay varchar(16),
	insertdate datetime,
	updatedate datetime);

insert into User(userId,userPassword,userName)values("taro","123","taro");

insert into Item(itemName,itemPrice,itemStock) values("note",100,50);