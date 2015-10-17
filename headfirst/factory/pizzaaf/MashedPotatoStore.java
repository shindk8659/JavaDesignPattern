package headfirst.factory.pizzaaf;

public class MashedPotatoStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory=new MashedPotatoIngredientFactory();
        if (item.equals("potato")) {
            pizza = new PotatoPizza(ingredientFactory);
            pizza.setName("Mashed Style Potato Pizza");
        }
        
        return pizza;
    }
}
