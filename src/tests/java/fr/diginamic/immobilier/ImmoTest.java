package fr.diginamic.immobilier;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.diginamic.immobilier.entites.Chambre;
import fr.diginamic.immobilier.entites.Cuisine;
import fr.diginamic.immobilier.entites.Maison;
import fr.diginamic.immobilier.entites.Salon;
import fr.diginamic.immobilier.entites.WC;

public class ImmoTest {

  @Test
  public void testNombrePieceAjouter() {
    Maison maison = new Maison();

    // Ajout d'une pièce
    maison.ajouterPiece(new Salon(0, 15));

    // Tests
    assertEquals(1, maison.nbPieces(), "Le nombre de pièce doit être de 1");
  }

  @Test
  public void testTypePieceAjouter() {
    Maison maison = new Maison();

    // Ajout d'une pièce de type salon
    maison.ajouterPiece(new Salon(0, 15));

    // Tests
    assertEquals("Salon", maison.getPieces()[0].getType(), "Ajout d'une pièce de type salon");
  }

  @Test
  public void testSuperficieEtage() {
    Maison maison = new Maison();

    // Ajout de pièces
    maison.ajouterPiece(new Salon(0, 15));
    maison.ajouterPiece(new Cuisine(0, 9));
    maison.ajouterPiece(new WC(0, 3.5));

    // Tests
    assertEquals(27.5, maison.superficieEtage(0), "La taille de l'etage 0 doit être de 27.5");
  }

  @Test
  public void testSuperficieTypePiece() {
    Maison maison = new Maison();

    // Ajout de pièces
    maison.ajouterPiece(new Salon(0, 15));
    maison.ajouterPiece(new Cuisine(0, 9));
    maison.ajouterPiece(new WC(0, 3.5));

    // Tests
    assertEquals(3.5, maison.superficieTypePiece("WC"), "La taille des WC doit être de 3.5");
  }

  @Test
  public void testSuperficieTotal() {
    Maison maison = new Maison();

    // Ajout de pièces
    maison.ajouterPiece(new Salon(0, 15));
    maison.ajouterPiece(new Cuisine(0, 9));
    maison.ajouterPiece(new WC(0, 3.5));

    maison.ajouterPiece(new Chambre(1, 17.8));
    maison.ajouterPiece(new Chambre(2, 20.5));
    maison.ajouterPiece(new WC(1, 3.5));

    // Tests
    assertEquals(69.3, maison.calculerSurface(), "La taille totale doit être de 69.3");
  }

  @Test
  public void testMaisonVide() {
    Maison maison = new Maison();

    // Ajout de pieces
    maison.ajouterPiece(null);

    // Tests
    assertEquals(0, maison.nbPieces(), "La maison doit être vide");
  }
}
