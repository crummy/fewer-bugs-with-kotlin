@file:Suppress("unused", "ClassName")

package com.malcolmcrum.kotlindemo.bugs.kotlin

class RecipeBook_1_NullSafety {
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

//    fun updateRecipeTitle(recipeId: Int, title: String) {
//        val recipe = recipes[recipeId]
//        val updated = recipe.copy(title = title)
//        recipes[recipeId] = updated
//    }

//    fun getAverageRating(): Float {
//        var total = 0
//        for (recipe in recipes.values) {
//            total += recipe.rating
//        }
//        return total.toFloat() / recipes.size
//    }

    data class Recipe(
        val id: Int,
        val title: String,
        val ingredients: List<Ingredient>,
        val method: String,
        val rating: Int?
    )

    data class Ingredient(val amount: Int, val unit: String, val name: String)
}