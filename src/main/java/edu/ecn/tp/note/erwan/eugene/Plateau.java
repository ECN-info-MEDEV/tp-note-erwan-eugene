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
    private final Code solution;
    
    // Booleen stockant si le résultat est bon ou non
    private boolean resultat;
    
    // Plateau de jeu contenant les codes
    private LinkedList<Code> plateau;
    
    // Les scores des joueurs
    private final LinkedList<Integer> scores;
    
    public Plateau() {
        solution = new Code();
        resultat = false;
        scores = new LinkedList<>();
        scores.add(0);
        scores.add(0);
    }
    
    /**
     * Fonction gérant le jeu entre les deux joueurs.
     * @param nbManche Le nombre de manches entre les deux joueurs.
     */
    public void Tour2Jeu(int nbManche) {
        
        plateau = new LinkedList<>();
        
        for (int manche=0; manche < nbManche; manche++) {
            
            System.out.println("C'est au tour du joueur " + (manche%2 + 1) + " de creer un code.");
            int tour = 0;
            

            solution.choixCode();

            System.out.println("C'est au tour du joueur " + (2 - manche%2) + " de deviner.");
            
            while ((!resultat) && (tour < NBTOURS)) {

                if(tour != 0) {
                    System.out.println("Vous vous etes trompes");
                    System.out.println(this);
                }

                System.out.println("Choisissez un code :");

                Code proposition = new Code();
                plateau.add(proposition);
                proposition.choixCode();

                proposition.verifierCode(solution);
                resultat =  proposition.estEgal(solution);
    //            System.out.println
                tour += 1;
            }

            if (resultat) {
                System.out.println("Vous avez le bon code !");
            }
            else {
                System.out.println("Dommage, vous n'avez pas trouvé le code...");
            }
            
            scores.set((manche%2), scores.get(manche%2) + tour);
            resultat = false;
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
