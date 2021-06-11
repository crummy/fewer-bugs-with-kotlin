@file:Suppress("unused", "ClassName")

package com.malcolmcrum.kotlindemo.bugs.kotlin

class RecipeBook_3_Immutables {
    private val recipes = mutableMapOf<Int, Recipe>()

    fun getRecipes(): Collection<Recipe> {
        return recipes.values;
    }

    fun getRecipe(recipeId: Int): Recipe? {
        return recipes[recipeId]
    }

    fun addRecipe(recipe: Recipe) {
        recipes[recipe.id] = recipe
    }

    data class Recipe(
        val id: Int,
        val title: String,
        val ingredients: List<Ingredient>,
        val method: String,
        val rating: Int?
    )

    data class Ingredient(val amount: Int, val unit: String, val name: String)
}