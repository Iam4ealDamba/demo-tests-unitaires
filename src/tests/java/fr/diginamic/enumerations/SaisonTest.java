package fr.diginamic.enumerations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.diginamic.enumerations.Saison;

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