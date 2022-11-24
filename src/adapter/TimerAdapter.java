package adapter;

public class TimerAdapter extends TimerFortyFive{
  private ITimer timerNinety;
  private String etapa = "Primeira";

  public String getEtapa() {
    return etapa;
  }

  public TimerAdapter(ITimer timerNinety) {
    this.timerNinety = timerNinety;
  }

  public int convertToNinety() {
    timerNinety.setTimer(this.getTime() + 45);
    return timerNinety.getTimer();
  }

  public void convertToFortyFive() {
    if(timerNinety.getTimer() > 45) {
      this.etapa = "Segunda";
      this.setTime(timerNinety.getTimer() - 45);
    } else {
      this.etapa = "Primeira";
      this.setTime(timerNinety.getTimer());
    }
  }
}
