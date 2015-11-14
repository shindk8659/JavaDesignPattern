package headfirst.facade.hometheater;

public class Screen { 
  String description; 
   
  public Screen(String description) { 
   this.description = description; 
  } 
   
  public void up() { 
   System.out.println(description + " up"); 
  } 
   
  public void down() { 
   System.out.println(description + " down"); 
  } 
         public String toString() { 
                 return description; 
         } 
 } 
