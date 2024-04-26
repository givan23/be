package com.application.controllers;

import java.util.List;

import com.application.models.RecipeModel;
import com.application.repositories.IRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecipeController {

    @Autowired
    private IRecipeRepository recipeRepository;

    @GetMapping(value = "/recipes")
    public List<RecipeModel> getRecipes() {
        return recipeRepository.findAll();
    }

    @GetMapping(value = "/recipe")
    public RecipeModel getRecipe(@RequestParam String id) {
        return recipeRepository.findById(id);
    }

    @PostMapping(value = "/recipe")
    List<RecipeModel> addRecipe(@RequestBody RecipeModel recipe) {
        return recipeRepository.createRecipe(recipe);
    }

    @PatchMapping(value = "/recipe")
    List<RecipeModel> recipe(@RequestParam String id, @RequestBody RecipeModel recipe) {
        return recipeRepository.updateRecipe(id, recipe);
    }

    @DeleteMapping(value = "/recipe")
    List<RecipeModel> deleteRecipe(@RequestParam String id) {
        return recipeRepository.deleteRecipe(id);
    }
}