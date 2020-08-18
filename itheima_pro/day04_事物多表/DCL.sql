create database db2;
use db2;

-- 1.-----------准备数据------------
# 创建部门表
create table dept(
id int primary key auto_increment,
name varchar(20)
);

insert into dept (name) values ('开发部'),('市场部'),('财务部');
# 创建员工表
create table emp (
id int primary key auto_increment,
name varchar(10),
gender char(1), -- 性别
salary double, -- 工资
join_date date, -- 入职日期
dept_id int,
foreign key (dept_id) references dept(id) -- 外键，关联部门表(部门表的主键)
);

insert into emp(name,gender,salary,join_date,dept_id) values('孙悟空','男',7200,'2013-02-24',1);
insert into emp(name,gender,salary,join_date,dept_id) values('猪八戒','男',3600,'2010-12-02',2);
insert into emp(name,gender,salary,join_date,dept_id) values('唐僧','男',9000,'2008-08-08',2);
insert into emp(name,gender,salary,join_date,dept_id) values('白骨精','女',5000,'2015-10-07',3);
insert into emp(name,gender,salary,join_date,dept_id) values('蜘蛛精','女',4500,'2011-03-14',1);

-- 2. --------------多表查询------------------
select * from emp;	-- 5条数据
select * from dept;		-- 3条数据

select * from emp,dept;	-- 笛卡尔积 	-- 15条数据

-- 消除无用数据
-- 3.---------------内链接查询---------------
-- 3.1 隐式内链接
-- 查询所有员工信息和对应的部门信息
select * from emp,dept where emp.dept_id = dept.id;
-- 查询员工表的名称,性别,部门表的名称
select emp.name,emp.gender,dept.name from emp,dept where emp.dept_id = dept.id;
-- 简化 起别名
select 
	t1.name,	-- 员工表的姓名
    t1.gender,	-- 员工表的性别
    t2.name		-- 部门表的名称
from
	emp t1,dept t2
where
	t1.dept_id = t2.id;
-- 3.2显式内连接
select * from emp inner join dept on emp.dept_id = dept.id;	-- inner可以省略
select * from emp  join dept on emp.dept_id = dept.id;


-- 4.------外连接查询
select * from dept;
select * from emp;

-- 查询所有员工信息,如果员工有部门,则查询部门名称,没有部门,则不显示部门名称(员工信息要显示)
select
	t1.*,t2.name
from	
	emp t1,dept t2
where
	t1.dept_id = t2.id;	-- 小白龙是空的 没有对应的部门,需求无法完成,小白龙没有显示

-- 左外连接	显示左表的全部信息 和 两个表的交集(小白龙在左表信息中)
select t1.*,t2.name from emp t1 left join dept t2 on t1.dept_id = t2.id;
-- 右外连接 同理(因为右边的全部信息没有小白龙,也没有交集,交集是空)
select t1.*,t2.name from emp t1 right join dept t2 on t1.dept_id = t2.id;

select t1.*,t2.name from dept t2 right join emp t1 on t1.dept_id = t2.id;-- 让小白龙回来


-- 6.-----子查询----------
-- 查询工资最高的员工信息
-- 1.查询最高的工资是多少9000
select max(salary) from emp;

-- 2.查询员工信息,并且工资等于9000
select * from emp where emp.salary = 9000;

-- 综上 想用一条语句完成
select * from emp where emp.salary = (select max(salary) from emp);





-- 7.---------------子查询的不同情况

-- 7.1子查询的结果是单行单列的：
-- 查询员工工资小于平均工资的人	运算符: >  >=  <  <=   =
select * from emp where emp.salary < (select avg(salary) from emp);


-- 7.2子查询结果是多行单列的:	使用运算符 IN
-- 查询财务部所有的员工信息
select id from dept where name = '财务部';
select * from emp where dept_id = 3;

-- 查询财务部 和 市场部所有的员工信息
select id from dept where name = '财务部' or name = '市场部';
select * from emp where dept_id = 3 or dept_id = 2;
-- 可以转化为:
select * from emp where dept_id in(2,3);
select * from emp where dept_id in(select id from dept where name = '财务部' or name = '市场部');


-- 7.3-----子查询的结果是多行多列的： 子查询可以作为一张虚拟表参与查询
-- 查询员工入职日期是2011-11-11日之后的员工信息和部门信息
-- 子查询
select * from emp where emp.join_date > '2011-11-11';

select * from dept t1,(select * from  emp where emp.join_date > '2011-11-11') t2
where t1.id = t2.dept_id;
-- 普通内链接
select * from emp t1,dept t2 where t1.dept_id = t2.id and t1.join_date > '2011-11-11';

  