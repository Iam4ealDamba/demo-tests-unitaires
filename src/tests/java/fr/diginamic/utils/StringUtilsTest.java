package fr.diginamic.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {
  @Test
  public void testCorrectUsage() {
    assertEquals(4, StringUtils.levenshteinDistance("Colline", "Mine"), "La distance doit être de 4");
  }

  @Test
  public void testWrongUsage() {
    assertNull(StringUtils.levenshteinDistance(null, "Mine"), "Le resultat doit être null");
  }
}
