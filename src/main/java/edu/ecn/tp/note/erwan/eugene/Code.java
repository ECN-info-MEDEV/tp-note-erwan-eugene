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
    /** Les couleurs ordonnées du code */
    private String coul1;
    private String coul2;
    private String coul3;
    private String coul4;
    
    /** Constructeur par défaut de Code. */
    public Code() {
        this.coul1 = "blanc";
        this.coul2 = "blanc";
        this.coul3 = "blanc";
        this.coul4 = "blanc";
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
    }
    
    /**
     * Permet de comparer deux codes.
     * @param solution Le code auquel on compare ce code
     * @return True : les codes sont identiques,
     *         False : les codes sont différents
     */
    public boolean estEgal(Code solution) {
        return this.coul1.equals(solution.coul1) &&
               this.coul2.equals(solution.coul2) &&
               this.coul3.equals(solution.coul3) &&
               this.coul4.equals(solution.coul4);
    }
    
    /**
     * Permet de verifier si une chaine de caractere est une couleur autorisee
     * (parmis blanc, noir, rouge, vert, jaune et bleu).
     * @param couleur La chaine de caractere a verifier
     * @return True : la chaine de caractere correspond a une couleur valable,
     *         False : ce n'est pas le cas
     */
    public boolean estValable(String couleur) {
        return couleur.equals("blanc") ||
               couleur.equals("noir") ||
               couleur.equals("rouge") ||
               couleur.equals("vert") ||
               couleur.equals("jaune") ||
               couleur.equals("bleu");
    }
    
    /**
     * Permet au joueur de choisir la couleur d'un pion du code.
     * @param numCouleur Numero du pion du code dont on choisit la couleur
     * @return La couleur du pion choisie
     */
    public String choixCouleur(int numCouleur) {
        System.out.println("Couleur du " + numCouleur);
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
        System.out.print(" pion :");
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
}
