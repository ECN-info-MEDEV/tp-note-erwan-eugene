/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ecn.tp.note.erwan.eugene;

import java.util.LinkedList;

/**
 *
 * @author eugen
 */
public class Plateau {
    
    // Nombre de tours maximal d'une manche
    public static final int NBTOURS = 12;
    
    // Le code solution
    private final Code solution = new Code();
    
    // Booleen stockant si le résultat est bon ou non
    private boolean resultat = false;
    
    // Plateau de jeu contenant les codes
    private LinkedList<Code> plateau;
    
    // Le score du joueur 1
    private int joueur1 = 0;
    
    // Le score du joueur 2
    private int joueur2 = 0;
    
    /**
     * Fonction gérant le jeu entre les deux joueurs.
     * @param nbManche Le nombre de manches entre les deux joueurs.
     */
    public void Tour2Jeu(int nbManche) {
        
        for (int i=0; i < nbManche; i++) {
            int tour = 0;

            solution.choixCode();

            while ((!resultat) && (tour < NBTOURS)) {

                if(tour != 0) {
                    System.out.println("Vous vous etes trompes");
                    System.out.println(this);
                }

                System.out.println("Choisissez un code :");

                Code proposition = new Code();
                plateau.add(proposition);
                proposition.choixCode();

//                proposition.verifierCode(solution);
                resultat =  proposition.estEgal(solution);
    //            System.out.println
            }

            if (resultat) {
                System.out.println("Vous avez le bon code !");
            }
        }
        
    }
    
    /**
     * Fonction gérant l'affichage du plateau.
     * @return Un texte si les affichages ont bien ete affiches.
     */
    @Override
    public String toString() {
        if (!plateau.isEmpty()) {
            for (Code essai : plateau) {
                System.out.println(essai);
            }
            return "Tous les essais ont ete affiches";
        }
        else {
            return "Aucun essai n'a encore ete effectue";    
        }
    }
}
