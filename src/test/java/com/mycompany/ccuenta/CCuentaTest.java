/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ccuenta;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author manol
 */
public class CCuentaTest {
    
    public CCuentaTest() {
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
     * Test of setNombre method, of class CCuenta.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nom = "";
        CCuenta instance = new CCuenta();
        instance.setNombre(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class CCuenta.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class CCuenta.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        CCuenta instance = new CCuenta();
        double expResult = 0.0;
        double result = instance.getEstado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class CCuenta.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        double cantidad = 100.0;
        CCuenta instance = new CCuenta("Pedro Gil","11111002120", 1000.0, 4.0);
        //CCuenta instance = new CCuenta();
        instance.ingresar(cantidad);
        //fail("The test case is a prototype.");
        double expResult = 1100.0;
        double result = instance.getEstado();
        assertEquals(expResult, result, 0.0);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testProbarIngresarRetirar() throws Exception {
        System.out.println("Probar Ingresar y Retirar");        
        CCuenta instance = new CCuenta("Pedro Gil","11111002120", 500.0,4.0);
        double cantidad = 200.0;//DAMOS VALOR AL PARAMETRO DEL METODO ingresar(cantidad)
        instance.ingresar(cantidad);//EJECUTO EL METODO ingresar(cantidad)
        // a la hora de retirar        
        cantidad=60;//DAMOS VALOR AL PARAMETRO DEL METODO retirar(cantidad)
        instance.retirar(cantidad);//EJECUTO EL METODO retirar(cantidad)     
        double expResult = 640.0;// el valor que creo que me tiene que dar al ejecutar el getEstado()
        double result = instance.getEstado();//el método cuyo rdo quiero testear es getEstado() que me calcula el saldo con la ejec de ingresar/retirar 
        assertEquals(expResult, result, 0.0);//cotejo ambas variables a ver si son iguales
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class CCuenta.
     */
    @Test
    public void testRetirar() throws Exception {
        System.out.println("retirar");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        instance.retirar(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCuenta method, of class CCuenta.
     */
    @Test
    public void testGetCuenta() {
        System.out.println("getCuenta");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.getCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cobroFactura method, of class CCuenta.
     */
    @Test
    public void testCobroFactura() {
        System.out.println("cobroFactura");
        String tipo = "";
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        instance.cobroFactura(tipo, cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
