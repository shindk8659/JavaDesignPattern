package headfirst.singleton.print;

public class SingletonMain {
 public static void main(String[] args) {

   CurrentPrint print1 = CurrentPrint.getInstance();
  PreviousPrint print2 = PreviousPrint.getInstance();
  CurrentPrint print3 = CurrentPrint.getInstance();
  PreviousPrint print4 = PreviousPrint.getInstance();
  CurrentPrint print5 = CurrentPrint.getInstance();
  PreviousPrint print6 = PreviousPrint.getInstance();
 }
}
