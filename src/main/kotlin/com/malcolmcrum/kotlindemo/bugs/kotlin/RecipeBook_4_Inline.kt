package com.malcolmcrum.kotlindemo.bugs.kotlin

class RecipeBook_4_Inline {
    private val recipes = mutableMapOf<Recipe.Id, Recipe>()

    fun getRecipes(): Collection<Recipe> {
        return recipes.values
    }

    fun getRecipe(recipeId: Recipe.Id): Recipe? {
        return recipes[recipeId]
    }

    fun addRecipe(recipe: Recipe) {
        recipes[recipe.id] = recipe
    }

    fun updateIngredient(recipeId: Recipe.Id, ingredientId: Ingredient.Id, amount: Int, unit: String, name: String) {
        TODO()
    }

    fun setFlavours(recipeId: Recipe.Id, isSweet: Sweet, isSalty: Salty, isSour: Sour, isBitter: Bitter, isUmami: Umami) {
        TODO()
    }

    data class Recipe(
        val id: Id,
        val title: String,
        val ingredients: List<Ingredient>,
        val method: String,
    ) {
        @JvmInline value class Id(val id: Int)
    }

    data class Ingredient(
        val id: Id,
        val amount: Int,
        val unit: String,
        val name: String
    ) {
        @JvmInline value class Id(val id: Int)
    }

    @JvmInline value class Sweet(val isSweet: Boolean)
    @JvmInline value class Salty(val isSweet: Boolean)
    @JvmInline value class Sour(val isSweet: Boolean)
    @JvmInline value class Bitter(val isSweet: Boolean)
    @JvmInline value class Umami(val isSweet: Boolean)
}