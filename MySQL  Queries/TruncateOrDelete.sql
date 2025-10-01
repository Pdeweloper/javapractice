create table emp(
eid int auto_increment primary key not null,
ename varchar(50) not null,
salary int not null 
);

select * from emp;

insert into emp(ename,salary) values
("emp1" , 1000),
("emp2" , 1300),
("emp3" , 3000);

-- jab ham truncate se delete karte he to , id again '1' se start hoti he 
truncate table emp;

-- but jab ham delete se pura table delete karte he to , id next number se start hoti he 
delete from emp where eid>0;