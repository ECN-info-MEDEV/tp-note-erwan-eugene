/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.ecn.tp.note.erwan.eugene;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author erwan
 */
public class PlateauTest {
    
    public PlateauTest() {
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
     * Test of Tour2Jeu method, of class Plateau.
     */
    @Test
    public void testTour2Jeu() {
        System.out.println("Tour2Jeu");
        Plateau instance = new Plateau();
//
//        String input = "blanc\nrouge\njaune\nvert\nblanc\nrouge\nbleu\nvert\nblanc\nrouge\njaune\nvert\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        input = "rouge\n";
//        in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        input = "jaune\n";
//        in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        input = "vert\n";
//        in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        
//        input = "blanc\n";
//        in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        input = "rouge\n";
//        in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        input = "bleu\n";
//        in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        input = "vert\n";
//        in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        
//        input = "blanc\n";
//        in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        input = "rouge\n";
//        in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        input = "jaune\n";
//        in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        input = "vert\n";
//        in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
        
        Code code = new Code();
        code.setCoul1("blanc");
        code.setCoul2("vert");
        code.setCoul3("rouge");
        code.setCoul4("jaune");
        Code solution = new Code();
        solution.setCoul1("blanc");
        solution.setCoul2("vert");
        solution.setCoul3("rouge");
        solution.setCoul4("jaune");
        solution.verifierCode(code);
        
        boolean expResult = true;
        code.verifierCode(solution);
        instance.setResultat(code.estEgal(solution));

        assertEquals(expResult, code.estEgal(solution));

    }

    /**
     * Test of toString method, of class Plateau.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Plateau instance = new Plateau();
        String expResult = "Aucun essai n'a encore ete effectue";
        String result = instance.toString();
        assertEquals(expResult, result);

        Code code = new Code();
        code.setCoul1("blanc");
        code.setCoul2("blanc");
        code.setCoul3("blanc");
        code.setCoul4("blanc");
        instance.addInPlateau(code);
        expResult = "Tous les essais ont ete affiches";
        result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSolution method, of class Plateau.
     */
    @Test
    public void testGetSolution() {
        System.out.println("getSolution");
        Plateau instance = new Plateau();

        Code code = new Code();
        code.setCoul1("blanc");
        code.setCoul2("blanc");
        code.setCoul3("blanc");
        code.setCoul4("blanc");
        instance.setSolution(code);
        assertEquals(code, instance.getSolution());
    }

    /**
     * Test of setSolution method, of class Plateau.
     */
    @Test
    public void testSetSolution() {
        System.out.println("setSolution");
        Plateau instance = new Plateau();
        
        Code code = new Code();        
        code.setCoul1("blanc");
        code.setCoul2("blanc");
        code.setCoul3("rouge");
        code.setCoul4("jaune");
        Code codeTest = new Code();
        codeTest.setCoul1("blanc");
        codeTest.setCoul2("blanc");
        codeTest.setCoul3("rouge");
        codeTest.setCoul4("jaune");
        instance.setSolution(codeTest);
        assertEquals(code.toString(), instance.getSolution().toString());
    }

    /**
     * Test of getScores method, of class Plateau.
     */
    @Test
    public void testGetScores() {
        System.out.println("getScores");
        Plateau instance = new Plateau();
        LinkedList<Integer> expResult = new LinkedList<>();
        expResult.add(0);
        expResult.add(0);
        LinkedList<Integer> result = instance.getScores();
        assertEquals(expResult, result);
        
        LinkedList<Integer> new_expResult = new LinkedList<>();
        new_expResult.add(4);
        new_expResult.add(8);
        LinkedList<Integer> new_listTest = new LinkedList<>();
        new_listTest.add(4);
        new_listTest.add(8);
        instance.setScores(new_listTest);
        LinkedList<Integer> new_result = instance.getScores();
        assertEquals(new_expResult, new_result);
    }

    /**
     * Test of setScores method, of class Plateau.
     */
    @Test
    public void testSetScores() {
        System.out.println("setScores");
        Plateau instance = new Plateau();
        
        LinkedList<Integer> expResult = new LinkedList<>();
        expResult.add(5);
        expResult.add(23);
        LinkedList<Integer> listTest = new LinkedList<>();
        listTest.add(5);
        listTest.add(23);
        instance.setScores(listTest);
        LinkedList<Integer> result = instance.getScores();
        assertEquals(expResult, result);
    }

 
    /**
     * Test of isResultat method, of class Plateau.
     */
    @Test
    public void testIsResultat() {
        System.out.println("isResultat");
        Plateau instance = new Plateau();
        boolean expResult = false;
        boolean result = instance.isResultat();
        assertEquals(expResult, result);       
        
        boolean new_expResult = true;
        instance.setResultat(true);
        boolean new_result = instance.isResultat();
        assertEquals(new_expResult, new_result);
    }
    
// Le reste des tests n'a pas été implémenté
//   
//    /**
//     * Test of setResultat method, of class Plateau.
//     */
//    @Test
//    public void testSetResultat() {
//        System.out.println("setResultat");
//        boolean resultat = false;
//        Plateau instance = new Plateau();
//        instance.setResultat(resultat);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPlateau method, of class Plateau.
//     */
//    @Test
//    public void testGetPlateau() {
//        System.out.println("getPlateau");
//        Plateau instance = new Plateau();
//        LinkedList<Code> expResult = null;
//        LinkedList<Code> result = instance.getPlateau();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPlateau method, of class Plateau.
//     */
//    @Test
//    public void testSetPlateau() {
//        System.out.println("setPlateau");
//        LinkedList<Code> plateau = null;
//        Plateau instance = new Plateau();
//        instance.setPlateau(plateau);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addInPlateau method, of class Plateau.
//     */
//    @Test
//    public void testAddInPlateau() {
//        System.out.println("addInPlateau");
//        Code code = null;
//        Plateau instance = new Plateau();
//        instance.addInPlateau(code);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
