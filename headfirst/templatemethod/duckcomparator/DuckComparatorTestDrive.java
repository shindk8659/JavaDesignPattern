package headfirst.templatemethod.duckcomparator;
 
 
 import java.util.*; 
 
 
 public class DuckComparatorTestDrive 
 { 
   public static void main(String[] args) 
   { 
     Duck[] ducks = 
     {  
       new Duck("Hulk", 10),  
       new Duck("BlackWidow", 2), 
       new Duck("IronMan", 6), 
       new Duck("Thor", 7), 
       new Duck("CaptainAmerica", 4),  
       new Duck("Hawk-eye", 2) 
    }; 
     System.out.println("Before sorting:"); 
     display(ducks); 
     Arrays.sort(ducks,new DuckComparator()); 
     System.out.println("\nAfter sorting:"); 
     display(ducks); 
   } 
 
  public static void display(Duck[] ducks) 
  { 
    for (int i = 0; i < ducks.length; i++) 
   { 
      System.out.println(ducks[i]); 
    } 
  } 
 } 
