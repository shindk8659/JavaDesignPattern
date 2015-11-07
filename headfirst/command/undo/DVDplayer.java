package headfirst.command.undo; 
 

 public class DVDplayer { 
  String dvd; 
  int volume; 

 
  public void volumeLevel(int volume) { 
  this.volume = volume; 
  if (volume == 0) 
  { 
    off(); 
   } 
   else 
   { 
    System.out.println("DVD Player is on , Player Volume level is " + volume + "%"); 
   } 
  } 
  
public int getvolumnLevel() { 
   return volume; 
  } 

 
 
  public DVDplayer(String dvd) 
  { 
   this.dvd = dvd; 
  } 
 
 
  public void on() 
  { 
    volume=100;
   System.out.println(dvd + " DVDplayer is on"); 
  } 
 
 
  public void off() { 
    volume=0;
   System.out.println(dvd + " DVDplayer is off"); 
  } 
 
 
  public void setDVD() { 
   System.out.println(dvd + " Set your DVD."); 
  } 
 }
 
  
