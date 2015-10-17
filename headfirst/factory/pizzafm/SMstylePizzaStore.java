package headfirst.factory.pizzafm;

public class SMstylePizzaStore extends PizzaStore {
 Pizza createPizza(String item) {
  if (item.equals("cheese")) {
   return new SMstyleCheesePizza();
  } else if (item.equals("veggie")) {
   return new SMstyleVeggiePizza();
  } else if (item.equals("clam")) {
   return new SMstyleClamPizza();
  } else if (item.equals("pepperoni")) {
   return new SMstylePepperoniPizza();
  } else return null;
 }
}