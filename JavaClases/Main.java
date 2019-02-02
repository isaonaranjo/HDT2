/*
 * Hoja de trabajo 2
 * Estructura de datos
 * Create by Maria Isabel Ortiz Naranjo 18176
 * Create by Diego Estrada
 *  Main de la Calculadora
 */

package JavaClases;

import java.util.*;
import java.io.*;

/**
 * Main de la calculadora
 */
public class Main {


    /**
     * @param args main para el funcionamiento de la calculadora
     */
    public static void main(String args[]){
        // Empieza a correr la calculadora
        System.out.println("-----Advertencia inicial------\n" +
                "Para poder ejecutar este programa deberás de tener tu archivo .txt en la misma carpeta de este proyecto, de otra manera no funcionará...\n" +
                "-------------------------------");
        MyCalculator calculator = new MyCalculator();
        Pila<Integer> myStack = new Pila<>();
        int num1;
        int num2;
        int result;
        ArrayList<String> validDigits = new ArrayList<>();
        // Se valida que se tengan los numeros del 1 al 9
        validDigits.add("0");
        validDigits.add("1");
        validDigits.add("2");
        validDigits.add("3");
        validDigits.add("4");
        validDigits.add("5");
        validDigits.add("6");
        validDigits.add("7");
        validDigits.add("8");
        validDigits.add("9");
        Boolean wantsToContinue = true;
        // Se pide que se escriba el archivo con las postfix, .txt
        do {
            System.out.println("===================================================================================================\n" +
                    "Escriba el nombre del archivo con las operaciones postfix, seguido de la terminacion '.txt'........\n" +
                    "===================================================================================================\n");
            Scanner sc = new Scanner(System.in);
            String selectedFile = sc.nextLine();
            BufferedReader br = null;
            FileReader fr = null;
            String msgToPrint ="";

            // Se ejecutan las instrucciones del archivo
            try {
                System.out.println("\nEjecutando las instrucciones del archivo " + selectedFile + "\n");
                fr = new FileReader(selectedFile);
                br = new BufferedReader(fr);
                while ((msgToPrint = br.readLine()) != null) {
                    boolean validOperation = true;
                    String[] array = msgToPrint.split(" ");
                    for (int i=0; i<array.length; i++) {
                        // Operacion = suma
                        if (array[i].equals("+")){
                            num1 = myStack.pop();
                            num2 = myStack.pop();
                            myStack.push(calculator.Calcular(num1,num2,"+"));
                        }
                        //Operacion = resta
                        else if (array[i].equals("-")){
                            num1 = myStack.pop();
                            num2 = myStack.pop();
                            myStack.push(calculator.Calcular(num1,num2,"-"));
                        }
                        //Operacion = multiplicacion
                        else if (array[i].equals("*")){
                            num1 = myStack.pop();
                            num2 = myStack.pop();
                            myStack.push(calculator.Calcular(num1,num2,"*"));
                        }

                        // Operacion = division
                        else if (array[i].equals("/")){
                            num1 = myStack.pop();
                            num2 = myStack.pop();
                            myStack.push(calculator.Calcular(num1,num2,"/"));
                        }
                        // Programacion defensiva
                        else {
                            if (validDigits.contains(array[i])) {
                                if (myStack.size() < 2) {
                                    myStack.push(Integer.valueOf(array[i]));
                                } else {
                                    validOperation = false;
                                    System.out.println("Hay algo que no esta correcto con esta fila-----> " + msgToPrint + "'\n");
                                }
                            } else {
                                validOperation = false;
                                System.out.println("Caracter invalido para realizar una operacion ----> " + array[i] + " <----- : El error esta en la siguiente instruccion : " + msgToPrint + "'\n");
                            }
                        }
                    }
                    // Se imprimen los resultados
                    result = myStack.pop();
                    if (validOperation) {
                        System.out.println("La secuencia (" + msgToPrint + ") da como resultado: " + result + "\n");
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            // Se puede ver el resultado final
            System.out.println("------> Se termino de ejecutar las operaciones del archivo:" + selectedFile + "\nPuede proceder con otro archivo :)\n");
            // Si quiere continuar...
        }while(wantsToContinue);
    }
}
