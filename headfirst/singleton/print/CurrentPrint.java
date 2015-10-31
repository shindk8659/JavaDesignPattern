package headfirst.singleton.print;

public class CurrentPrint {
 private static CurrentPrint uniqueInstance;
    private static String print = ("second print");
     private static int printnum = 1;
 private CurrentPrint() {}
 
 public static CurrentPrint getInstance() {
  if (uniqueInstance == null) {
   uniqueInstance = new CurrentPrint();
  }
                System.out.println("CurrentPrint: "+print+printnum);
  return uniqueInstance;
 }
}
