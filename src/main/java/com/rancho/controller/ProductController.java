package com.rancho.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rancho.model.Product;
import com.rancho.service.IProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ProductController {

    private final IProductService service;

    @GetMapping
    public List<Product> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Product save(@RequestBody Product product) throws Exception {
        return service.save(product);
    }

    @PostMapping("/batch")
    public List<Product> saveAll(@RequestBody List<Product> products) throws Exception {
        return service.saveAll(products);
    }

    @PutMapping("/{id}")
    public Product update(@RequestBody Product product, @PathVariable("id") Integer id) throws Exception {
        return service.update(product, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}