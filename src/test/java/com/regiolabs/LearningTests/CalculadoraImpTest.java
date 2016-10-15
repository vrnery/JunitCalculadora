/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regiolabs.LearningTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 10070124
 */
public class CalculadoraImpTest {
    
    public CalculadoraImpTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of soma method, of class CalculadoraImp.
     */
    @Test
    public void testSoma() {
        System.out.println("soma");
        int a = 0;
        int b = 0;
        CalculadoraImp instance = new CalculadoraImp();
        int expResult = 0;
        int result = instance.soma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtracao method, of class CalculadoraImp.
     */
    @Test
    public void testSubtracao() {
        System.out.println("subtracao");
        int a = 0;
        int b = 0;
        CalculadoraImp instance = new CalculadoraImp();
        int expResult = 0;
        int result = instance.subtracao(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multipicacao method, of class CalculadoraImp.
     */
    @Test
    public void testMultipicacao() {
        System.out.println("multipicacao");
        int a = 0;
        int b = 0;
        CalculadoraImp instance = new CalculadoraImp();
        int expResult = 0;
        int result = instance.multipicacao(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divisao method, of class CalculadoraImp.
     */
    @Test
    public void testDivisao() {
        System.out.println("divisao");
        int a = 0;
        int b = 0;
        CalculadoraImp instance = new CalculadoraImp();
        int expResult = 0;
        int result = instance.divisao(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
