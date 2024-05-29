package fr.diginamic.enumerations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SaisonTest {
  @Test
  public void valueOfLibelleIsCorrect() {
    Assertions.assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"), "La saison n'est pas le PRINTEMPS");

  }

  @Test
  public void valueOfLibelleIsIncorrect() {
    Assertions.assertNotEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("hiver"), "Les saisons sont égales");
  }
}