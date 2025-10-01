create database Shiva_Concept;

create table Student(
rno int,
name varchar(50) 
);

select * from Student;

alter table student add column fee int;

alter table student add primary key(rno);

insert into student(rno,name) values
(101,"stu1"),
(102,"stu2"),
(103,"stu3");

-- it will give error , because we are adding duplicate value in primary key. 
insert into student(rno,name) values(101,"stu4");

delete from student where rno=104;

-- without giving attribute can also insert data;
insert into student values(104,"stu4",1000);

insert into student(rno,name) values(104,"stu4"),
(105,"stu5");

update student set name='ram kumar' where rno=104;
select * from student;

-- it will return only rno column 
select rno from student;

select * from student where rno in(101,103,105);
select * from student where rno not in(101,103,105);

select * from student where rno between 103 and 105;
select * from student where rno not between 103 and 105;

select * from student where name like '%1';
select * from student where name not like '%1';
select * from student where name like '%t%';

update student set fee=2000 where rno>101;
select * from student;

update student set fee = fee + 300 where rno % 2 != 0 and rno is not null; 
