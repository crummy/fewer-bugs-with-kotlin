package com.malcolmcrum.kotlindemo.bugs.java

import org.junit.jupiter.api.Test

internal class RecipeBookTest {
    @Test
    fun `null pointer exception when summing ints`() {
        val recipeBook = RecipeBook_1()
        val recipe1 = Recipe(1, "Chicken Parma", listOf(), "method", null)
        val recipe2 = Recipe(2, "Quesedillas", listOf(), "method", 5)
        val recipe3 = Recipe(3, "Feijoa Icecream", listOf(), "method", 4)
        recipeBook.addRecipe(recipe1)
        recipeBook.addRecipe(recipe2)
        recipeBook.addRecipe(recipe3)
        val average = recipeBook.averageRating
        println("average: $average")
    }

    @Test
    fun `modifying mutable collection`() {
        val recipeBook = RecipeBook_3()
        val recipe = Recipe(1, "Recipe", listOf(), "method", 3)
        recipeBook.addRecipe(recipe)
        val myFavouriteRecipes = recipeBook.getRecipes()
        myFavouriteRecipes.removeIf { it.rating == null || it.rating < 4 }
        assert(recipeBook.getRecipes().size == 1)
    }

    @Test
    fun `ambiguous method parameters`() {
        val recipeBook = RecipeBook_4()
        val ingredient = Ingredient(2, 3, "cups", "Jelly powder")
        val recipe = Recipe(1, "Recipe", listOf(), "method", 3)
        recipeBook.addRecipe(recipe)
        // hmm...
        recipeBook.updateIngredientAmount(ingredient.id, recipe.id, 4, "cups", "Jelly powder")
        val isSweet = true
        val isSalty = false
        val isSour = false
        val isBitter = false
        val isUmami = true
        // oh no
        recipeBook.setFlavours(recipe.id, isSweet, isSalty, isSour, isBitter, isUmami)
    }
}