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

//    fun updateRecipeRating(recipeId: Int, rating: Int?) {
//        val recipe = recipes[recipeId]
//        val updated = Recipe(
//            recipe.id,
//            recipe.title,
//            recipe.ingredients,
//            recipe.method,
//            rating
//        )
//        recipes[recipeId] = updated
//    }

//    fun getAverageRating(): Double {
//        var total = 0
//        for (recipe in recipes.values) {
//            total += recipe.rating
//        }
//        return total.toDouble() / recipes.size
//    }

//    fun getActualAverageRating(): Double {
//        return recipes.values
//            .map { it.rating }
//            .filterNotNull()
//            .average()
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