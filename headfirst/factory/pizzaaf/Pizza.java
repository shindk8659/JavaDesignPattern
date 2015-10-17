package headfirst.factory.pizzaaf;

public abstract  class Pizza {
 String name;
 
abstract void prepare() {
  System.out.println("Preparing " + name);
 }
 public void bake() {
  System.out.println("Baking " + name);
 }
 public void cut() {
  System.out.println("Cutting " + name);
 }
 public void box() {
  System.out.println("Boxing " + name);
 }
 public String getName(){
 return name;
 }
 public String toString() {
System.out.println("---- " + name + " ----\n");
return name;
  }
  
}

