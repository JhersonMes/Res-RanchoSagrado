package com.rancho.service;

import java.util.List;
import com.rancho.model.IngredientCategory;
import com.rancho.repository.IIngredientCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IngredientCategoryService implements IIngredientCategoryService {

    private final IIngredientCategoryRepository repo;

    @Override
    public IngredientCategory save(IngredientCategory ingredientCategory) throws Exception {
        return repo.save(ingredientCategory);
    }

    @Override
    public IngredientCategory update(IngredientCategory ingredientCategory, Integer id) throws Exception {
        ingredientCategory.setIdCategory(id);
        return repo.save(ingredientCategory);
    }

    @Override
    public List<IngredientCategory> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public IngredientCategory findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new IngredientCategory());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}