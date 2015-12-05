package headfirst.state.videoplayer;

public class PlayState implements State {
   VideoPlayer videoPlayer;
 
    public PlayState(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }
 
public void playStop(){  System.out.println("it is playing");}
 public void displaySleepOn(){ System.out.println("displaySleepOn is not executed");}
 public void displaySleepOff(){ System.out.println("displaySleep is Off");}
 public void display(){System.out.println("when you play video ....");}

}