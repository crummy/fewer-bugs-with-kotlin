@file:Suppress("unused", "ClassName")

package com.malcolmcrum.kotlindemo.bugs.kotlin

class RecipeBook_2_Exhaustive {
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

    fun getSubtitle(recipeId: Int): String {
        val recipe = recipes[recipeId] ?: throw NoSuchElementException("No recipe with id $recipeId")
        return when(recipe.category) {
            Category.APPETIZER -> "A delicious snack"
            Category.MAIN_COURSE -> "You'll enjoy this!"
            Category.DESSERT -> "A sweet treat"
        }
    }

    enum class Category {
        APPETIZER, MAIN_COURSE, DESSERT
    }

    data class Recipe(
        val id: Int,
        val title: String,
        val ingredients: List<Ingredient>,
        val method: String,
        val rating: Int?,
        val category: Category,
    )

    data class Ingredient(val amount: Int, val unit: String, val name: String)
}