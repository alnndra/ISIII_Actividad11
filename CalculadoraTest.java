/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Alondra Yamileth
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }
    
    @Test
    void testResta() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.restar(5, 4));
        assertEquals(-2, calc.restar(3, 5));
    }
    
    @Test
    void testMultiplicacion() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(0, calc.multiplicar(5, 0));
    }
    
    @Test
    void testDivision() {
        Calculadora calc = new Calculadora();
        assertEquals(2.0, calc.dividir(6, 3));
        assertEquals(2.5, calc.dividir(5, 2));
    }
    
    @Test
    void testDivisionPorCero() {
        Calculadora calc = new Calculadora();
        // Verificar que lanza excepción al dividir por cero
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(5, 0);
        });
    }
    
    @Test
    void testEsPar() {
        Calculadora calc = new Calculadora();
        assertTrue(calc.esPar(4));
        assertTrue(calc.esPar(0));
        assertFalse(calc.esPar(7));
        assertFalse(calc.esPar(-3));
    }
    
    @Test
    void testSumaNumerosNegativos() {
        Calculadora calc = new Calculadora();
        assertEquals(-5, calc.sumar(-2, -3));
        assertEquals(1, calc.sumar(5, -4));
    }
}