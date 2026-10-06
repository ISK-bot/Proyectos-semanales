/* Ya es momento de crear un codigo funcional, que tenga una función.
El objetivo de este proyecto es poder 
*/

import java.util.Scanner;

public class Proyecto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Pin1 = sc.nextInt();
        int Pin2 = sc.nextInt();
        boolean igual = (Pin1 == Pin2)
        System.out.println("Ingresa tu PIN: " + Pin1);
        System.out.println("Vuelve a ingresar tu pin: " + Pin2);

        if (Pin1 == Pin2) {
        System.out.println("Pin registrado");
        }
        else {
            System.out.println("El Pin no es igual")
        }



    }

}
