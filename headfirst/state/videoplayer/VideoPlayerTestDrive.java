package headfirst.state.videoplayer;

public class VideoPlayerTestDrive {

 public static void main(String[] args) {
  VideoPlayer videoPlayer1= new VideoPlayer(1);


  videoPlayer1.display();
  videoPlayer1.playStop();
  videoPlayer1.displaySleepOn();
  videoPlayer1.displaySleepOff();
 
  VideoPlayer videoPlayer2= new VideoPlayer(2);
  videoPlayer2.display();
  videoPlayer2.playStop();
  videoPlayer2.displaySleepOn();
  videoPlayer2.displaySleepOff();
 
  VideoPlayer videoPlayer3= new VideoPlayer(3);
  videoPlayer3.display();
  videoPlayer3.playStop();
  videoPlayer3.displaySleepOn();
  videoPlayer3.displaySleepOff();


 }
}