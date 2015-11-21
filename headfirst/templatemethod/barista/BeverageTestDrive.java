package headfirst.templatemethod.barista; 
 
 
 public class BeverageTestDrive { 
  public static void main(String[] args) { 
   
   Tea tea = new Tea(); 
   Coffee coffee = new Coffee(); 
   CaramelMacchiato caramel = new CaramelMacchiato();
   
   System.out.println("\nMaking tea..."); 
   tea.prepareRecipe(); 
   
   System.out.println("\nMaking coffee..."); 
   coffee.prepareRecipe(); 
   
    System.out.println("\nMaking caramelmacchiato..."); 
   caramel.prepareRecipe(); 
 
   
   TeaWithHook teaHook = new TeaWithHook(); 
   CoffeeWithHook coffeeHook = new CoffeeWithHook(); 
   CaramelMacchiatoWithHook caramelHook = new CaramelMacchiatoWithHook();
   
   System.out.println("\nMaking tea..."); 
   teaHook.prepareRecipe(); 
   
   System.out.println("\nMaking coffee..."); 
   coffeeHook.prepareRecipe(); 
   
   System.out.println("\nMaking caramelmacchiato..."); 
   caramelHook.prepareRecipe(); 
  } 
 } 
