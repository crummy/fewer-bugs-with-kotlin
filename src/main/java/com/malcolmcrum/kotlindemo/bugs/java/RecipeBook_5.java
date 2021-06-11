package com.malcolmcrum.kotlindemo.bugs.java;

import java.util.*;

public class RecipeBook_5 extends RecipeBook_0 {

    public Collection<Recipe> getrecipes() {
        return new ArrayList<>(recipes.values());
    }

    public Recipe getRandomRecipe() {
        boolean coinToss = new Random().nextBoolean();
        if (coinToss = true) {
            // TODO: return my favourite recipe
        } else {
            // TODO: return a random recipe
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
