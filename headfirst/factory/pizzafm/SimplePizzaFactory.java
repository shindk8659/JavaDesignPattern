package headfirst.factory.pizzafm;

public class SimplePizzaFactory {

public Pizza createPizza(String style, String type) { 
   Pizza pizza = null; 
   if (style.equals("SM")) { 
    if (type.equals("cheese")) { 
     pizza = new SMstyleCheesePizza(); 
   } else if (type.equals("veggie")) { 
     pizza = new SMstyleVeggiePizza(); 
    } else if (type.equals("clam")) { 
     pizza = new SMstyleClamPizza(); 
    } else if (type.equals("pepperoni")) { 
     pizza = new SMstylePepperoniPizza(); 
    } 
   }  else { 
    System.out.println("Error: invalid type of pizza"); 
    return null; 
   } 
  
pizza.prepare(); 
   pizza.bake(); 
   pizza.cut(); 
   pizza.box(); 
   return pizza; 
  } 
 } 
