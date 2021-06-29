package com.malcolmcrum.kotlindemo.bugs.kotlin

import com.malcolmcrum.kotlindemo.bugs.kotlin.RecipeBook_4_Inline.*
import org.junit.jupiter.api.Test

internal class RecipeBookTest {
    @Test
    fun `modifying mutable collection in Kotlin`() {
        val recipeBook = RecipeBook_3_Immutables()
        val custard = RecipeBook_3_Immutables.Recipe(1, "Custard", listOf(), "Whisk the eggs...", 3)
        recipeBook.addRecipe(custard)

        val myFavouriteRecipes = recipeBook.getRecipes()
        // myFavouriteRecipes.removeIf { (it.rating ?: 0) < 4 }

        if (recipeBook.getRecipes().contains(custard)) {
            println("It's OK - I found the recipe.")
        }
    }

    @Test
    fun `ambiguous method parameters`() {
        val recipeBook = RecipeBook_4_Inline()
        val sourCream = Ingredient(Ingredient.Id(1), 1000, "ml", "Sour cream")
        val bananaBread = Recipe(Recipe.Id(1), "Banana Bread", listOf(sourCream), "Add the sour cream!")
        recipeBook.addRecipe(bananaBread)
        // Kotlin won't let us get our IDs in the wrong order thanks to value classes.
//        recipeBook.updateIngredient(sourCream.id, bananaBread.id, 100, "ml", "Sour cream")

        val sweet = Sweet(true)
        val sour = Sour(false)
        val salty = Salty(false)
        val bitter = Bitter(false)
        val umami = Umami(true)
//        recipeBook.setFlavours(sourCream.id, salty, sweet, sour, bitter, umami)
    }
}