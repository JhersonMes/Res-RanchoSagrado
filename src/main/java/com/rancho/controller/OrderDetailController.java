package com.rancho.controller;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rancho.model.OrderDetail;
import com.rancho.service.IOrderDetailService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/order-details")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class OrderDetailController {
    private final IOrderDetailService service;

    @GetMapping
    public List<OrderDetail> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public OrderDetail findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public OrderDetail save(@RequestBody OrderDetail orderDetail) throws Exception {
        return service.save(orderDetail);
    }

    @PostMapping("/batch")
    public List<OrderDetail> saveAll(@RequestBody List<OrderDetail> details) throws Exception {
        return service.saveAll(details);
    }

    @PutMapping("/{id}")
    public OrderDetail update(@RequestBody OrderDetail orderDetail, @PathVariable("id") Integer id) throws Exception {
        return service.update(orderDetail, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}
