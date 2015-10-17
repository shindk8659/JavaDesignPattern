package headfirst.factory.pizzaaf;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory2 {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}