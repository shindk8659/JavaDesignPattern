package headfirst.command.party; 
 
 
 public class DVDplayerOnCommand implements Command { 
  DVDplayer dvd; 
 
 
  public DVDplayerOnCommand(DVDplayer dvd) { 
   this.dvd = dvd; 
  } 
 
 
  public void execute() { 
   dvd.on(); 
  } 
 
 
  public void undo() { 
   dvd.off(); 
  } 
 } 
