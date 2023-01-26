/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.ecn.tp.note.erwan.eugene;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 *
 * @author eugen
 */
public class CodeTest {
    
    public CodeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of estEgal method, of class Code.
     */
    @Test
    public void testEstEgal() {
        System.out.println("estEgal");
        Code solution = new Code("bleu", "rouge", "blanc", "vert");
        Code instance = new Code("bleu", "rouge", "blanc", "vert", 4, 0);
        boolean expResult = true;
        boolean result = instance.estEgal(solution);
        assertEquals(expResult, result);
        
        instance = new Code("bleu", "rouge", "blanc", "vert");
        expResult = false;
        result = instance.estEgal(solution);
        assertEquals(expResult, result);
        
        instance = new Code("bleu", "bleu", "blanc", "vert", 3, 0);
        expResult = false;
        result = instance.estEgal(solution);
        assertEquals(expResult, result);
        
        instance = new Code("bleu", "bleu", "blanc", "vert", 4, 0);
        expResult = true;
        result = instance.estEgal(solution);
        assertEquals(expResult, result);
        
        System.out.println("Tests menes avec succes");
    }

    /**
     * Test of estValable method, of class Code.
     */
    @Test
    public void testEstValable() {
        System.out.println("estValable");
        String couleur = "rouge";
        Code instance = new Code();
        boolean expResult = true;
        boolean result = instance.estValable(couleur);
        assertEquals(expResult, result);
        
        couleur = "rouge rouge";
        expResult = false;
        result = instance.estValable(couleur);
        assertEquals(expResult, result);
        
        couleur = "rou";
        expResult = false;
        result = instance.estValable(couleur);
        assertEquals(expResult, result);
        
        couleur = "aaaa";
        expResult = false;
        result = instance.estValable(couleur);
        assertEquals(expResult, result);
    }

    /**
     * Test of choixCouleur method, of class Code.
     */
    @Test
    public void testChoixCouleur() {
        System.out.println("choixCouleur");
        int numCouleur = 1;
        Code instance = new Code();
        String input = "rouge";
        String expResult = input;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String result = instance.choixCouleur(numCouleur);
        assertEquals(expResult, result);
    }

//    /**
//     * Test of choixCode method, of class Code.
//     */
//    @Test
//    public void testChoixCode() {
//        System.out.println("choixCode");
//        Code instance = new Code();
//        String input = "rouge\nbleu\nvert\njaune\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        instance.choixCode();
//        String expResult = new Code("rouge", "bleu", "vert", "jaune").toString();
//        String result = new Code(instance).toString();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of verifierCode method, of class Code.
     */
    @Test
    public void testVerifierCode() {
        System.out.println("verifierCode");
        Code solution = new Code("rouge", "rouge", "bleu", "vert");
        Code instance = new Code("rouge", "rouge", "bleu", "vert");
        instance.verifierCode(solution);
        String expResult = new Code("rouge", "rouge", "bleu", "vert", 4, 0).toString();
        String result = new Code(instance).toString();
        assertEquals(expResult, result);
        
        instance = new Code("rouge", "vert", "bleu", "noir");
        instance.verifierCode(solution);
        expResult = new Code("rouge", "vert", "bleu", "noir", 2, 1).toString();
        result = new Code(instance).toString();
        assertEquals(expResult, result);
        
        instance = new Code("rouge", "vert", "vert", "noir");
        instance.verifierCode(solution);
        expResult = new Code("rouge", "vert", "vert", "noir", 1, 1).toString();
        result = new Code(instance).toString();
        assertEquals(expResult, result);
        
        instance = new Code("rouge", "vert", "noir", "vert");
        instance.verifierCode(solution);
        expResult = new Code("rouge", "vert", "noir", "vert", 2, 0).toString();
        result = new Code(instance).toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Code.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Code instance = new Code("rouge", "vert", "bleu", "jaune", 2, 1);
        String expResult = "Indices blcs : 2, Indices rges : 1 || rouge | vert  | bleu  | jaune";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoul1 method, of class Code.
     */
    @Test
    public void testGetCoul1() {
        System.out.println("getCoul1");
        Code instance = new Code("rouge", "bleu", "vert", "jaune", 2, 1);
        String expResult = "rouge";
        String result = instance.getCoul1();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoul2 method, of class Code.
     */
    @Test
    public void testGetCoul2() {
        System.out.println("getCoul2");
        Code instance = new Code("rouge", "bleu", "vert", "jaune");
        String expResult = "bleu";
        String result = instance.getCoul2();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoul3 method, of class Code.
     */
    @Test
    public void testGetCoul3() {
        System.out.println("getCoul3");
        Code instance = new Code("rouge", "bleu", "vert", "jaune", 0, 0);
        String expResult = "vert";
        String result = instance.getCoul3();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoul4 method, of class Code.
     */
    @Test
    public void testGetCoul4() {
        System.out.println("getCoul4");
        Code instance = new Code("rouge", "bleu", "vert", "jaune", 2, 1);
        String expResult = "jaune";
        String result = instance.getCoul4();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNbBienPlace method, of class Code.
     */
    @Test
    public void testGetNbBienPlace() {
        System.out.println("getNbBienPlace");
        Code instance = new Code("rouge", "bleu", "vert", "jaune", 2, 1);
        int expResult = 2;
        int result = instance.getNbBienPlace();
        assertEquals(expResult, result);
        
        instance = new Code("rouge", "bleu", "vert", "jaune");
        expResult = 0;
        result = instance.getNbBienPlace();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNbBonneCoul method, of class Code.
     */
    @Test
    public void testGetNbBonneCoul() {
        System.out.println("getNbBonneCoul");
        Code instance = new Code("rouge", "bleu", "vert", "jaune", 2, 1);
        int expResult = 1;
        int result = instance.getNbBonneCoul();
        assertEquals(expResult, result);
        
        instance = new Code("rouge", "bleu", "vert", "jaune");
        expResult = 0;
        result = instance.getNbBonneCoul();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoul1 method, of class Code.
     */
    @Test
    public void testSetCoul1() {
        System.out.println("setCoul1");
        String coul1 = "bleu";
        Code instance = new Code("rouge", "bleu", "vert", "jaune");
        instance.setCoul1(coul1);
        String expResult = new Code("bleu", "bleu", "vert", "jaune").toString();
        String result = new Code(instance).toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoul2 method, of class Code.
     */
    @Test
    public void testSetCoul2() {
        System.out.println("setCoul2");
        String coul2 = "rouge";
        Code instance = new Code("rouge", "bleu", "vert", "jaune");
        instance.setCoul2(coul2);
        String expResult = new Code("rouge", "rouge", "vert", "jaune").toString();
        String result = new Code(instance).toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoul3 method, of class Code.
     */
    @Test
    public void testSetCoul3() {
        System.out.println("setCoul3");
        String coul3 = "bleu";
        Code instance = new Code("rouge", "bleu", "vert", "jaune");
        instance.setCoul3(coul3);
        String expResult = new Code("rouge", "bleu", "bleu", "jaune").toString();
        String result = new Code(instance).toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoul4 method, of class Code.
     */
    @Test
    public void testSetCoul4() {
        System.out.println("setCoul4");
        String coul4 = "bleu";
        Code instance = new Code("rouge", "bleu", "vert", "jaune", 2, 0);
        instance.setCoul4(coul4);
        String expResult = new Code("rouge", "bleu", "vert", "bleu", 2, 0).toString();
        String result = new Code(instance).toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNbBienPlace method, of class Code.
     */
    @Test
    public void testSetNbBienPlace() {
        System.out.println("setNbBienPlace");
        int nbBienPlace = 2;
        Code instance = new Code();
        instance.setNbBienPlace(nbBienPlace);
        String expResult = new Code("blanc", "blanc", "blanc", "blanc", 2, 0).toString();
        String result = new Code(instance).toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNbBonneCoul method, of class Code.
     */
    @Test
    public void testSetNbBonneCoul() {
        System.out.println("setNbBonneCoul");
        int nbBonneCoul = 2;
        Code instance = new Code();
        instance.setNbBonneCoul(nbBonneCoul);
        String expResult = new Code("blanc", "blanc", "blanc", "blanc", 0, 2).toString();
        String result = new Code(instance).toString();
        assertEquals(expResult, result);
    }
    
}
