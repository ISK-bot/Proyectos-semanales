/* Ya es momento de crear un codigo funcional, que tenga una función.
Mi objetivo es poder hacer algo parecido a los cajeros automáticos, con validación
de PIN.

Algo que quiero dejar para más tarde son los bucles, estos, aún no los hemos dado, por lo que para poder 
hacer una buena validación de PIN debería esperar a dar los bucles.
*/

import java.util.Scanner;

public class Proy2 /*Proyecto2.java*/ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu DNI(numeros): ");       // Deberemos ingresar los numeros de nuestro DNI. - Falta especificar el límite de caracteres de la entrada por teclado
        int DNI = sc.nextInt();
        sc.nextLine();                                      // Limpiamos el buffer (con un salto de linea).

        System.out.print("Ingresa la letra del DNI: ");     // Deberemos ingresar la letra de nuestro DNI.
        String letra_DNI = sc.next();
        System.out.println("Ingresa tu PIN: ");             // Ingresamos el PIN que usaremos.
        int Pin1;
        Pin1 = sc.nextInt();
        System.out.println("Vuelve a ingresar tu pin: ");   // Confirmamos nuestro PIN.
        int Pin2;
        Pin2 = sc.nextInt();


        if (Pin_igual) {
        System.out.println("Pin registrado");               // Si son iguales, estará registrado como PIN
        // Para hacerlo más interesante, si son iguales crearemos una variable, que sea ese PIN.
        int PIN_identificador = Pin1;
            sc.close();
        }
        else {
            System.out.println("El Pin no es igual");       // Si no son iguales, aparecerá este mensaje, diciendo que no son iguales. 
        // Cuando metamos los bucles, haremos cosas más grandes.
        }

    }

}