package headfirst.factory.pizzaaf;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory2 {
    public Dough createDough() {
        return new ThickCrustDough();
    }
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}