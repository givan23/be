package com.recipesAdmin;

import java.util.List;

public interface IRecipeService {
    List<RecipeModel> findAll();

    RecipeModel findById(String id);

    List<RecipeModel> createRecipe(RecipeModel recipe);

    List<RecipeModel> updateRecipe(String id, RecipeModel recipe);

    List<RecipeModel> deleteRecipe(String id);

}