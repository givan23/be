package com.application.repositories;

import com.application.models.RecipeModel;

import java.util.List;

public interface IRecipeRepository {
    List<RecipeModel> findAll();

    RecipeModel findById(String id);

    List<RecipeModel> createRecipe(RecipeModel recipe);

    List<RecipeModel> updateRecipe(String id, RecipeModel recipe);

    List<RecipeModel> deleteRecipe(String id);

}