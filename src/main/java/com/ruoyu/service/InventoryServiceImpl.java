package com.ruoyu.service;

import com.ruoyu.mapper.InventoryMapper;
import com.ruoyu.pojo.Inventory;

import java.util.List;

public class InventoryServiceImpl implements InventoryService{

    private InventoryMapper inventoryMapper;

    public void setInventoryMapper(InventoryMapper inventoryMapper) {
        this.inventoryMapper = inventoryMapper;
    }

    @Override
    public List<Inventory> queryAllInventory() {
        return inventoryMapper.queryAllInventory();
    }

    @Override
    public List<Inventory> queryInventoryByClassification(String classification) {
        return inventoryMapper.queryInventoryByClassification(classification);
    }

    @Override
    public List<Inventory> queryInventoryByIname(String iname) {
        return inventoryMapper.queryInventoryByIname(iname);
    }

    @Override
    public List<Inventory> queryInventoryBySupplier(String supplier) {
        return inventoryMapper.queryInventoryBySupplier(supplier);
    }
}
