package com.malcolmcrum.kotlindemo.bugs.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class RecipeBook_0 {
    final Map<Integer, Recipe> recipes = new HashMap<>();

    public Collection<Recipe> getRecipes() {
        return recipes.values();
    }

    public Recipe getRecipe(int recipeId) {
        return recipes.get(recipeId);
    }

    public void addRecipe(Recipe recipe) {
        recipes.put(recipe.id, recipe);
    }
}
