import java.util.Scanner;
import java.lang.Math;

public class Calculadora {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 2 numeros");
        float firstNumber;
        float secondNumber;

        try{
            firstNumber = scanner.nextInt();
            secondNumber = scanner.nextInt();

            System.out.println("Selecciona el tipo de operacion: *, /, +, -, %, ^");
            String operation = scanner.next();

            System.out.print("Resultado: ");

            switch (operation) {
            case "*": 
                System.out.println(firstNumber * secondNumber); 
                break;
            case "/": 
                if(secondNumber != 0){
                    System.out.println(firstNumber / secondNumber);
                }else{
                    System.out.println("No se puede dividir un numero entre 0");
                }
                break;
            case "+": 
                System.out.println(firstNumber + secondNumber);
                break;
            case "-": 
                System.out.println(firstNumber - secondNumber); 
                break;
            case "%": 
                System.out.println(firstNumber % secondNumber); 
                break;
            case "^": 
                System.out.println(Math.pow(firstNumber, secondNumber)); 
                break;
            default: System.out.println("Selecciona un caracter valido"); 
            }
        }catch(Exception e){
            System.out.println("La calculadora solo acepta numeros");
        }

        

        scanner.close();
    }
} 