package headfirst.state.gumballstate; 
 
 
 
 
 public class BreakState implements State { 
     GumballMachine gumballMachine; 
   
     public BreakState(GumballMachine gumballMachine) { 
         this.gumballMachine = gumballMachine; 
     } 
    
     public void insertQuarter() { 
         System.out.println("You can't insert another quarter because it is broken down"); 
          gumballMachine.setState(gumballMachine.getBreakState()); 
     } 
   
     public void ejectQuarter() { 
         System.out.println("it is broken down..."); 
          
     } 
   
     public void turnCrank() { 
         System.out.println("you don't need to turn crank because it is broken down..."); 
        
     } 
 
     public void dispense() { 
         System.out.println("You can't receive another quarter because it is broken down"); 
     } 
   
     public String toString() { 
         return "breaking down ...."; 
     } 
 } 
