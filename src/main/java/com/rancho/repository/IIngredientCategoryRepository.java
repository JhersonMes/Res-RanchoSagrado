package com.rancho.repository;

import com.rancho.model.IngredientCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIngredientCategoryRepository extends JpaRepository<IngredientCategory, Integer>{
}
