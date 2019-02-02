/*
 * Hoja de trabajo 2
 * Estructura de datos
 * Clase de Calculadora
 * Create by Maria Isabel Ortiz Naranjo 18176
 * Create by Diego Estrada
 *
 * */
package JavaClases;

        import org.junit.Test;
        import org.junit.runner.RunWith;
        import static org.junit.Assert.*;


/**
 *     Prueba con JUnit
 *     Declaracion de variables
 */
public class PilaTest {


    private Pila<Integer> Stack = new Pila<Integer>();
    /*@param num es el numero que hara las pruebas en los metodos
     * */
    int num = 8;

    /**
     * Retorna el elemento en la ultima posicion de la pila.
     */
    @Test
    // Prueba con el metodo pop
    public void pop() {

        Stack.push(8);
        // Integer esperado = 8
        Integer h = 8;
        assertEquals(h,Stack.pop());
    }

    /**
     * Retorna el valor superior de la pila.
     */
    // Prueba con el metodo peek
    @Test
    public void peek() {
        Stack.push(8);
        // Integer esperado = 8
        Integer h = 8;
        assertEquals(h,Stack.peek());

    }

    /**
     * Retorna true si la pila esta vacia, y false si no lo esta.
     */
    // Prueba con el metodo empty
    @Test
    public void empty() {
        Stack.push(8);
        Stack.pop();
        // Retorna
        assertEquals(true,Stack.empty());
    }

    /**
     * Retorna la cantidad de elementos en la pila.
     */
    // Prueba con el metodo size
    @Test
    public void size() {
        Stack.push(8);
        Stack.push(9);
        //Retorna el tamano de la pila
        assertEquals(2,Stack.size());

    }
}
