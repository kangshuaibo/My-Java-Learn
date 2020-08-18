-- 1. ------------------------------------------
CREATE TABLE emp ( 
id INT PRIMARY KEY AUTO_INCREMENT,
 NAME VARCHAR(30), 
 age INT, 
 dep_name VARCHAR(30), 
 dep_location VARCHAR(30) 
 ); -- 添加数据 

INSERT INTO emp (NAME, age, dep_name, dep_location) 
VALUES ('张三', 20, '研发部', '广州'); 
INSERT INTO emp (NAME, age, dep_name, dep_location)
 VALUES ('李四', 21, '研发部', '广州'); INSERT INTO emp (NAME, age, dep_name, dep_location)
  VALUES ('王五', 20, '研发部', '广州'); INSERT INTO emp (NAME, age, dep_name, dep_location)
   VALUES ('老王', 20, '销售部', '深圳'); INSERT INTO emp (NAME, age, dep_name, dep_location)
    VALUES ('大王', 22, '销售部', '深圳'); INSERT INTO emp (NAME, age, dep_name, dep_location)
     VALUES ('小王', 18, '销售部', '深圳');
     
select * from emp;
-- 数据有冗余







-- 2.-------------------------表的拆分--------------------
-- 解决方案：分成2张表
-- 创建部门表(id,dep_name,dep_location)
-- 一方，主表
create table department(
id int primary key auto_increment,
dep_name varchar(20),
dep_location varchar(20)
);
-- 创建员工表(id,name,age,dep_id)
-- 多方，从表
create table employee(
id int primary key auto_increment,
name varchar(20),
age int,
dep_id int, -- 外键对应主表的主键
constraint emp_dept_fk  foreign key (dep_id) references department (id)  -- 添加外键约束
);
-- 添加2个部门
insert into department values(null, '研发部','广州'),(null, '销售部', '深圳');

-- 添加员工,dep_id表示员工所在的部门
INSERT INTO employee (NAME, age, dep_id) VALUES ('张三', 20, 1);
INSERT INTO employee (NAME, age, dep_id) VALUES ('李四', 21, 1);
INSERT INTO employee (NAME, age, dep_id) VALUES ('王五', 20, 1);
INSERT INTO employee (NAME, age, dep_id) VALUES ('老王', 20, 2);
INSERT INTO employee (NAME, age, dep_id) VALUES ('大王', 22, 2);
INSERT INTO employee (NAME, age, dep_id) VALUES ('小王', 18, 2);


drop table emp;
drop table employee;
drop table department;

select * from employee;
select * from department;

-- 删除外键
alter table employee drop foreign key emp_dept_fk;

-- 添加约束
alter table employee add constraint emp_dept_fk  foreign key (dep_id) references department (id); 


-- 3.-------------------------------级联操作----------------
-- 想更新表的外键
update employee set dep_id = null where dep_id = 1;
update employee set dep_id = 5 where dep_id is null;

select * from employee;
select * from department;


-- 删除外键
alter table employee drop foreign key emp_dept_fk;
-- 添加约束,设置级联更新,设置级联删除
alter table employee add constraint emp_dept_fk  foreign key (dep_id) references department (id) on update cascade on delete cascade; 
