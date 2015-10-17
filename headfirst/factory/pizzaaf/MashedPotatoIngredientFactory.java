package headfirst.factory.pizzaaf;

public class MashedPotatoIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
     public Potato createPotato() {
        return new MashedPotato();
    }
   
}