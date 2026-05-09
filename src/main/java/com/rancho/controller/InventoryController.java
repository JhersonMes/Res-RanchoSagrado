package com.rancho.controller;
import com.rancho.model.Inventory;
import com.rancho.service.IInventoryService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventories")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") //CORS
public class InventoryController {
    private final IInventoryService service;

    @GetMapping
    public List<Inventory> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Inventory findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Inventory save(@RequestBody Inventory inventory) throws Exception {
        return service.save(inventory);
    }

    @PostMapping("/batch")
    public List<Inventory> saveAll(@RequestBody List<Inventory> inventories) throws Exception {
        return service.saveAll(inventories);
    }

    @PutMapping("/{id}")
    public Inventory update(@RequestBody Inventory inventory, @PathVariable("id") Integer id) throws Exception {
        return service.update(inventory, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}
