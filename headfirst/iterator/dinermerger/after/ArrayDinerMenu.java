package headfirst.iterator.dinermerger.after;

public class ArrayDinerMenu implements Menu { 
     static final int MAX_ITEMS = 3; 
     int numberOfItems = 0; 
     MenuItem[] menuItems; 
    
     public ArrayDinerMenu() { 
         menuItems = new MenuItem[MAX_ITEMS]; 
   
         addItem("��������", 
                 "������ ����κ��� ������ؼ� �����Դ� �������", false, 5.99); 
         addItem("����", 
                 "���� ���� �������� �Ǿ��ִ� �α��ִ� �������", false, 5.99); 
     
         addItem("���� �ᳪ����", 
                 "�ż��� �ᳪ���� ���÷� �ÿ��ϰ� ���� ����", true, 5.29); 
         
  } 
     public void addItem(String n, String d, boolean v, double p) { 
         MenuItem menuItem = new MenuItem(n, d, v, p); 
         if (numberOfItems >= MAX_ITEMS) { 
             System.err.println("Sorry, menu is full!  Can't add item to menu"); 
         }  
         else  
         { 
           
           menuItems[numberOfItems] = menuItem; 
           numberOfItems = numberOfItems + 1; 
             
           
       
           } 
         } 
        
 
      
     public MenuItem[] getMenuItems() { 
         return menuItems; 
     } 
     public Iterator createIterator() { 
         return new ArrayDinerMenuIterator(menuItems); 
     } 
     // other menu methods here 
 } 
