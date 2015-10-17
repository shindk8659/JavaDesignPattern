package headfirst.factory.pizzaaf;

public class SlicedPotatoStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory=new SlicedPotatoIngredientFactory();
        if (item.equals("potato")) {
            pizza = new PotatoPizza(ingredientFactory);
            pizza.setName("Sliced Style Potato Pizza");
        }
        
        return pizza;
    }
}
