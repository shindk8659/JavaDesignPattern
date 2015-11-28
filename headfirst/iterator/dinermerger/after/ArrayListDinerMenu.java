package headfirst.iterator.dinermerger.after;

import java.util.ArrayList; 
 
 
 public class ArrayListDinerMenu implements Menu { 
     ArrayList menu; 
   
     public ArrayListDinerMenu() { 
         menu = new ArrayList(); 
      
         addItem("���丮��", 
                 "���޴����� ����� ��췯���ִ� ���丮�� ���� ��", true, 4.99); 
         addItem("����", 
                 "���� ���� �������� �Ǿ��ִ� �α��ִ� �������", false, 5.99); 
         addItem("���� �ᳪ����", 
                 "�ż��� �ᳪ���� ���÷� �ÿ��ϰ� ���� ����", true, 5.29); 
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
