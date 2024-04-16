package HW6;

public class RecipeIngredient extends Ingredient{
    protected float quantity;
    public RecipeIngredient(){
        
    }public RecipeIngredient(String name, String measuringUnit, int CaloriesPerUnit, float quantity ){
        super(name, measuringUnit,CaloriesPerUnit);
        this.quantity = quantity;

    }public RecipeIngredient(Ingredient ingredient){

    }
    public float getQuantity(){
        return quantity;

    }public void setQuantity(float newQuantity){
        newQuantity = quantity;

    }public String getRecipeIngredientName(){
        return this.name;

    }public String toString(){
        String st = "Quantity: " + getQuantity();
        return st;
    }
}
