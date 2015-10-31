package headfirst.singleton.print;

public class PreviousPrint {
 private static PreviousPrint uniqueInstance;
    private static String print= ("first print");
       private static int printnum = 0;
 private PreviousPrint() {}
 
 public static PreviousPrint getInstance() {
  if (uniqueInstance == null) {
   uniqueInstance = new PreviousPrint();
  }
                System.out.println("PreviousPrint: "+print+printnum);
  return uniqueInstance;
 }
}
