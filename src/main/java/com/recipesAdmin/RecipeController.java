package com.recipesAdmin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecipeController {

    @Autowired
    private IRecipeService recipeService;

    @GetMapping(value = "/recipes")
    public List<RecipeModel> getRecipes() {
        return recipeService.findAll();
    }

    @GetMapping(value = "/recipe")
    public RecipeModel getRecipe(@RequestParam String id) {
        return recipeService.findById(id);
    }

    @PostMapping(value = "/recipe")
    List<RecipeModel> addRecipe(@RequestBody RecipeModel recipe) {
        return recipeService.createRecipe(recipe);
    }

    @PatchMapping(value = "/recipe")
    List<RecipeModel> recipe(@RequestParam String id, @RequestBody RecipeModel recipe) {
        return recipeService.updateRecipe(id, recipe);
    }

    @DeleteMapping(value = "/recipe")
    List<RecipeModel> deleteRecipe(@RequestParam String id) {
        return recipeService.deleteRecipe(id);
    }
}