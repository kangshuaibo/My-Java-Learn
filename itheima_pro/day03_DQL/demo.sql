-- 创建旅游线路分类表tab_category
-- cid旅游线路分类主键，自动增长
-- cname旅游线路分类名称非空，唯一，字符串100
create table tab_category (
	cid int primary key auto_increment,
	cname varchar(100) not null unique
);


-- 创建旅游线路表tab_route
/*
rid旅游线路主键，自动增长
rname旅游线路名称非空,唯一,字符串100
price价格
rdate 上架时间，日期类型
cid 外键，所属分类
*/
create table tab_route(
	rid int primary key auto_increment,
	rname varchar(100) not null unique,
	price double,
	rdate date,
	cid int,
	foreign key (cid) references tab_category(cid)
);



/*创建用户表tab_user
uid用户主键，自增长
username用户名长度100，唯一，非空
password密码长度30，非空
name真实姓名长度100
birthday生日
sex性别，定长字符串1
telephone手机号，字符串11
email邮箱，字符串长度100
*/
create table tab_user (
uid int primary key auto_increment,
username varchar(100) unique not null,
password varchar(30) not null,
name varchar(100),
birthday date,
sex char(1) default '男',
telephone varchar(11),
email varchar(100)
);


/*
创建收藏表tab_favorite
rid 旅游线路id，外键
date 收藏时间
uid用户id，外键
rid和uid不能重复，设置复合主键，同一个用户不能收藏同一个线路两次
*/


create table tab_favorite (
rid int,	-- 线路id
date datetime,
uid int,	-- 用户id
-- 创建复合主键
primary key(rid,uid),
foreign key (rid) references tab_route(rid),
foreign key(uid) references tab_user(uid)
);

-- 备份
-- mysqldump -uroot -p8-. db1 > /Users/kangshuaibo/Desktop/My-Java-Learn/itheima_pro/day03_DQL/back-up/a.sql
-- source /Users/kangshuaibo/Desktop/My-Java-Learn/itheima_pro/day03_DQL/back-up/a.sql