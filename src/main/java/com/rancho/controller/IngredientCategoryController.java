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

import com.rancho.model.IngredientCategory;
import com.rancho.service.IIngredientCategoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/ingredient-category")
@RequiredArgsConstructor

public class IngredientCategoryController {

    private final IIngredientCategoryService service;

    @GetMapping
    public List<IngredientCategory> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public IngredientCategory findById(@PathVariable("id") Integer id) throws Exception{
        return service.findById(id);
    }

    @PostMapping
    public IngredientCategory save(@RequestBody IngredientCategory ingredientCategory) throws Exception{
        return service.save(ingredientCategory);
    }

    @PutMapping("/{id}")
    public IngredientCategory update(@RequestBody IngredientCategory ingredientCategory, @PathVariable("id") Integer id) throws Exception{
        return service.update(ingredientCategory, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception{
        service.delete(id);
    }
}
