package headfirst.command.party;

public class RemoteLoader {

 public static void main(String[] args) {

  RemoteControl remoteControl = new RemoteControl();

  Light light = new Light("Living Room");
  TV tv = new TV("Living Room");
  DVDplayer dvdplayer = new DVDplayer("Living Room");
  Hottub hottub = new Hottub();
  
  LightOnCommand lightOn = new LightOnCommand(light);
  DVDplayerOnCommand dvdplayerOn = new DVDplayerOnCommand(dvdplayer);
  TVOnCommand tvOn = new TVOnCommand(tv);
  HottubOnCommand hottubOn = new HottubOnCommand(hottub);
  
  LightOffCommand lightOff = new LightOffCommand(light);
  DVDplayerOffCommand dvdplayerOff = new DVDplayerOffCommand(dvdplayer);
  TVOffCommand tvOff = new TVOffCommand(tv);
  HottubOffCommand hottubOff = new HottubOffCommand(hottub);

  Command[] partyOn = { lightOn, dvdplayerOn, tvOn, hottubOn};
  Command[] partyOff = { lightOff, dvdplayerOff, tvOff, hottubOff};
  
  MacroCommand partyOnMacro = new MacroCommand(partyOn);
  MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
  remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
  System.out.println(remoteControl);
  System.out.println("--- Pushing Macro On---");
  remoteControl.onButtonWasPushed(0);
  System.out.println("--- Pushing Macro Off---");
  remoteControl.offButtonWasPushed(0);
 }
}
