package Arrays;

import java.util.Scanner;
import java.util.ArrayList;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        //primer valor del array (num[0])
        System.out.println("Introduce el primer valor del array: ");
        int x = sc.nextInt();
        num.add(x);
        //segundo valor del array (num[1])
        System.out.println("Introduce el segundo valor del array: ");
        int y = sc.nextInt();
        num.add(y);
        //tercer valor del array (num[2])
        System.out.println("Introduce el tercer  valor del array: ");
        int z = sc.nextInt();
        num.add(z);
        //mostrar el valor que introdujo el usuario
        System.out.println("Quieres ver el array entero (1) o buscar un valor (2)?");
        int s = sc.nextInt();
        if (s == 1){
            System.out.println("El array entero es: " + num);
        }else{
            System.out.println("Introduce el valor del array que queieres ver: ");
            int w = sc.nextInt();
            if (w >= num.size() ){
                System.err.println("El array no es tan grande");
            }else{
                System.out.println("El valor " + w + " del array es: " + num.get(w));
            }
            
        }
        sc.close();
    }
}
