package headfirst.iterator.dinermerger.after;
import java.util.ArrayList; 
 
 
 public class ArrayListDinerMenuIterator implements Iterator { 
     ArrayList items; 
     int position = 0; 
     public ArrayListDinerMenuIterator(ArrayList items) { 
         this.items = items; 
     } 
     public Object next() { 
         Object object = items.get(position); 
         position = position + 1; 
         return object; 
     } 
     public boolean hasNext() { 
         if (position >= items.size()) { 
             return false; 
         } else { 
             return true; 
         } 
     } 
 } 
