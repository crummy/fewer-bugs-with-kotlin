package com.malcolmcrum.kotlindemo.bugs.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class RecipeBook_4 {
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

    public void updateIngredientAmount(int recipeId, int ingredientId, int amount, String unit, String name) {
        // TODO
    }

    public void setFlavours(int recipeId, boolean isSweet, boolean isSalty, boolean isSour, boolean isBitter, boolean isUmami) {
        // TODO
    }
}
