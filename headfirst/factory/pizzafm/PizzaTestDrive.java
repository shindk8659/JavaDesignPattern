package headfirst.factory.pizzafm;

public class PizzaTestDrive { 
 public static void main(String[] args) {
  PizzaStore smstore = new SMstylePizzaStore();
 
  
  Pizza pizza = smstore.orderPizza("cheese");
  System.out.println("Joel ordered a " + pizza.getName() + "\n");
  pizza = smstore.orderPizza("clam");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
  pizza = smstore.orderPizza("pepperoni");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
  pizza = smstore.orderPizza("veggie");
  System.out.println("Joel ordered a " + pizza.getName() + "\n");
 }
}
