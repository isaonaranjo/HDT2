/*
 * Hoja de trabajo 2
 * Estructura de datos
 * Clase de Calculadora
 * Create by Maria Isabel Ortiz Naranjo 18176
 * Create by Diego Estrada
 */
package JavaClases;

import org.junit.runners.Parameterized;


/**
 * Es la interfaz de la calculadora
 */
public interface Calculator {

    /**
     * @param numero1 es el primer numero a operar
     * @param numero2 es el segundo numero a operar
     * @param operacion es la respuesta de la operacion indicda
     * @return retorna la respuesta
     */
    public int Calcular(int numero1, int numero2, String operacion);
}

