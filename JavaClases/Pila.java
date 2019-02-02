
/*
 * Hoja de trabajo 2
 * Estructura de datos
 * Clase de Calculadora
 * Create by Maria Isabel Ortiz Naranjo 18176
 * Create by Diego Estrada
 * Clase: Pila
 *
 * */
package JavaClases;
import java.util.*;

/**
 * @param <E> Clase pila implementada por Stack
 */

public class Pila <E> implements Stack<E> {

    /**
     * Variable Vector
     */
    protected Vector<E> cant;

    /**
     * Se crea cant, como Vector
     */
    // Constructor
    public Pila()
    {
        cant = new Vector<E>();
    }

    /**
     * @param item este elemento se agregar en la parte superior de la pila.
     */

    @Override
    public void push(E item) {
        cant.add(item);
    }

    /**
     * @return  retorna el elemento en la ultima posicion de la pila.
     */

    @Override
    public E pop() {
        return cant.remove(size() - 1);
    }

    /**
     * @return retorna el valor superior de la pila.
     */
    @Override
    public E peek() {
        return cant.get(size() - 1);
    }

    /**
     * @return retorna true si la pila esta vacia, y false si no lo esta.
     */
    @Override
    public boolean empty() {
        return size() == 0;
    }

    /**
     * @return retorna la cantidad de elementos en la pila.
     */
    @Override
    public int size() {
        return cant.size();
    }
}
