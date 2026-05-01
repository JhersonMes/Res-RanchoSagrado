package com.rancho.service;

import com.rancho.model.Ingredient;
import com.rancho.model.IngredientCategory;

import java.lang.reflect.Executable;
import java.util.List;

public interface IIngredientCategoryService {
    IngredientCategory save(IngredientCategory ingredientCategory) throws Exception;
    IngredientCategory update(IngredientCategory ingredientCategory, Integer id) throws Exception;
    List<IngredientCategory> findAll() throws Exception;
    IngredientCategory findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}
