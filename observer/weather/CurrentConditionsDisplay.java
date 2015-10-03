package headfirst.observer.weather;
import java.util.Observable;
import java.util.Observer;

 
public class CurrentConditionsDisplay implements Observer,DisplayElement {
Observable observable;
  private float temperature;
 private float humidity;

 
 public CurrentConditionsDisplay(Observable observable) {
  this.observable = observable;
  observable.addObserver(this);
 }
 
 public void update(Observable obs,Object arg) {
   if(obs instanceof WeatherData){
     WeatherData weatherData = (WeatherData)obs;
  this.temperature = weatherData.getTemperature();
  this.humidity = weatherData.getHumidity();
  display();
   }}
 
 public void display()
 {
  System.out.println("현재온도 : " + temperature + "현재습도 :" + humidity + "% humidity");
 }
}
