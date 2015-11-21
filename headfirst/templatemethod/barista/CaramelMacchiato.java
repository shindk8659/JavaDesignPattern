package headfirst.templatemethod.barista; 

public class CaramelMacchiato extends CaffeineBeverage { 
  public void brew() { 
   System.out.println("Dripping espresso through filter, and makeing CaramelMacchiato"); 
  } 
  public void addCondiments() { 
   System.out.println("Adding vanilla syrup, caramel and milk"); 
  } 
 } 
