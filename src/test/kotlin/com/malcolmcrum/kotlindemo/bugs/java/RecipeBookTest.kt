package com.malcolmcrum.kotlindemo.bugs.java

import org.junit.jupiter.api.Test

internal class RecipeBookTest {
    @Test
    fun `null pointer exception when summing ints`() {
        val recipeBook = RecipeBook_1()
        val bananaBread = Recipe(1, "Banana Bread", listOf(), "method", null)
        val tapiocaPudding = Recipe(2, "Chocolate Hazelnut Tapioca Pudding", listOf(), "method", 5)
        val feijoaIceCream = Recipe(3, "Feijoa Ice Cream", listOf(), "method", 4)
        recipeBook.addRecipe(bananaBread)
        recipeBook.addRecipe(tapiocaPudding)
        recipeBook.addRecipe(feijoaIceCream)
        val average = recipeBook.averageRating
        println("average: $average")
    }

    @Test
    fun `modifying mutable collection`() {
        val recipeBook = RecipeBook_3()
        val custard = Recipe(1, "Custard", listOf(), "Whisk the eggs...", 3)
        recipeBook.addRecipe(custard)

        val myFavouriteRecipes = recipeBook.getRecipes()
        myFavouriteRecipes.removeIf { it.rating == null || it.rating < 4 }

        if (!recipeBook.getRecipes().contains(custard)) {
            throw Error("Where is the custard recipe??")
        }
    }

    @Test
    fun `ambiguous method parameters`() {
        val recipeBook = RecipeBook_4()
        val sourCream = Ingredient(2, 1250, "ml", "Sour Cream")
        val bananaBread = Recipe(1, "Banana Bread", listOf(), "method", 3)
        recipeBook.addRecipe(bananaBread)
        // hmm...
        recipeBook.updateIngredientAmount(sourCream.id, bananaBread.id, 125, "ml", "Sour Cream")

        val isSweet = true
        val isSalty = false
        val isSour = false
        val isBitter = false
        val isUmami = true
        // oh no
        recipeBook.setFlavours(bananaBread.id, isSalty, isSweet, isSour, isBitter, isUmami)
    }
}