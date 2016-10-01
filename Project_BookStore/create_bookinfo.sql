-- create database BookStoreDB
-- CHARACTER SET 'utf8'
-- COLLATE 'utf8_general_ci';
-- ;
-- 
use BookStoreDB;

create table bookinfo(
	ISBN char(13) not null primary key,
    book_name char(20) not null,
    press char(20) not null,
    publish_date datetime,
    price double(4,2),
    description char(200)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into bookinfo
values (
9787210083030,
'理解未来的7个原则',
'后浪出版公司·江西人民出版社',
null,
null,
null
);
