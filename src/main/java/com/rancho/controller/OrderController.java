package com.rancho.controller;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rancho.model.Order;
import com.rancho.service.IOrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class OrderController {
    private final IOrderService service;

    @GetMapping
    public List<Order> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Order findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Order save(@RequestBody Order order) throws Exception {
        return service.save(order);
    }

    @PostMapping("/batch")
    public List<Order> saveAll(@RequestBody List<Order> orders) throws Exception {
        return service.saveAll(orders);
    }

    @PutMapping("/{id}")
    public Order update(@RequestBody Order order, @PathVariable("id") Integer id) throws Exception {
        return service.update(order, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}
