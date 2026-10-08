/* Ya es momento de crear un codigo funcional, que tenga una función.
Mi objetivo es poder hacer algo parecido a los cajeros automáticos, con validación
de PIN.
*/

import java.util.Scanner;

public class Proy2 /*Proyecto2.java*/{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu PIN: ");
        int Pin1;
        Pin1 = sc.nextInt();
        System.out.println("Vuelve a ingresar tu pin: ");
        int Pin2;
        Pin2 = sc.nextInt();
        int numero_de_intentos = 3;
        boolean Pin_igual = (Pin1 == Pin2);


        if (Pin_igual) {
        System.out.println("Pin registrado");
            sc.close();
        }
        else {
            numero_de_intentos = numero_de_intentos - 1;
            System.out.println("El Pin no es igual");  
        
            System.out.println("Ingresar tu pin: ");
            Pin1 = sc.nextInt();
            System.out.println("Vuelve a ingresar tu pin: ");
            Pin2 = sc.nextInt();
            //Aqui faltan cosas,
        }

        if (numero_de_intentos == 0) {
           System.out.println("Te has quedado sin intentos ");
            sc.close();
        }
        else if (Pin_igual == true) {
        System.out.println();
        }
        else {
        System.out.println("Te quedan " + numero_de_intentos + "intentos");
        }
    }

}

