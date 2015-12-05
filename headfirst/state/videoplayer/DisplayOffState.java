package headfirst.state.videoplayer;
public class DisplayOffState implements State {
   VideoPlayer videoPlayer;
 
    public DisplayOffState(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }
 
public void playStop(){  System.out.println("play is stopped");}
 public void displaySleepOn(){System.out.println("displaySleepOn is not executed");}
 public void displaySleepOff(){System.out.println("displaySleepOff is not executed");}
 
 public void display(){System.out.println("when display is black ....");}

 
}