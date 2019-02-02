/*
 * Hoja de trabajo 2
 * Estructura de datos
 * Clase de Calculadora
 *  Create by Maria Isabel Ortiz Naranjo 18176
 * Create by Diego Estrada
 *
 * */

package com.company;

/**
 * Clase que implementa Calculator
 */
public class MyCalculator implements Calculator {

    // Constructor
    public MyCalculator(){}

    /**
     * @param numero1   es el primer numero a operar
     * @param numero2   es el segundo numero a operar
     * @param operacion es la respuesta de la operacion indicda
     * @return retorna la respuesta
     */
    @Override
    // Metodos para realizar los calculos
    public int Calcular(int numero1, int numero2, String operacion) {

        // La variable respuesta, empieza en 0

        int respuesta = 0;

         if (operacion.equals("*"))
             respuesta = numero1 * numero2;

        //Dividir

        if (operacion.equals("/"))
            if (numero2 != 0) {
                respuesta = numero1 / numero2;

            } else {
                System.out.println("NO SE PUEDE DIVIDIR POR 0");
            }
        //Suma
        if (operacion.equals("+")) {
            respuesta = numero1 + numero2;
        }

        //Restar

        if (operacion.equals("-")) {
            respuesta = numero2 - numero1;
        }
        return respuesta;
    }
}
