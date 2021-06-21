package com.malcolmcrum.kotlindemo.bugs.kotlin

import com.malcolmcrum.kotlindemo.bugs.kotlin.RecipeBook_4_Inline.*
import org.junit.jupiter.api.Test

internal class RecipeBookTest {
    @Test
    fun `modifying mutable collection in Kotlin`() {
        val recipeBook = RecipeBook_3_Immutables()
        val recipe = RecipeBook_3_Immutables.Recipe(1, "Custard", listOf(), "method", 3)
        recipeBook.addRecipe(recipe)
        val myFavouriteRecipes: Collection<RecipeBook_3_Immutables.Recipe> = recipeBook.getRecipes()
        myFavouriteRecipes.toMutableList().removeIf { (it.rating ?: 0) < 4 }
        assert(recipeBook.getRecipes().size == 1)
    }

    @Test
    fun `ambiguous method parameters`() {
        val recipeBook = RecipeBook_4_Inline()
        val ingredient = Ingredient(Ingredient.Id(1), 3, "cups", "Jelly mixture")
        val recipe = Recipe(Recipe.Id(1), "Jelly", listOf(ingredient), "method")
        recipeBook.addRecipe(recipe)
        // Kotlin won't let us get our IDs in the wrong order thanks to value classes.
//        recipeBook.updateIngredient(ingredient.id, recipe.id, 4, "cups", "Jelly mixture")

        val sweet = Sweet(true)
        val sour = Sour(false)
        val salty = Salty(false)
        val bitter = Bitter(false)
        val umami = Umami(true)
//        recipeBook.setFlavours(recipe.id, salty, sweet, sour, bitter, umami)
    }
}