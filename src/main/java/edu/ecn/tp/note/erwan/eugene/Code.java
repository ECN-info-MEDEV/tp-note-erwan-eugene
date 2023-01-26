/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ecn.tp.note.erwan.eugene;
import java.util.Scanner;

/**
 * Un code contenant 4 couleurs ordonnées parmi les 6 possibles.
 * @author Eugene
 */
public class Code {
    /** Les couleurs ordonnées du code. */
    private String coul1;
    private String coul2;
    private String coul3;
    private String coul4;
    
    /** Nombre de pions de la bonne couleur bien places. */
    private int nbBienPlace;
    /** Nombre de pions de la bonne couleur mal places. */
    private int nbBonneCoul;
    
    /** Constructeur par défaut de Code. */
    public Code() {
        this.coul1 = "blanc";
        this.coul2 = "blanc";
        this.coul3 = "blanc";
        this.coul4 = "blanc";
        
        nbBienPlace = 0;
        nbBonneCoul = 0;
    }
    
    /**
     * Constructeur de Code.
     * @param coul1 Couleur du 1er pion
     * @param coul2 Couleur du 2eme pion
     * @param coul3 Couleur du 3eme pion
     * @param coul4 Couleur du 4eme pion
     */
    public Code(String coul1, String coul2, String coul3, String coul4) {
        this.coul1 = coul1;
        this.coul2 = coul2;
        this.coul3 = coul3;
        this.coul4 = coul4;
        
        this.nbBienPlace = 0;
        this.nbBonneCoul = 0;
    }
    
    /**
     * Constructeur de Code.
     * @param coul1 Couleur du 1er pion
     * @param coul2 Couleur du 2eme pion
     * @param coul3 Couleur du 3eme pion
     * @param coul4 Couleur du 4eme pion
     * @param nbBienPlace Nombre de pions de la bonne couleur bien places
     * @param nbBonneCoul Nombre de pions de la bonne couleur mal places
     */
    public Code(String coul1, String coul2, String coul3, String coul4, int nbBienPlace, int nbBonneCoul) {
        this.coul1 = coul1;
        this.coul2 = coul2;
        this.coul3 = coul3;
        this.coul4 = coul4;
        
        this.nbBienPlace = nbBienPlace;
        this.nbBonneCoul = nbBonneCoul;
    }
    
    /**
     * Permet de comparer deux codes.
     * @param solution Le code auquel on compare ce code
     * @return True : les codes sont identiques,
     *         False : les codes sont différents
     */
    public boolean estEgal(Code solution) {
        return this.nbBienPlace == 4;
    }
    
    /**
     * Permet de verifier si une chaine de caractere est une couleur autorisee
     * (parmis blanc, noir, rouge, vert, jaune et bleu).
     * @param couleur La chaine de caractere a verifier
     * @return True : la chaine de caractere correspond a une couleur valable,
     *         False : ce n'est pas le cas
     */
    public boolean estValable(String couleur) {
        return couleur.equals("blanc")
            || couleur.equals("noir")
            || couleur.equals("rouge")
            || couleur.equals("vert")
            || couleur.equals("jaune")
            || couleur.equals("bleu");
    }
    
    /**
     * Permet au joueur de choisir la couleur d'un pion du code.
     * @param numCouleur Numero du pion du code dont on choisit la couleur
     * @return La couleur du pion choisie
     */
    public String choixCouleur(int numCouleur) {
        System.out.print("Couleur du " + numCouleur);
        switch (numCouleur) {
            case 1:
                System.out.print("er");
                break;
            case 2:
            case 3:
            case 4:
            default:
                System.out.print("eme");
                break;
        }
        System.out.println(" pion :");
        Scanner scan = new Scanner(System.in);
        String couleur = scan.next();
        if (!estValable(couleur)) {
            System.out.println("La couleur choisie n'est pas valide,");
            System.out.println("Choisissez parmi rouge, vert, bleu, jaune, noir et blanc.");
            couleur = choixCouleur(numCouleur);
        }
        return couleur;
    }
    
    /** Permet au joueur de choisir la couleur de chaque pion du code. */
    public void choixCode() {
        this.coul1 = choixCouleur(1);
        this.coul2 = choixCouleur(2);
        this.coul3 = choixCouleur(3);
        this.coul4 = choixCouleur(4);
    }
    
    /**
     * Verifie si des elements du code sont bons,
     * et met a jour le nombre de pion bien places et de la bonne couleur.
     * @param solution La solution a laquelle on compare le code
     */
    public void verifierCode(Code solution) {
        int[] indices = new int[4];
        
        String[] couleurs = new String[4];
        couleurs[0] = this.coul1;
        couleurs[1] = this.coul2;
        couleurs[2] = this.coul3;
        couleurs[3] = this.coul4;
        
        String[] solutions = new String[4];
        solutions[0] = solution.coul1;
        solutions[1] = solution.coul2;
        solutions[2] = solution.coul3;
        solutions[3] = solution.coul4;
        
        for (int k = 0; k < 4; k++) {
            if (couleurs[k].equals(solutions[k])) {
                indices[k] = 1;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            if (indices[i] == 0) {
                for (int j = i; j < 4; j++) {
                    if (indices[j] == 0 && couleurs[i].equals(solutions[j])) {
                        indices[i] = 2;
                    }
                }
            }
        }
        
        for (int k = 0; k < 4; k++) {
            if (indices[k] == 1) {
                this.nbBienPlace += 1;
            }
            else if (indices[k] == 2) {
                this.nbBonneCoul += 1;
            }
        }
    }
    
    /**
     * Permet d'afficher une ligne du plateau correspondant au code.
     * @return La ligne textuelle du plateau correspondant au code
     */
    @Override
    public String toString() {
        String[] couleurs = new String[4];
        couleurs[0] = this.coul1;
        couleurs[1] = this.coul2;
        couleurs[2] = this.coul3;
        couleurs[3] = this.coul4;
        
        String ligne = "Indices blcs : " + this.nbBienPlace
                   + ", Indices rges : " + this.nbBonneCoul
                                + " || " + couleurs[0];
        
        for (int i = 0; i < 3; i++) {
            switch (couleurs[i]) {
                case "vert":
                case "bleu":
                case "noir":
                    ligne += " ";
                    break;
                case "rouge":
                case "jaune":
                case "blanc":
                default:
                    break;
            }
            ligne += " | " + couleurs[i + 1];
        }
        
        return ligne;
    }

    /**
     * Getter de coul1
     * @return coul1
     */
    public String getCoul1() {
        return coul1;
    }

    /**
     * Getter de coul2
     * @return coul2
     */
    public String getCoul2() {
        return coul2;
    }

    /**
     * Getter de coul3
     * @return coul3
     */
    public String getCoul3() {
        return coul3;
    }

    /**
     * Getter de coul4
     * @return coul4
     */
    public String getCoul4() {
        return coul4;
    }

    /**
     * Getter de nbBienPlace
     * @return nbBienPlace
     */
    public int getNbBienPlace() {
        return nbBienPlace;
    }

    /**
     * Getter de nbBonneCoul
     * @return nbBonneCoul
     */
    public int getNbBonneCoul() {
        return nbBonneCoul;
    }

    /**
     * Setter de coul1
     * @param coul1 coul1
     */
    public void setCoul1(String coul1) {
        this.coul1 = coul1;
    }

    /**
     * Setter de coul2
     * @param coul2 coul2
     */
    public void setCoul2(String coul2) {
        this.coul2 = coul2;
    }

    /**
     * Setter de coul3
     * @param coul3 coul3
     */
    public void setCoul3(String coul3) {
        this.coul3 = coul3;
    }

    /**
     * Setter de coul4
     * @param coul4 coul4
     */
    public void setCoul4(String coul4) {
        this.coul4 = coul4;
    }

    /**
     * Setter de nbBienPlace
     * @param nbBienPlace nbBienPlace
     */
    public void setNbBienPlace(int nbBienPlace) {
        this.nbBienPlace = nbBienPlace;
    }

    /**
     * Setter de nbBonneCoul
     * @param nbBonneCoul nbBonneCoul
     */
    public void setNbBonneCoul(int nbBonneCoul) {
        this.nbBonneCoul = nbBonneCoul;
    }
}
