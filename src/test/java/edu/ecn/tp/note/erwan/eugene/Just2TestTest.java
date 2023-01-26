/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.ecn.tp.note.erwan.eugene;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
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
public class Just2TestTest {
    
    public Just2TestTest() {
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
     * Test of Test method, of class Just2Test.
     */
    @Test
    public void testTest() {
        System.out.println("Test");
        int a = 0;
        Just2Test instance = new Just2Test();
        instance.Test(a);
        System.out.println("C'est fini ici");
    }

//    /**
//     * Test of getInput method, of class Just2Test.
//     */
//    @Test
//    public void testGetInput() {
//        Just2Test instance = new Just2Test();
//        
//        String input = "add 5"+"\n"+"4";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        instance.t = in;
//        System.setIn(in);
//
//        assertEquals("add 5", instance.getInput());
//        assertEquals("add 5", instance.getInput());
//    }
}
