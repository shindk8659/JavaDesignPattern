package headfirst.command.undo; 
 
 
 public class DVDplayerOnCommand implements Command { 
  DVDplayer dvd; 
  int volumn; 
   
  public DVDplayerOnCommand(DVDplayer dvd)
  { 
      this.dvd=dvd; 
   } 
   
  public void undo() { 
   dvd.volumeLevel(volumn); 
  
  } 
 

  public void execute(){ 
  volumn=dvd.getvolumnLevel(); 
     dvd.on();  
      dvd.setDVD();
  } 
 } 
