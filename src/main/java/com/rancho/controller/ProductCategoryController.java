package com.rancho.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rancho.model.ProductCategory;
import com.rancho.service.IProductCategoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/product-categories")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ProductCategoryController {

    private final IProductCategoryService service;

    @GetMapping
    public List<ProductCategory> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ProductCategory findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public ProductCategory save(@RequestBody ProductCategory category) throws Exception {
        return service.save(category);
    }

    @PostMapping("/batch")
    public List<ProductCategory> saveAll(@RequestBody List<ProductCategory> categories) throws Exception {
        return service.saveAll(categories);
    }

    @PutMapping("/{id}")
    public ProductCategory update(@RequestBody ProductCategory category, @PathVariable("id") Integer id) throws Exception {
        return service.update(category, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}
