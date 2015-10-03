package headfirst.observer.weather;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer,DisplayElement{
  Observable observable;
  private float currentPressure =29.92f;
  private float lastPressure;
  
  public ForecastDisplay(Observable observable){
     this.observable = observable;
    observable.addObserver(this);
  }
  
  public void update (Observable obs,Object arg){
    if(obs instanceof WeatherData)
    { 
      WeatherData weatherData = (WeatherData)obs;
      lastPressure = currentPressure;
      currentPressure = weatherData.getPressure();
      display();
    }
  }
  public void display()
  {
    System.out.print("예보: ");
  if (currentPressure > lastPressure)//현재랑 비교해서 현재가 더클때
  {
   System.out.println("기압 증가했습니다");
  } 
  else if (currentPressure == lastPressure)//현재와 같을경우
  {
   System.out.println("기압 변동 없습니다");
  } 
  else if (currentPressure < lastPressure) //현재가 더 작을경우
  {
   System.out.println("기압 하강했습니다");
  }
 
 }
}