-- 1.------------------非空约束-----------------
-- 创建表添加非空约束
create table stu1(
	id int,
    name varchar(20) not null	-- name 为非空
);

-- 删除name的非空约束
alter table stu1 modify name varchar(20);

-- 创建表完成后,添加非空约束
alter table stu1 modify name varchar(20) not null;


select * from stu1;








-- 2.------------------唯一约束----------------
create table stu2(
	id int,
    phone_number varchar(20) unique -- 添加了唯一约束
);
-- 注意mysql中,唯一约束限定的列的值可以有多个null

-- 删除唯一约束
-- alter table stu1 modify phone_number varchar(20); -- 不能删除
alter table stu2 drop index phonr_number;

-- 在创建表后,添加唯一约束
alter table stu2 modify phone_number varchar(20) unique;







-- 3.------------------主键约束----------------
create table stu3(
	id int primary key,	-- 给id添加主键约束
    name varchar(20)
);
-- 删除主键
-- alter table stu modify id int; -- 错误
alter table stu drop primary key;

-- 创建完表后,添加主键
alter table stu modify id int primary key;

select * from stu3;




-- 4.-------------主键自动增长-----------------
create table stu4(
	id int primary key auto_increment,	-- 给id添加主键约束
    name varchar(20)
);

-- 删除自动增长
alter table stu modify id int;
-- 添加自动增长
alter table stu modify id int auto_increment;

insert into stu4 values(null,'ccc'); -- 根据上一条的值 加一

select * from stu4;


