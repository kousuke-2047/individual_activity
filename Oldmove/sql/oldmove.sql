set names utf8;
set foreign_key_checks =0;
drop database if exists oldmove;

create database if not exists oldmove;
use oldmove;

drop table if exists battlemonster;

create table battlemonster(
	id int not null primary key auto_increment,
	name varchar(16),
	menber int,
	power int,
	guard int,
	hp int,
	maxhp int,
	mp int,
	maxmp int,
	actiontype int,
	odds int,
	filepath varchar(100),
	filename varchar(100));

drop table if exists actiontype;

create table actiontype(
	id int not null primary key auto_increment,
	punch int,
	shield int,
	heal int,
	spell int,
	critical int);

drop table if exists mymoney;

create table mymoney(
	money int,
	bets int,
	monsterid int,
	maxrecord int);

	insert into battlemonster(name,menber,power,guard,hp,maxhp,mp,maxmp,actiontype,odds,filepath,filename)values("スライム",1,10,5,20,20,5,5,2,5,"./images","suraimu.png");
	insert into battlemonster(name,menber,power,guard,hp,maxhp,mp,maxmp,actiontype,odds,filepath,filename)values("ドラキー",1,12,5,22,22,0,0,1,3,"./images","doraki.png");
	insert into battlemonster(name,menber,power,guard,hp,maxhp,mp,maxmp,actiontype,odds,filepath,filename)values("ももんじゃ",1,15,7,25,25,0,0,1,2,"./images","momonja.png");

	insert into battlemonster(name,menber,power,guard,hp,maxhp,mp,maxmp,actiontype,odds,filepath,filename)values("オーク",2,10,5,20,20,0,0,1,2,"./images","suraimu.jpg");
	insert into battlemonster(name,menber,power,guard,hp,maxhp,mp,maxmp,actiontype,odds,filepath,filename)values("ばくだんいわ",2,10,5,20,20,0,0,1,2,"./images","suraimu.jpg");
	insert into battlemonster(name,menber,power,guard,hp,maxhp,mp,maxmp,actiontype,odds,filepath,filename)values("ドラゴン",2,10,5,20,20,0,0,1,2,"./images","suraimu.jpg");

	insert into battlemonster(name,menber,power,guard,hp,maxhp,mp,maxmp,actiontype,odds,filepath,filename)values("ああああ",3,10,5,20,20,10,10,3,2,"./images","test1.png");
	insert into battlemonster(name,menber,power,guard,hp,maxhp,mp,maxmp,actiontype,odds,filepath,filename)values("いいいい",3,10,5,20,20,10,10,3,2,"./images","test2.png");
	insert into battlemonster(name,menber,power,guard,hp,maxhp,mp,maxmp,actiontype,odds,filepath,filename)values("うううう",3,10,5,20,20,10,10,3,2,"./images","test3.png");

	insert into actiontype(punch,shield,heal,spell,critical)values(3,0,0,0,1);
	insert into actiontype(punch,shield,heal,spell,critical)values(3,0,0,1,1);
	insert into actiontype(punch,shield,heal,spell,critical)values(2,0,1,1,0);

	insert into mymoney(money)values(100);