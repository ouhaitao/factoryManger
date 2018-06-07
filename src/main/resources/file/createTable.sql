create table atb_exceptionList(-- "异常报告"
id int not null PRIMARY KEY,-- 报告单id
oid int not null ,-- 订单id
submit varchar(10) not null,-- 申报部门
uid int not null,-- 管理员id
phone varchar(11) not null,-- 管理员联系方式
empname varchar(10) ,-- 员工姓名
empid int ,-- 员工号
date time not null ,-- 申报时间
type int not null,-- 异常类型
pause int not null,-- 是否导致停工（）
summary text not null,-- 异常简介
info text ,-- 异常说明
handle varchar(10) ,-- 处理部门
result varchar(50),-- 处理结果
)

create table atb_material(-- "原料记录"
oid int not null primary key,-- 订单id
process int not null primary key,-- 订单所处流程
mid int not null,-- 原料id
predict int,-- 预计需要领取原料数量
reality int,-- 实际领取的原料数量
consume int,-- 已使用的原料数量
scrap int,-- 废弃原料数量
)

create table atb_order(-- 订单
id int not null primary key,-- 订单id
size int not null,-- 纸杯型号
productnum int not null,-- 产品数量
process int ,-- 当前流程
state int,-- 已完成数量
)
 
create table atb_produceLog(-- 生产日志
id int not null primary key,-- 日志id
oid int not null,-- 订单id
process int not null,-- 订单流程
uid int not null,-- 管理员id
date time not null,-- 时间
type int not null,-- 日志类型
information text,-- 日志内容
result varchar(50),-- 处理结果
)

create table atb_qualityReport(-- 质检报告
id int not null primary key,-- 报告id
oid int not null,-- 订单id
submit varchar(10) not null,-- 提交部门
date time not null,-- 提交时间
sample int,-- 抽样数量
state int,-- 质检状态
result int,-- 质检结果
scrap int,-- 不合格数量
info text,-- 质检结果说明
)
create table atb_rate(-- 进度记录
id int not null primary key,-- 订单id
process int not null primary key,-- 订单流程
date time not null,-- 时间
produce int,-- 生产数量
)

create table atb_repairList(-- 报修单
id int not null primary key,-- 报修单id
submit varchar(10) not null,-- 提交部门
uid int not null,-- 管理员id
phone varchar(11) not null,-- 管理员电话
date time not null,-- 时间
type int not null,-- 故障类型
summary varchar(50) not null,-- 故障简介
info text,-- 故障内容
mark text,-- 备注
handle varchar(10),-- 处理部门
result varchar(50),-- 处理结果
)
create table atb_warehouse(-- 仓库
id int not null primary key,-- 仓库id
meterialtype varchar(25) not null,-- 原料名
stock int,-- 库存

)
