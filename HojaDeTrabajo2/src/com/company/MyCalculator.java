/*
 * Hoja de trabajo 2
 * Estructura de datos
 * Clase de Calculadora
 * @autor Maria Isabel Ortiz Naranjo 18176
 * @autor Diego Estrada
 *
 * */

package com.company;

public class MyCalculator implements Calculator {

    // Constructor
    public MyCalculator(){}

    @Override
    /*@param numero1 es el primer numero a operar
    * @param numero2 es el segundo numero a operar
    * @param respuesta es la respuesta de la operacion indicada
    * */
    public int Calcular(int numero1, int numero2, String operacion) {
        // La variable respuesta, empieza en 0

        int respuesta = 0;

        // Metodos para realizar los calculos


        /* Metodo para multiplicar
         *  @param numero1 es el primer numero a operar
         * @param numero2 es el segundo numero a operar
         * @param respuesta es la respuesta de la multiplicacion
         * */
         if (operacion.equals("*"))
             respuesta = numero1 * numero2;

        //Metodo para dividir
        /*@param numero1 es el primer numero a operar
         * @param numero2 es el segundo numero a operar
         * @param respuesta es la respuesta de la division
         * */
        if (operacion.equals("/"))
            if (numero2 != 0) {
                respuesta = numero1 / numero2;

            } else {
                System.out.println("NO SE PUEDE DIVIDIR POR 0");
            }
        //Metodo para sumar
        /*@param numero1 es el primer numero a operar
         * @param numero2 es el segundo numero a operar
         * @param respuesta es la respuesta de la suma
         * */
        if (operacion.equals("+")) {
            respuesta = numero1 + numero2;
        }

        //Metodo para restar
        /*@param numero1 es el primer numero a operar
         * @param numero2 es el segundo numero a operar
         * @param respuesta es la respuesta de la resta
         * */
        if (operacion.equals("-")) {
            respuesta = numero2 - numero1;
        }
        return respuesta;
    }
}
