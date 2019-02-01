import java.util.*;
import java.io.*;
public class Main {

    public static void main(String args[]){
        MyCalculator calculator = new MyCalculator();
        Pila<Integer> pila = new Pila<>();
        int num1;
        int num2;
        int result;
        ArrayList<String> validDigits = new ArrayList<>();
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
        do {
            System.out.println("===================================================================================================\n" +
                    "Escriba el nombre del archivo con las operaciones postfix, seguido de la terminacion '.txt'........\n" +
                    "===================================================================================================\n");
            Scanner sc = new Scanner(System.in);
            String selectedFile = sc.nextLine();

            BufferedReader br = null;
            FileReader fr = null;
            String msgToPrint ="";

            try {
                System.out.println("\nEjecutando las instrucciones del archivo " + selectedFile);
                fr = new FileReader(selectedFile);
                br = new BufferedReader(fr);
                while ((msgToPrint = br.readLine()) != null) {
                    boolean validOperation = true;
                    String[] outputArray = msgToPrint.split(" ");
                    for (int i=0; i<outputArray.length; i++) {
                        if (outputArray[i].equals("+")){
                            num1 = pila.pop();
                            num2 = pila.pop();
                            pila.push(calculator.Calcular(num1,num2,"+"));
                        }
                        else if (outputArray[i].equals("-")){
                            num1 = pila.pop();
                            num2 = pila.pop();
                            pila.push(calculator.Calcular(num1,num2,"-"));
                        }
                        else if (outputArray[i].equals("*")){
                            num1 = pila.pop();
                            num2 = pila.pop();
                            pila.push(calculator.Calcular(num1,num2,"*"));
                        }
                        else if (outputArray[i].equals("/")){
                            num1 = pila.pop();
                            num2 = pila.pop();
                            pila.push(calculator.Calcular(num1,num2,"/"));
                        }
                        else {
                            if (validDigits.contains(outputArray[i])) {
                                if (pila.size() < 2) {
                                    pila.push(Integer.valueOf(outputArray[i]));
                                } else {
                                    validOperation = false;
                                    System.out.println("Ingresa mas operandos u operaciones para esta linea-----> " + msgToPrint + "'\n");
                                }
                            } else {
                                validOperation = false;
                                System.out.println("Caracter invalido para realizar una operacion ----> " + outputArray[i] + " <----- : El error esta en la siguiente instruccion : " + msgToPrint + "'\n");
                            }
                        }
                    }
                    result = pila.pop();
                    if (validOperation) {
                        System.out.println("La secuencia (" + msgToPrint + ") da como resultado: " + result + "\n");
                    }
                }
            } catch (IOException e) {

                e.printStackTrace();

            }

            System.out.println("------> Se termino de ejecutar las operaciones del archivo:" + selectedFile + "\n");
        }while(true);

    }
}