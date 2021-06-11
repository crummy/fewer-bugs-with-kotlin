package com.malcolmcrum.kotlindemo.bugs.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class RecipeBook_1 {
    private final Map<Integer, Recipe> recipes = new HashMap<>();

    public Collection<Recipe> getRecipes() {
        return recipes.values();
    }

    public Recipe getRecipe(int recipeId) {
        return recipes.get(recipeId);
    }

    public void addRecipe(Recipe recipe) {
        recipes.put(recipe.id, recipe);
    }

    public void updateRating(int recipeId, int rating) {
        Recipe recipe = recipes.get(recipeId);
        Recipe updated = new Recipe(recipeId,
                recipe.title,
                recipe.ingredients,
                recipe.method,
                rating);
        recipes.put(recipeId, updated);
    }

    public float getAverageRating() {
        int total = 0;
        for (Recipe recipe : recipes.values()) {
            total += recipe.rating;
        }
        return (float)total / recipes.size();
    }
}
