select * from student1;

-- 1.-----------------排序方式
select * from student1 order by math asc;  -- 升序 默认不写asc为升序
select * from student1 order by math desc;  -- 降序

-- 按照数学成绩抛名,如果数学成绩一样,则按照英语成绩排名
select * from student1 order by math asc,english asc;






-- 2.-------------聚合函数 一列作为一个整体计算
-- 计算个数
select count(english) from student1;

select count(ifnull(english,0))  from student1;

select count(*) from student1;

select count(id) from student1;

-- 最大最小
select max(math) from student1;
select min(math) from student1;

-- 求和
select sum(math) from student1;

select sum(math) from student1;

select sum(english) from student1;

select avg(math) from student1;





-- 3. --------------分组查询---------------
-- 按照性别分组,分别查询男/女同学的平均分
select sex,avg(math) from student1 group by sex;

-- 按照性别分组,分别查询男/女同学的平均分,人数
select sex,avg(math),count(id) from student1 group by sex;

-- 按照性别分组,分别查询男/女同学的平均分,人数 (要求分数低于70分的人,不参与分组)
select sex,avg(math),count(id) from student1 where math > 70 group by sex;

-- 按照性别分组,分别查询男/女同学的平均分,人数 (要求分数低于70分的人,不参与分组,分组之后人数要大于2人)
select sex,avg(math),count(id) from student1 where math > 70 group by sex having count(id) > 2;






-- 4.-----------------分页查询--------------
-- 每页显示3条记录
select * from student1 limit 0,3;	-- 第1页  从0开始,显示3条
select * from student1 limit 3,3;   -- 第2页 
select * from student1 limit 6,3;	-- 第3页

-- 公式:开始的索引 = (当前的页码 - 1) * 每页显示的条数
-- limit 是一个MySQL"方言"student1student1
