package com.ruoyu.service;

import com.ruoyu.pojo.Inventory;

import java.util.List;

public interface InventoryService {




    //增加一条库存记录

    //删除一条库存记录

    //修改一条库存记录


    //    查询库存
    //查询全部库存
    List<Inventory> queryAllInventory();
    //通过类型查询库存
    List<Inventory> queryInventoryByClassification(String classification);
    //通过名称查询库存
    List<Inventory> queryInventoryByIname(String iname);
    //通过货源查询库存
    List<Inventory> queryInventoryBySupplier(String supplier);
}
