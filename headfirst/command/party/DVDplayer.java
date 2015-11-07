package headfirst.command.party; 
 

 public class DVDplayer { 
  String dvd; 
 
 
  public DVDplayer(String dvd) { 
   this.dvd = dvd; 
  } 
 
 
  public void on() { 
   System.out.println(dvd + " DVDplayer is on"); 
  } 
 
 
  public void off() { 
   System.out.println(dvd + " DVDplayer is off"); 
  } 
 
 
  public void setDVD() { 
   System.out.println(dvd + " DVDplayer is set for DVD input"); 
  } 
 
 
  public void setVolume(int volume) { 
  
   System.out.println(dvd + " DVDplayer volume set to " + volume); 
  } 
 } 
