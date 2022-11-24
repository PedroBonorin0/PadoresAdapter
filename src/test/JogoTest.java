package test;

import adapter.Jogo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogoTest {

  @Test
  void deveRetornarTempo90() {
    Jogo jogo = new Jogo();
    jogo.setTimer(75);

    assertEquals(75, jogo.getTimeNinety());
  }

  @Test
  void deveRetornarTempoPrimeiraEtapa() {
    Jogo jogo = new Jogo();
    jogo.setTimer(30);

    assertEquals("30 minutos do primeiro tempo", jogo.getTimeFortyFive() );
  }

  @Test
  void deveRetornarTempoSegundaEtapa() {
    Jogo jogo = new Jogo();
    jogo.setTimer(75);

    assertEquals("30 minutos do segundo tempo", jogo.getTimeFortyFive());
  }
}