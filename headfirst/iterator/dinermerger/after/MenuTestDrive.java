 package headfirst.iterator.dinermerger.after;
  
  import java.util.*; 
 
 
 public class MenuTestDrive { 
     public static void main(String args[]) { 
          
         ArrayDinerMenu arraydinerMenu = new ArrayDinerMenu(); 
         ArrayListDinerMenu arrayListDinerMenu=new ArrayListDinerMenu(); 
   
         Waitress waitress = new Waitress(arrayListDinerMenu, arraydinerMenu); 
 
         waitress.printMenu(); 
     } 
 } 
