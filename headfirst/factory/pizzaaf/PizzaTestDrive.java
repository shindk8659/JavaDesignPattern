package headfirst.factory.pizzaaf;

public class PizzaTestDrive {
    public static void main(String[] args) {
      
        PizzaStore slicedStore = new SlicedPotatoStore();
        PizzaStore mashedStore = new MashedPotatoStore();
            PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
 
       
         Pizza pizza = slicedStore.orderPizza("potato");
        System.out.println("Ethan ordered a " + pizza + "\n");
        pizza = mashedStore.orderPizza("potato");
        System.out.println("Joel ordered a " + pizza + "\n");
        
        
        pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");
 
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        
        
 }
}
