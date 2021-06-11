package com.malcolmcrum.kotlindemo.bugs.java;

import java.util.*;

@SuppressWarnings("unused")
public class RecipeBook_2 {
    private final Map<Integer, RecipeWithCategory> recipes = new HashMap<>();

    public Collection<RecipeWithCategory> getRecipes() {
        return recipes.values();
    }

    public RecipeWithCategory getRecipe(int recipeId) {
        return recipes.get(recipeId);
    }

    public void addRecipe(RecipeWithCategory recipe) {
        recipes.put(recipe.id, recipe);
    }

    public String getSubtitle(int recipeId) {
        RecipeWithCategory recipe = recipes.get(recipeId);
        if (recipe == null) throw new NoSuchElementException("No recipe found with id " + recipeId);

        String subtitle = null;
        switch(recipe.category) {
            case APPETIZER -> subtitle = "A delicious snack";
            case MAIN_COURSE -> subtitle = "You'll enjoy this!";
            case DESSERT -> subtitle = "A sweet treat";
        }
        return subtitle;
    }

    enum Category {
        APPETIZER, MAIN_COURSE, DESSERT
    }

    static class RecipeWithCategory extends Recipe {
        public final Category category;

        public RecipeWithCategory(int id, String title, List<Ingredient> ingredients, String method, Integer rating, Category category) {
            super(id, title, ingredients, method, rating);
            this.category = category;
        }
    }
}
