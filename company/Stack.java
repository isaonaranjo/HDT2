/*
 * Hoja de trabajo 2
 * Estructura de datos
 * Clase de Calculadora
 * @author Maria Isabel Ortiz Naranjo 18176
 * @author Diego Estrada
 * Clase: interface Stack
 *
 * */
package com.company;

/* @param <E> elemento almacenado por la pila
* */
public interface Stack<E> {

    /*
    * @param item este elemento se agregar en la parte superior de la pila.
    * */
    public void push(E item);

    /*
    * @return retorna el elemento en la ultima posicion de la pila.
    * */
    public E pop();

    /*
    * @return retorna el valor superior de la pila.
    * */
    public E peek();

    /* @return retorna true si la pila esta vacia, y false si no lo esta.
    * */
    public boolean empty();

    /* @return retorna la cantidad de elementos en la pila.
    * */
    public int size();

}
