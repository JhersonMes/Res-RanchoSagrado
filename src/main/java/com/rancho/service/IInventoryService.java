package com.rancho.service;

import com.rancho.model.Inventory;
import java.util.List;

public interface IInventoryService {
    Inventory save(Inventory inventory) throws Exception;
    List<Inventory> saveAll(List<Inventory> inventories) throws Exception;
    Inventory update(Inventory inventory, Integer id) throws Exception;
    List<Inventory> findAll() throws Exception;
    Inventory findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}