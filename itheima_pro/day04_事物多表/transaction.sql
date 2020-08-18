-- 1.---------准备数据----------------------

-- 创建数据表 
CREATE TABLE account (
id INT PRIMARY KEY AUTO_INCREMENT, 
NAME VARCHAR(10), 
balance DOUBLE 
); 

-- 添加数据
 INSERT INTO account (NAME, balance) VALUES ('zhangsan', 1000), ('lisi', 1000);



-- 查看
select * from account;
-- 重置
update account set balance = 1000;
-- mysql 安全update策略修改
SET SQL_SAFE_UPDATES = 0;






-- 2.----------------------操作-------------
-- 张三给李四转账500元
-- 0.开启事务
start transaction;
-- 1.张三账户-500
update account set balance = balance - 500 where name = 'zhangsan';
-- 2.李四账户 +500
-- 出错了,,,,,
update account set balance = balance + 500 where name = 'lisi';

-- 发现实行没有问题,提交事务
commit;
-- 发现问题,回滚事务
rollback;


select * from account;
-- 查看提交方式
select @@autocommit;	-- 默认1 代表自动提交 0代表手动提交
-- 修改提交方式
set @@autocommit = 0;

update account set balance = 40;

commit;
