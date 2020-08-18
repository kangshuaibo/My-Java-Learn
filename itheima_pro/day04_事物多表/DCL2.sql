-- DLC管理用户 授权

-- 1.切换到mysql数据库
use mysql;

-- 2.查询user表alter
select * from user;		-- 通配符%表示可以在任意主机使用用户登陆数据库

-- 创建用户
-- create user '用户名'@'主机名' identified by'密码';
create user 'zhangsan'@'localhost' identified by'123';
create user 'lisi'@'%' identified by'123';

-- 	删除用户
-- drop user '用户名'@'主机名';
drop user 'zhangsan'@'localhost';


SET SQL_SAFE_UPDATES = 0;
-- 修改lis用户密码为abc
-- update user set password = password('新密码') where user = '用户名';
update user set PASSWORD = PASSWORD(678) where USER = 'lisi';
alter user 'lisi'@'%' identified by 'abc'; -- 这个不报错



-- set password for '用户名'@'主机名' = password('新密码');
set password for 'root'@'localhost' = password('abcd');


-- 查询权限
show grants for '用户名'@'主机名';
show grants for 'lisi'@'%';

show grants for 'root'@'localhost';


-- 授予权限
-- grant 权限列表 on 数据库名.表名 to '用户名'@'主机名';
grant SELECT,DELETE,UPDATE on db3.account to 'lisi'@'%';
-- 给张三用户授予所有权限,在任意数据库任意表上
grant ALL on *.* to 'zhangsan'@'localhost';

-- 撤销权限
-- revoke 权限列表 on 数据库名.表名 from '用户名'@'主机名';
revoke update on db3.account from 'lisi'@'%';

