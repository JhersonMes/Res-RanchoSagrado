package com.rancho.service;

import java.util.List;
import com.rancho.model.Ingredient;
import com.rancho.repository.IIngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IngredientService implements IIngredientService {

    private final IIngredientRepository repo;

    @Override
    public Ingredient save(Ingredient ingredient) throws Exception {
        return repo.save(ingredient);
    }

    @Override
    public Ingredient update(Ingredient ingredient, Integer id) throws Exception {
        ingredient.setIdIngredient(id);
        return repo.save(ingredient);
    }

    @Override
    public List<Ingredient> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Ingredient findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Ingredient());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}