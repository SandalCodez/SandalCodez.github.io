package HW6;
import java.util.ArrayList;

public class CookingRecipe extends RecipeIngredient{
  
    public CookingRecipe(){


    }public CookingRecipe(String name){
        super.name = name;
    
    }public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity){
       if(super.name.equals(ingredient.getName())&&super.measuringUnit.equals(ingredient.getMeasuringUnit())&&super.caloriesPerUnit==ingredient.getCaloriesPerUnit()){
        super.quantity = quantity;
       }
       ingredient.setName(this.name);                   
       ingredient.setMeasuringUnit(this.measuringUnit);
       ingredient.setCaloriesPerUnit(this.caloriesPerUnit);
    
    }public RecipeIngredient getRecipeIngredient(Ingredient ingredient){
        
        RecipeIngredient ans = new RecipeIngredient(ingredient);
        return ans;

    }public RecipeIngredient getRecipeIngredient(String ingredientName){
        if(ingredientName.equals(this.getRecipeIngredient(ingredientName)));
            RecipeIngredient anw = new RecipeIngredient (ingredientName, measuringUnit, caloriesPerUnit, quantity);
        return anw;
    }public RecipeIngredient removeRecipreIngredient(Ingredient ingredient){
        RecipeIngredient none = new RecipeIngredient("", measuringUnit, caloriesPerUnit, quantity);
        return none;
    }public RecipeIngredient removeRecipeIngredient(String ingredientName){
        if(this.getRecipeIngredient(ingredientName).equals(ingredientName));
        RecipeIngredient gang = new RecipeIngredient("", measuringUnit, caloriesPerUnit, quantity);
        return gang;
    }public float calculateCalories(){
        float count=0;
        for (RecipeIngredient recipeIngredient : recipeIngredients) {
            count+= recipeIngredient.getIngredient().getCaloriesPerUnit() * recipeIngredient.getQuantity();
        }return count;
        
    }public int getNumberOfIngredients(){
        int num = (int)super.quantity;
        return num;
    }
}