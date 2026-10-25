/* Ya es momento de crear un codigo funcional, que tenga una función.
Mi objetivo es poder hacer algo parecido a los cajeros automáticos, con validación
de PIN.
*/

import java.util.Scanner;
import java.util.Random;

public class Proy2 /*Proyecto2.java*/{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Ingresa tu DNI: ");
        int DNI = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa la letra de tu DNI: ");
        char letra_DNI = sc.nextLine().charAt(0);
        int numero_de_intentos = 3;
        int Pin1;
        int Pin2;
        boolean Pin_igual;

        do {                                            // BLOQUE DO-WHILE
            System.out.println("Ingresa tu PIN: ");
            Pin1 = sc.nextInt();
            System.out.println("Confirma tu pin: ");
            Pin2 = sc.nextInt();
            Pin_igual = (Pin1 == Pin2);
        } while(Pin1 != Pin2 && numero_de_intentos > 0);

            if (Pin_igual) {
            System.out.println("Pin registrado");
                int valor_random = rand.nextInt(1000000)-100000;
                if (valor_random > 0) {
                    System.out.println("Tu saldo es: " + valor_random);
                    System.out.println("Pulsa 1 para retirar dinero: ");
                    System.out.println("Pulsa 2 para ingresar dinero: ");
                    System.out.println("Pulsa 3 para hacer una transferencia: ");
                    int opcion = sc.nextInt();

                    switch (opcion) {                   // BLOQUE SWITCH
                        case 1 : 
                        System.out.println("Cuanto dinero quieres retirar: ");
                        double retirar = sc.nextDouble();
                        if (retirar < 0){
                            System.out.println("No se puede transferir una cantidad negativa");
                        } else {
                            double resta = valor_random - retirar;
                            System.out.println("Tu saldo actual es: " + resta);
                        }
                        break;

                        case 2 :
                        System.out.println("Cuanto dinero quieres ingresar: ");
                        double ingresar = sc.nextDouble();
                        if (ingresar < 0){
                            System.out.println("No se puede transferir una cantidad negativa");
                        } else {
                            double suma = valor_random + ingresar;
                            System.out.println("Tu saldo actual es: " + suma);
                        }
                        break;

                        case 3 :
                        System.out.println("Cuanto dinero quieres transferir: ");
                        double transferir = sc.nextDouble();
                        if (transferir < 0){
                            System.out.println("No se puede transferir una cantidad negativa");
                        } else {
                            double resta2 = valor_random - transferir;
                            System.out.println("Tu saldo actual es: " + resta2);
                        }
                        
                        break;

                        default : 
                        System.out.println("Opción no válida, vuelva a intentarlo");
                        break;
                    }

                } else {
                    System.out.println("Tienes una deuda de: " + valor_random);
                    System.out.println("¿Cuando podrás pagarla?");
                    int random2 = rand.nextInt(31);
                    System.out.println("Te quedan "+ random2 + " días para pagarla");
                }
                
            }
            else {
                System.out.println("El Pin no es igual");  
            }
            sc.close();
    }
}
