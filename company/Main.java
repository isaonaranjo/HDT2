import java.util.*;
import java.io.*;
public class Main {

    public static void main(String args[]){
        System.out.println("-----Advertencia inicial------\n" +
                "Para poder ejecutar este programa deberás de tener tu archivo .txt en la misma carpeta de este proyecto, de otra manera no funcionará...\n" +
                "-------------------------------");
        MyCalculator calculator = new MyCalculator();
        Pila<Integer> myStack = new Pila<>();
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
        Boolean wantsToContinue = true;
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
                System.out.println("\nEjecutando las instrucciones del archivo " + selectedFile + "\n");
                fr = new FileReader(selectedFile);
                br = new BufferedReader(fr);
                while ((msgToPrint = br.readLine()) != null) {
                    boolean validOperation = true;
                    String[] outputArray = msgToPrint.split(" ");
                    for (int i=0; i<outputArray.length; i++) {
                        if (outputArray[i].equals("+")){
                            num1 = myStack.pop();
                            num2 = myStack.pop();
                            myStack.push(calculator.Calcular(num1,num2,"+"));
                        }
                        else if (outputArray[i].equals("-")){
                            num1 = myStack.pop();
                            num2 = myStack.pop();
                            myStack.push(calculator.Calcular(num1,num2,"-"));
                        }
                        else if (outputArray[i].equals("*")){
                            num1 = myStack.pop();
                            num2 = myStack.pop();
                            myStack.push(calculator.Calcular(num1,num2,"*"));
                        }
                        else if (outputArray[i].equals("/")){
                            num1 = myStack.pop();
                            num2 = myStack.pop();
                            myStack.push(calculator.Calcular(num1,num2,"/"));
                        }
                        else {
                            if (validDigits.contains(outputArray[i])) {
                                if (myStack.size() < 2) {
                                    myStack.push(Integer.valueOf(outputArray[i]));
                                } else {
                                    validOperation = false;
                                    System.out.println("Hay algo que no esta correcto con esta fila-----> " + msgToPrint + "'\n");
                                }
                            } else {
                                validOperation = false;
                                System.out.println("Caracter invalido para realizar una operacion ----> " + outputArray[i] + " <----- : El error esta en la siguiente instruccion : " + msgToPrint + "'\n");
                            }
                        }
                    }
                    result = myStack.pop();
                    if (validOperation) {
                        System.out.println("La secuencia (" + msgToPrint + ") da como resultado: " + result + "\n");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("------> Se termino de ejecutar las operaciones del archivo:" + selectedFile + "\nPuede proceder con otro archivo :)\n");
        }while(wantsToContinue);
    }
}