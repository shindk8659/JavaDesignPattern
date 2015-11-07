package headfirst.command.party; 
 
 
 public class DVDplayerOffCommand implements Command { 
  DVDplayer dvd; 
   
  public DVDplayerOffCommand(DVDplayer dvd) { 
   this.dvd = dvd; 
  } 
   
 public void execute() { 
   dvd.off(); 
  } 
 
 
  public void undo() { 
   dvd.on(); 
  } 
 } 
