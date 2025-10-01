create table course(
course_id int primary key not null unique,
course_name varchar(50) not null unique
);

create table course_student(
rno int primary key not null unique,
sname varchar(50) not null,
semester varchar(50) not null,
courseid int not null,
foreign key(courseid) references course(course_id)
);

insert into course values
(1,"C lang"),
(2,"C++ lang"),
(3,"JAVA lang");

insert into course_student values
(01,"stu1","1st",3),
(02,"stu2","3st",1),
(03,"stu3","5st",2),
(04,"stu4","7st",3);

select * from course;
select * from course_student;

-- ye delete nahi hoga , because ye child table use ho raha he.
delete from course where course_id=1;

-- upadate can posible only except primary key
update course set course_name="java-new" where course_name="java";

-- ye update nahi hoga, because course_id Primary key he and ye use ho rahi he child me.
update course set course_id=11 where course_id=1;

-- --------------------join Example --------------------

-- ye cross product dega both jable ka.
select * from course cross join course_student;
select * from course_student cross join course;

-- ye inner join ke example he.
select * from course_student INNER JOIN course ON course.course_id=course_student.courseid;
select * from course inner join course_student on course.course_id=course_student.courseid;
select sname,course_name from course_student INNER JOIN course On course.course_id=course_student.courseid;


insert into course values
(4,"ROR"),
(5,"PHP"),
(6,"QA");
select * from course_student left OUTER JOIN course ON course.course_id=course_student.courseid;
select * from course_student right outer join course ON course.course_id=course_student.courseid;

-- vo courses ke name , jinme koi student enroll nahi he.
select course_name from course left outer join course_student On course.course_id=course_student.courseid 
where sname is null;

insert into course_student values
(05,"stu5","1st",3),
(06,"stu6","1st",1);

-- vo students jo 1st sem me he , unka name,course and sem display karo.
select sname,semester,course_name from course right outer join course_student on course.course_id=course_student.courseid
where semester="1st";

