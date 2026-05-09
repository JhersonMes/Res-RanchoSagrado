package com.rancho.service.implementation;

import java.util.List;
import com.rancho.model.Inventory;
import com.rancho.repository.IInventoryRepository;
import com.rancho.service.IInventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService implements IInventoryService {
    private final IInventoryRepository repo;

    @Override
    public Inventory save(Inventory inventory) throws Exception {
        return repo.save(inventory);
    }

    @Override
    public List<Inventory> saveAll(List<Inventory> inventories) throws Exception {
        return repo.saveAll(inventories);
    }

    @Override
    public Inventory update(Inventory inventory, Integer id) throws Exception {
        inventory.setIdInventory(id);
        return repo.save(inventory);
    }

    @Override
    public List<Inventory> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Inventory findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Inventory());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
