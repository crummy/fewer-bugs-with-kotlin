package com.malcolmcrum.kotlindemo.bugs.java;

import java.util.List;
import java.util.Objects;

public class Recipe {
    public final int id;
    public final String title;
    public final List<Ingredient> ingredients;
    public final String method;
    public final Integer rating;

    public Recipe(int id, String title, List<Ingredient> ingredients, String method, Integer rating) {
        this.id = id;
        this.title = title;
        this.ingredients = ingredients;
        this.method = method;
        this.rating = rating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, ingredients, method, rating);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return id == recipe.id &&
                Objects.equals(title, recipe.title) &&
                Objects.equals(ingredients, recipe.ingredients) &&
                Objects.equals(method, recipe.method);
    }
}
