package com.rancho.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.rancho.model.Ingredient;
import com.rancho.service.IIngredientService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/ingredients")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") //CORS
public class IngredientController {

    private final IIngredientService service;

    @GetMapping
    public List<Ingredient> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Ingredient findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Ingredient save(@RequestBody Ingredient ingredient) throws Exception {
        return service.save(ingredient);
    }

    @PutMapping("/{id}")
    public Ingredient update(@RequestBody Ingredient ingredient, @PathVariable("id") Integer id) throws Exception {
        return service.update(ingredient, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}