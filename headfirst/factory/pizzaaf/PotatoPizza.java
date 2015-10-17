package headfirst.factory.pizzaaf;

public class PotatoPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
 
    public PotatoPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        potato = ingredientFactory.createPotato();
        
    }}