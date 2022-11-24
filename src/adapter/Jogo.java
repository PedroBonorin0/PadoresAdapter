package adapter;

public class Jogo {

  ITimer timer;
  TimerAdapter adapter;

  public Jogo() {
    timer = new TimerNinety();
    adapter = new TimerAdapter(timer);
  }

  public void setTimer(int time) {
    timer.setTimer(time);
    adapter.convertToFortyFive();
  }

  public int getTimeNinety() {
    return adapter.convertToNinety();
  }

  public String getTimeFortyFive() {
    int tempo = adapter.getTime();
    return adapter.getEtapa().equals("Segunda")? tempo + " minutos do segundo tempo" : tempo + " minutos do primeiro tempo";
  }
}
