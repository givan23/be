package com.application.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.application.repositories.IRecipeRepository;
import com.application.models.RecipeModel;
import org.springframework.stereotype.Service;

@Service
public class RecipeService implements IRecipeRepository {

    @Override
    public List<RecipeModel> findAll() {

        //creating an object of ArrayList
        ArrayList<RecipeModel> recipes = new ArrayList<RecipeModel>();

        //adding products to the List
        recipes.add(new RecipeModel("1", "Carbonara", "Primo", "Bassa", "Economico", 15, 10, 4));
        recipes.add(new RecipeModel("2", "Pollo al limone", "Secondo", "Media", "Economico", 60, 40, 4));
        recipes.add(new RecipeModel("3", "Cheesecake", "Dolce", "Media", "Economico", 30, 15, 4));

        //returns a list of recipes
        return recipes;
    }

    @Override
    public RecipeModel findById(String id) {

        List<RecipeModel> recipes = findAll();

        Iterator<RecipeModel> iterator = recipes.iterator();

        while (iterator.hasNext()) {
            RecipeModel recipe = iterator.next();
            if (recipe.getId().equals(id)) {
                return recipe;
            }
        }

        return null;
    }

    @Override
    public List<RecipeModel> createRecipe(RecipeModel newRecipe) {
        List<RecipeModel> recipes = findAll();
        recipes.add(newRecipe);
        return recipes;
    }

    @Override
    public List<RecipeModel> updateRecipe(String id, RecipeModel newRecipe) {
        List<RecipeModel> recipes = findAll();

        Iterator<RecipeModel> iterator = recipes.iterator();

        while (iterator.hasNext()) {

            RecipeModel recipe = iterator.next();

            if (recipe.getId().equals(id)) {

                recipe.setTitle(newRecipe.getTitle());
                recipe.setCategory(newRecipe.getCategory());
                recipe.setDifficulty(newRecipe.getDifficulty());
                recipe.setCost(newRecipe.getCost());
                recipe.setPreparation(newRecipe.getPreparation());
                recipe.setCooking(newRecipe.getCooking());
                recipe.setDoses(newRecipe.getDoses());

                return recipes;
            }
        }

        return recipes;
    }

    @Override
    public List<RecipeModel> deleteRecipe(String id) {
        List<RecipeModel> recipes = findAll();

        Iterator<RecipeModel> iterator = recipes.iterator();

        while (iterator.hasNext()) {
            RecipeModel recipe = iterator.next();
            if (recipe.getId().equals(id)) {
                 recipes.remove(recipe);
                return recipes;
            }
        }

        return recipes;
    }


}
