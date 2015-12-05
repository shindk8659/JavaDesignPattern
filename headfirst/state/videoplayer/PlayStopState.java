package headfirst.state.videoplayer;

public class PlayStopState implements State {
   VideoPlayer videoPlayer;
 
    public PlayStopState(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }
 
 public void playStop(){  System.out.println("play stopped");}
 public void displaySleepOn(){System.out.println("display sleep On");}
 public void displaySleepOff(){System.out.println("displaySleepOff is not on");}
 public void display(){System.out.println("when video is stopped ....");}
 
}