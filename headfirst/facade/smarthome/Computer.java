package headfirst.facade.smarthome;

public class Computer { 
  String description; 
  String system; 
   
  public Computer(String description) { 
   this.description = description; 
  } 
   
  public void on() { 
   System.out.println(description + " on"); 
  } 
   
  public void off() { 
   System.out.println(description + " off"); 
  } 
 
 
         
  public void systemBooting(String system) { 
   this.system = system; 
   System.out.println(description + "\"" + system + "\""); 
  } 
 
   
  public String toString() { 
   return description; 
  } 
 } 
