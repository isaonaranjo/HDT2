/*
 * Hoja de trabajo 2
 * Estructura de datos
 * Clase de Calculadora
 * Create by Maria Isabel Ortiz Naranjo 18176
 * Create by Diego Estrada
 *  Esta clase permite probar que los metodos funcionen correctamente.
 *
 * */

package JavaClases;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *  Prueba test con My Calculator
 *
 */
public class MyCalculatorTest {


    /**
     * Se crea el test
     */
    Calculator test = new  MyCalculator();


    @Test
    public void Calcular() {

        // Pruebas a realizar con el metodo Calcular()

        //Multiplicar
        assertEquals(test.Calcular(4,4,"*"),16);
        //Dividir
        assertEquals(test.Calcular(4,2,"/"),2);
        //Sumar
        assertEquals(test.Calcular(8,6,"+"),14);
        //Restar
        assertEquals(test.Calcular(8,16,"-"),8);
    }
}
