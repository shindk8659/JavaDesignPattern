package headfirst.templatemethod.duckcomparator;

import java.util.Comparator; 
 
 
 public class DuckComparator implements Comparator<Duck> 
 { 
   public int compare(Duck duck1, Duck duck2) 
   { 
     if (duck1.weight < duck2.weight) 
     { 
       return -1; 
     } 
     else if (duck1.weight == duck2.weight)
     { 
       return 0; 
     } 
     else 
     { 
       return 1; 
     }
   } 
 } 
