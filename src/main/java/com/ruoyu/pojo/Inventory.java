package com.ruoyu.pojo;
/*
create table tab_inventory(
    iid int primary key ,
    classification varchar(255),
    iname varchar(255),
    quantity int,
    price double,
    unit varchar(10),
    standard varchar(10),
    supplier varchar(255)
);
 */
//tab_inventory库存表实体类
public class Inventory {
//    序号
    private int iid;
//    类型
    private String classification;
//    名称
    private String iname;
//    数量
    private int quantity;
//    价格
    private double price;
//    单位
    private String unit;
//    规格
    private String standard;
//    货源
    private String supplier;
}
