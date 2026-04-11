package com.rancho.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rancho.model.Category;
import com.rancho.service.ICategoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor


public class CategoryController {
    private final ICategoryService service=null;

    @GetMapping // GET, POST, PUT, DELETE
    public List<Category> findAll() throws Exception{
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable("id") Integer id) throws Exception{
        return service.findById(id);
    }

    @PostMapping
    public Category save(@RequestBody Category category) throws Exception{
        return service.save(category);
    }

    @PutMapping("/{id}")
    public Category update(@RequestBody Category category, @PathVariable("id") Integer id) throws Exception{
        return service.update(category, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception{
        service.delete(id);
    }
}
