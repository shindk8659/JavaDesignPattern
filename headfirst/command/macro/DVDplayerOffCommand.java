package headfirst.command.party; 
 
 
 public class DVDplayerOffCommand implements Command { 
  DVDplayer dvd; 
 int volumn; 
   
  public DVDplayerOffCommand(DVDplayer dvd){ 
      this.dvd=dvd; 
   } 
   
  public void undo() { 
   dvd.volumeLevel(volumn); 
 
  } 
 
  public void execute(){ 
  volumn=dvd.getvolumnLevel(); 
     dvd.off();  
    
  } 
 } 
