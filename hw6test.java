package HW6;

public class hw6test {
    public static void main (String[] args){
        Ingredient hello = new Ingredient("pepper", "grams", 20);
        System.out.println(hello);
        RecipeIngredient hi = new RecipeIngredient("salt", "Teaspoons", 5, 4);
        System.out.println(hi);
        RecipeBook bye = new RecipeBook("Salt+PepperPizza");
        System.out.println(bye);
    }
}
