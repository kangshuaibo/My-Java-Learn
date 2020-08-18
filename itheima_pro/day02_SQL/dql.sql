CREATE TABLE student1 ( id int, -- 编号 
 name varchar(20), -- 姓名
 age int, -- 年龄 
 sex varchar(5), -- 性别
 address varchar(100), -- 地址 
 math int, -- 数学 
 english int -- 英语 
 ); 
 
 INSERT INTO student1(id,NAME,age,sex,address,math,english) 
 VALUES (1,'马云',55,'男','杭州',66,78),
 (2,'马化腾',45,'女','深圳',98,87),
 (3,'马景涛',55,'男','香港',56,77),
 (4,'柳岩',20,'女','湖南',76,65),
 (5,'柳青',20,'男','湖南',86,NULL),
 (6,'刘德华',57,'男','香港',99,99),
 (7,'马德',22,'女','香港',99,99),
 (8,'德玛西亚',18,'男','南京',56,65);
 
 drop table student;
 
 
 -- 1.-------------基础查询-------------------
 select * from student1;
 
 -- 查询 姓名 和年龄
 select 
		name,	-- 姓名
		age 	-- 年龄
from 
		student1; -- 学生表
        
        
-- 查询 地址
select address from student1;

-- 查询地址 去除重复结果集
select distinct address from student1;
select distinct name,address from student1;

-- 计算math和english分数只和之和 
select name,math,english,math + english from student1;

-- 如果有null参与运算,计算结果都为null
select name,math,english,math + ifnull(english,0) from student1;

-- 起别名
 select name,math,english,math + ifnull(english,0) as 总分 from student1;
 
 select name,math 数学,english 英语,math + ifnull(english,0) 总分 from student1;
 
 
 
  -- 1.-------------条件查询-------------------
  select * from student1;
  -- 查询年龄大于20岁
  select * from student1 where age > 20;
  select * from student1 where age >= 20;
  
  -- 查询年龄等于20 一定是= ,而不是==
  select * from student1 where age = 20;
  select * from student1 where age <>20;
  
  -- 查询年龄大于等于20 小于等于30
  select * from student1 where age >= 20 && age <=30;
  select * from student1 where age >= 20 and age <=30;
  select * from student1 where age between 20 and 30;
  
  -- 查询年龄22岁,19岁,25岁的信息
  select * from student1 where age=22 or age=18 or age =25;
  select * from student1 where age in (22,18,25);
  
  -- 查询英语成绩为null
  select * from student1 where english =null; -- 不对的.null值不能使用= != 判断
  select * from student1 where english is null;
  
    -- 查询英语成绩不为为null
 select * from student1 where english is not null;
 
 
 
 
 
 -- 3.---------------模糊查询-----------------------
  -- 查询姓马的有那些? like
  select * from student1 where name like '马%';
  
  -- 查询姓名第二个字是化的人
  select * from student1 where name like '_化%';
  
  -- 查询姓名是三个字的人
    select * from student1 where name like '___';
    
-- 查询姓名中包含 德 的人
	select * from student1 where name like '%德%';
  
  
  
  
      
 