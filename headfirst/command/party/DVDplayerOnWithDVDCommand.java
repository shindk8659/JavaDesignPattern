package headfirst.command.party; 
 
 
 public class DVDplayerOnWithDVDCommand implements Command { 
  DVDplayer dvd; 
   
  public DVDplayerOnWithDVDCommand(DVDplayer dvd) { 
   this.dvd = dvd; 
  } 
   
  public void execute() { 
   dvd.on(); 
   dvd.setDVD(); 
   dvd.setVolume(11); 
  } 
 
 
  public void undo() { 
   dvd.off(); 
  } 
 } 
