package headfirst.iterator.dinermerger.after;

public class Waitress { 
     ArrayListDinerMenu arrayListDinerMenu; 
     ArrayDinerMenu arraydinerMenu; 
   
     public Waitress(ArrayListDinerMenu arrayListDinerMenu, ArrayDinerMenu arraydinerMenu) { 
         this.arrayListDinerMenu =  arrayListDinerMenu; 
         this.arraydinerMenu = arraydinerMenu; 
     } 
     public void printMenu() { 
         Iterator arrayListDinerIterator = arrayListDinerMenu.createIterator(); 
         Iterator arraydinerIterator = arraydinerMenu.createIterator(); 
 
 
         System.out.println("\nCase of using ArrayList"); 
         printMenu(arrayListDinerIterator); 
         System.out.println("\nCase of using Array"); 
         printMenu(arraydinerIterator); 
     } 
     private void printMenu(Iterator iterator) { 
         while (iterator.hasNext()) { 
             MenuItem menuItem = (MenuItem)iterator.next(); 
             if(menuItem.getVeget()){ 
             System.out.print(menuItem.getName() + ", "); 
             System.out.print(menuItem.getPrice() + " -- "); 
             System.out.println(menuItem.getDescription()); 
             } 
         } 
     } 
 } 

