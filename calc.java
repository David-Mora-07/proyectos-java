package calculadora;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        //introduccion del primer numero
        System.out.println("Introduce el primer numero: ");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextInt();
        //introduccion del operador en forma de caracter
        System.out.println("Introduce el operador(+, -, /, *): ");
        char op = sc.next().charAt(0);
        //introduccion del segundo numero
        System.out.println("Introduce el segundo numero: ");
        double num2 = sc.nextInt();
        //switch para la operacion
        switch(op){
            case '+':
            System.out.println("El resultado es: " + (num1 + num2));
            break;
        case '-':
            System.out.println("El resultado es: " + (num1 - num2));
            break;
        case '*':
            System.out.println("El resultado es: " + (num1 * num2));
            break;
        case '/':
            System.out.println("El resultado es: " + (num1 / num2));
            break;
        default:
            System.out.println("Operador no valido");
            break;
        }
        
        sc.close();
    }
}
