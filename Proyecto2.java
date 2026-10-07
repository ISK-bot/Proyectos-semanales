/* Ya es momento de crear un codigo funcional, que tenga una función.
El objetivo de este proyecto es poder 
*/

import java.util.Scanner;

public class Proyecto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Pin1 = sc.nextInt();
        int Pin2 = sc.nextInt();
        int numero_de_intentos = 3:
        boolean Pin_igual = (Pin1 == Pin2);
        System.out.println("Ingresa tu PIN: " + Pin1);
        System.out.println("Vuelve a ingresar tu pin: " + Pin2);

        if (Pin1 == Pin2) {
        System.out.println("Pin registrado");
        }
        else {
            numero_de_intentos = numero_de_intentos - 1;
            System.out.println("El Pin no es igual");  
            System.out.println("Te quedan " + numero_de_intentos + "intentos");
        }

        if numero_de_intentos = 0 {
           System.out.println("Te has quedado sin intentos ");
            sc.close();
        }
        else {
        System.out.println("Te quedan " + numero_de_intentos + "intentos");
        }

    }

}
