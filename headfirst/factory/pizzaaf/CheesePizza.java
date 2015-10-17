package headfirst.factory.pizzaaf;

public class CheesePizza extends Pizza{
  PizzaIngredientFactory ingredientFactory;
  public CheesePizza(PizzaIngredientFactory ingredientFactory){
  this.ingredientFactory=ingredientFactory;
  name="CheesPizza";
  }
  void prepare(){
  
    System.out.println("preraring"+name);
    dough=ingredientFactory.createDough();
    cheese=ingredientFactory.createCheese();
  }
}