package headfirst.state.videoplayer;

public class VideoPlayer {
 
State displayOffState; 
State playStopState;
State playState;
 
 State state = displayOffState;
 int count = 0;
 
 public VideoPlayer(int number) {
  displayOffState = new DisplayOffState(this);
  playStopState = new PlayStopState(this);
  playState = new PlayState(this);


  this.count = number;
   if (number==3) {
  state = displayOffState;
  } 
    if (number== 2) {
  state = playStopState;
  } 
     if (number== 1) {
  state = playState;
  } 
 }
 
 public void playStop(){
   state.playStop();
 }
 public void displaySleepOn(){state.displaySleepOn();}
 public void displaySleepOff(){state.displaySleepOff();}
 public void display(){state.display();}
 

 void setState(State state) {
  this.state = state;
 }
 

 int getCount() {
  return count;
 }
 

    public State getState() {
        return state;
    }

    public State getDisplayOffState() {
        return displayOffState;
    }

    public State getPlayStopState() {
        return playStopState;
    }

    public State getPlayState() {
        return playState;
    }
}