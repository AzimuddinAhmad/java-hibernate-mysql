create database hibernate_crud;
use hibernate_crud;
create table student (name varchar(25), email varchar (25));
insert into student values ("Harshit", "harshit@gl.com",1);
alter table student add id int;
truncate table student;
DELETE FROM STUDENT WHERE id = nil;
select * from student;
set SQL_SAFE_UPDATES = 0; 