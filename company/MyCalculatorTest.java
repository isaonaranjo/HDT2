/*
 * Hoja de trabajo 2
 * Estructura de datos
 * Clase de Calculadora
 * @author Maria Isabel Ortiz Naranjo 18176
 * @author Diego Estrada
 *  Esta clase permite probar que los metodos funcionen correctamente.
 *
 * */

package com.company;
import org.junit.Test;

import static org.junit.Assert.*;
public class MyCalculatorTest {

    // Prueba test con My Calculator

    Calculator test = new  MyCalculator();
    @Test
    public void Calcular() {

        // Pruebas a realizar con el metodo Calcular()

        assertEquals(test.Calcular(4,4,"*"),16);
        assertEquals(test.Calcular(4,2,"/"),2);
        assertEquals(test.Calcular(8,6,"+"),14);
        assertEquals(test.Calcular(8,1,"-"),7);
    }
}
