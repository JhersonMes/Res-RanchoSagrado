package com.rancho.service;

import com.rancho.model.Ingredient;
import java.util.List;

public interface IIngredientService {
    Ingredient save(Ingredient ingredient) throws Exception;
    Ingredient update(Ingredient ingredient, Integer id) throws Exception;
    List<Ingredient> findAll() throws Exception;
    Ingredient findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}