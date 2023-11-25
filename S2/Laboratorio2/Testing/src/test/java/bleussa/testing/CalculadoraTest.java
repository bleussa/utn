/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package bleussa.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bleussa
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testDividir() {
        System.out.println("dividir");
        double a = 4;
        double b = 2;
        Calculadora instance = new Calculadora();
        double expResult = 5;
        double result = instance.dividir(a, b);
        assertEquals(expResult, result, 0);
    }
    
}
