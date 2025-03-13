package contactos;

import java.util.Scanner;
import java.util.ArrayList;

public class contact {
    public static void main(String[] args){
        //aqui se abre el Scanner
        Scanner sc = new Scanner(System.in);
        //definir los arrays
        ArrayList<String> contacts = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        do {
            System.out.println("-----------------------------------AGENDA DE CONTACTOS-----------------------------------");
            //aqui se pide al usuario que introduzca el nombre del contacto que quiere añadir
            System.out.println("Introduce el nombre del contacto: ");
            String c = sc.nextLine();
            contacts.add(c);
            //aqui pedimos que introduzca el numero de telefono del contacto
            System.out.println("Ok, ahora introduze el numero de telefono: ");
            int n = sc.nextInt();
            nums.add(n);
            sc.nextLine(); // Consumir la nueva línea pendiente
            System.out.println("¿Que quieres hacer ahora?");
            System.out.println("a) Añadir otro contacto");
            System.out.println("b) Ver los contactos");
            System.out.println("c) Salir");
            char r = sc.nextLine().charAt(0);
            if(r == 'a'){
                continue;
            }else if(r == 'b'){
                System.out.println(contacts);
                System.out.println(nums);
                System.out.println("Quieres meter mas contactos? (s/n)");
                String v = sc.nextLine();
                if(v.equals("s")){
                    continue;
                }else if(v.equals("n")){
                    break;
                }else{
                    System.out.println("Porfavor, responde con 's' o 'n'");
                }
            }else if(r == 'c'){
                break;
            }
        } while (true);
        sc.close();
    }
}
