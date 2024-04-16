package HW6;
import java.util.ArrayList;
public class RecipeBook extends CookingRecipe{
    private String bookName;
    private ArrayList<CookingRecipe> recipes;
    public RecipeBook(String bookName){
        this.bookName = bookName;
        this.recipes = new ArrayList<CookingRecipe>();
    }public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
        for (CookingRecipe recipe : recipes) {
        if (recipe.getName().equals(name)) {
        return null;
                }
        }
        CookingRecipe recipe = new CookingRecipe(name, ingredients);
        recipes.add(recipe);
        return recipe;
    }public CookingRecipe removeRecipe(String name) {
        for (int i = 0; i < recipes.size(); i++) {
        CookingRecipe recipe = recipes.get(i);
        if (recipe.getName().equals(name)) {
            recipes.remove(i);
             return recipe;
            }
        }
        return null;
    }public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
        ArrayList<CookingRecipe> matchingRecipes = new ArrayList<CookingRecipe>();
        for (CookingRecipe recipe : recipes) {
            if (recipe.containsIngredients(ingredients)) {
                matchingRecipes.add(recipe);
            }
        }if (matchingRecipes.isEmpty()) {
            return null;
        } else {
            CookingRecipe[] result = new CookingRecipe[matchingRecipes.size()];
            for (int i = 0; i < matchingRecipes.size(); i++) {
                result[i] = matchingRecipes.get(i);
            }return result;
        }
    }public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
        ArrayList<CookingRecipe> matchingRecipes = new ArrayList<CookingRecipe>();
        for (CookingRecipe recipe : recipes) {
            if (recipe.getNumberOfIngredients() <= numberOfIngredients) {
                matchingRecipes.add(recipe);
            }
        }if (matchingRecipes.isEmpty()) {
            return null;
        } else {
            CookingRecipe[] result = new CookingRecipe[matchingRecipes.size()];
            for (int i = 0; i < matchingRecipes.size(); i++) {
                result[i] = matchingRecipes.get(i);
            }return result;
        }
    }public CookingRecipe[] findRecipesLowCalories() {
        ArrayList<CookingRecipe> lowCalorieRecipes = new ArrayList<CookingRecipe>();
        int lowestCalories = Integer.MAX_VALUE;
        for (CookingRecipe recipe : recipes) {
            float calories = recipe.calculateCalories();
            if (calories < lowestCalories) {
                lowCalorieRecipes.clear();
                lowCalorieRecipes.add(recipe);
                lowestCalories = (int)calories;
            } else if (calories == lowestCalories) {
                lowCalorieRecipes.add(recipe);
            }
        }if (lowCalorieRecipes.isEmpty()) {
            return null;
        } else {
            CookingRecipe[] result = new CookingRecipe[lowCalorieRecipes.size()];
            for (int i = 0; i < lowCalorieRecipes.size(); i++) {
                result[i] = lowCalorieRecipes.get(i);
            }
            return result;
        }
    }public String toString(){
        String st = "BookName: " + bookName;
        return st;
    }
    }
