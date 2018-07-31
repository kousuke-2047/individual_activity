set names utf8;
set foreign_key_checks =0;
drop database if exists itemlist;

create database itemlist;

use itemlist;

drop table if exists item;

create table item(
	id int not null primary key auto_increment,
	itemName varchar(50),
	itemPrice int,
	category varchar(50),
	insertdate datetime,
	updatedate datetime);

insert into item(itemName,itemPrice,category) values("nato",100,"文具");

insert into item(itemName,itemPrice,category) values("book",80,"文具");

insert into item(itemName,itemPrice,category) values("pen",50,"文具");

insert into item(itemName,itemPrice,category) values("kesigomu",120,"文具");

insert into item(itemName,itemPrice,category) values("paper",30,"文具");

insert into item(itemName,itemPrice,category) values("drink",150,"飲料");

insert into item(itemName,itemPrice,category) values("juece",333,"飲料");

insert into item(itemName,itemPrice,category) values("cola",24,"飲料");

insert into item(itemName,itemPrice,category) values("tea",743,"飲料");

insert into item(itemName,itemPrice,category) values("carry",838,"飲料");

insert into item(itemName,itemPrice,category) values("CO2",303,"飲料");

insert into item(itemName,itemPrice,category) values("jijijiji",32,"その他");

insert into item(itemName,itemPrice,category) values("akehoaf",743,"その他");

insert into item(itemName,itemPrice,category) values("qawsedrf",743,"その他");







