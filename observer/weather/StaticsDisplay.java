package headfirst.observer.weather;

import java.util.Observable;
import java.util.Observer;

import headfirst.observer.weather.WeatherData;

public class StaticsDisplay implements Observer, DisplayElement{ 
 
 
 Observable observable;      
 private float maxTemperature= 0;    
 private float minTemperature = 200;   
 private float tempSumTemperature= 0;    
  private float maxPressure= 0.0f;
   private float minPressure= 50.5f;
    private float presSumPressure = 0.0f; 
   private float maxHumidity=0;
    private float minHumidity=200;
    private float humSumHumidity=0;
 private int numReadings1;  
  private int numReadings2; 
  private int numReadings3; 
 
 
 public StaticsDisplay(Observable observable) 
 {  
  this.observable = observable;    
  observable.addObserver(this);    
 }
 public void update(Observable obs, Object arg) 
 {
  
  if(obs instanceof WeatherData)
  {
   WeatherData weatherData = (WeatherData)obs;
   float temp = weatherData.getTemperature();
   
   this.tempSumTemperature += temp;       
   numReadings1++;         
   if (temp > maxTemperature) 
   {     
    maxTemperature = temp;  
   }
   if (temp < minTemperature)
   {       
    minTemperature = temp;
   }
  ///////////////////////////////////
    float pres = weatherData.getPressure();
     this.presSumPressure += pres;       
     numReadings2++;         
   if (pres > maxPressure) 
   {     
    maxPressure = pres;  
   }
   if (pres < minPressure)
   {       
    minPressure = pres;
   }
 
    ///////////////////////////////////
   float hum = weatherData.getHumidity();
     this.humSumHumidity += hum;       
     numReadings3++;         
   if (hum > maxHumidity) 
   {     
    maxHumidity = hum;  
   }
   if (hum < minHumidity)
   {       
    minHumidity = hum;
   }
   display(); 
   
  }
  
 }
 
 public void display() {
   System.out.println("평균 온도 : "+ (tempSumTemperature / numReadings1) +" , 최대 온도 : "+ maxTemperature + ", 최저 온도 : " + minTemperature);
 System.out.println("평균 기압 : "+ (presSumPressure / numReadings2) +" , 최대 기압 : "+ maxPressure + ", 최저 기압 : " + minPressure);
 System.out.println("평균 습도 : "+ (humSumHumidity / numReadings3) +" , 최대 습도 : "+ maxHumidity + ", 최저 습도 : " + minHumidity );}
 

}
