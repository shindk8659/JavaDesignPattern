package headfirst.iterator.dinermerger.after;

import java.util.ArrayList; 
 
 
 public class ArrayListDinerMenu implements Menu { 
     ArrayList menu; 
   
     public ArrayListDinerMenu() { 
         menu = new ArrayList(); 
      
         addItem("도토리묵", 
                 "새콤달콤한 양념이 어우러져있는 도토리로 만든 묵", true, 4.99); 
         addItem("삼겹살", 
                 "비계와 살이 세겹으로 되어있는 인기있는 돼지고기", false, 5.99); 
         addItem("맑은 콩나물국", 
                 "신선한 콩나물과 마늘로 시원하게 끓인 국물", true, 5.29); 
     } 
     public void addItem(String name, String description, boolean vegetarian, double price) { 
         MenuItem menuitem = new MenuItem(name, description, vegetarian, price); 
         if(menuitem.getVeget()){ 
           menu.add(menuitem);} 
     } 
     public ArrayList getMenuItems() { 
         return menu; 
     } 
     public Iterator createIterator() { 
         return new ArrayListDinerMenuIterator(menu); 
     } 
     public String toString() { 
         return "Objectville Pancake House Menu"; 
     } 
 } 
