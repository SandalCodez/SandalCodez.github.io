package HW6;

public class Ingredient {
    protected String name;
    protected String measuringUnit;
    protected int caloriesPerUnit;
    
    public Ingredient(){

    }public Ingredient(String name, String measuringUnit, int CaloriesPerUnit){
    this.name = name;
    this.measuringUnit = measuringUnit;
    this.caloriesPerUnit = CaloriesPerUnit;

    }public Ingredient getIngredient(){
        Ingredient get = new Ingredient(name, measuringUnit, caloriesPerUnit);
        return get;
    }
    public String getName(){
        return name;

    }public String getMeasuringUnit(){
        return measuringUnit;

    }public int getCaloriesPerUnit(){
        return caloriesPerUnit;

    }public void setName(String newName){
        newName = name;

    }public void setMeasuringUnit(String newMeasuringUntit){
        newMeasuringUntit = measuringUnit;

    }public void setCaloriesPerUnit(int newCaloriesPerUnit){
        newCaloriesPerUnit = caloriesPerUnit;
    }public String toString(){
        String st = "Ingredient\n" + "name=" + name +"\n" + "measuringUnit=" + measuringUnit + "\n" + "caloriesPerUnit:" + caloriesPerUnit;
        return st;
    }
}
