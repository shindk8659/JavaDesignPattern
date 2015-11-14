package headfirst.facade.hometheater;

public class HomeTheaterTest { 
  public static void main(String[] args) { 
   Amplifier amp = new Amplifier("My Amplifier"); 
   Tuner tuner = new Tuner("My AM/FM Tuner", amp); 
   DvdPlayer dvd = new DvdPlayer("My DVD Player", amp); 
   CdPlayer cd = new CdPlayer("My CD Player", amp); 
   Projector projector = new Projector("My Projector", dvd); 
   Light light = new Light("Living Room Lights"); 
   Screen screen = new Screen("Theater Screen"); 
   Computer computer=new Computer("Living Room Computer"); 
   Cellphone cellphone=new Cellphone("My CellPhone");   
    
   HomeTheaterFacade homeTheater =  
     new HomeTheaterFacade(amp, tuner, dvd, cd,  
       projector, screen, light, cellphone,computer); 
   
   homeTheater.watchMovie("Matrix"); 
   homeTheater.endMovie(); 
   homeTheater.beginStudy(); 
   homeTheater.endStudy(); 
  } 
 } 
