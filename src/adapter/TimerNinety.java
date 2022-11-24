package adapter;

public class TimerNinety implements ITimer{

  private int time;
  @Override
  public int getTimer() {
    return this.time;
  }

  @Override
  public void setTimer(int time) {
    this.time = time;
  }
}
