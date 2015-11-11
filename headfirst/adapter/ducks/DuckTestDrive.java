package headfirst.adapter.ducks;

public class DuckTestDrive
{
  public static void main(String[]args)
  {
    MallardDuck duck=new MallardDuck();
    WildTurkey turkey=new WildTurkey();
    TurkeyAdapter turkeyadapter=new TurkeyAdapter(turkey);
    System.out.println("Turkey says");
    turkey.gobble();
    turkey.fly();
    System.out.println("Turkey says");
    turkeyadapter.quack();
    turkeyadapter.fly();
    
  }
}