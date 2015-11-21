package headfirst.templatemethod.barista;  
 
 
 import java.io.*; 
 
 
 public class CaramelMacchiatoWithHook extends CaffeineBeverageWithHook { 
   
  public void brew() { 
   System.out.println("Dripping espresso through filter, and makeing CaramelMacchiato"); 
  } 
   
  public void addCondiments() { 
   System.out.println("Adding more vanilla syrup ,milk, and caramel"); 
  } 
   
  public boolean customerWantsCondiments() { 
 
   String answer = getUserInput(); 
 
   if (answer.toLowerCase().startsWith("y")) { 
    return true; 
   } else { 
    return false; 
   } 
  } 
   
  private String getUserInput() { 
   String answer = null; 
 
   System.out.print("Would you like adding vanilla syrup ,milk and caramel with your caramelmacchiato (y/n)? "); 

   BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
  try { 
    answer = in.readLine(); 
   } catch (IOException ioe) { 
    System.err.println("IO error trying to read your answer"); 
   } 
   if (answer == null) { 
    return "no"; 
   } 
   return answer; 
  } 
 } 