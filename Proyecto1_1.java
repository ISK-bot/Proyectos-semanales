// Hoy hemos dado operaciones básicas (variables y operadores). 
import java.util.Scanner;

public class Proyecto1_1 {             // Nombre del proyecto = Proyecto 1.1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //Creo un nuevo Scan, que escanea el periferico de entrada (el teclado)

        System.out.println("¿Cómo te llamas?");     // Pregunta por mi nombre
        String nombre = sc.nextLine();              // Pregunta por mi edad

        System.out.println("¿Y que edad tienes?");
        int edad = sc.nextInt();
        if (edad > 18)                      // He decidido meterle el condicional porque sino no quedaría bien para el proyecto
        System.out.println("Eres mayor de edad");        // Si eres mayor de edad, sale este mensaje
        else
        System.out.println("Aún eres joven");            // Si eres menor, sale este mensaje 
        
        System.out.print("Hola, mi nombre es " + nombre + ", ");        //Yo soy Y
        System.out.print("tengo " + edad + " años");                    // Tengo X años
        System.out.println(" y soy joven con una mente grandiosa");     // En que sé desarrollarme

        System.out.println("Trata de hacer las siguientes operaciones:");
        int A = 31;
        int B = 6;
        System.out.print("A + B = ");
        int Resultado1 = sc.nextInt();
        System.out.println ("Tu resultado es: " + resultado1);
        sc.nextLine();
        
        System.out.println("A - B");
        int Resultado2 = sc.nextInt();
        System.out.println ("Tu resultado es: " + resultado2);
        sc.nextLine();
        
        System.out.print("A * B = ");
        int Resultado3 = sc.nextInt();
        System.out.println ("Tu resultado es: " + resultado3);
        sc.nextLine();
        
        System.out.println("A / B");
        int Resultado4 = sc.nextInt();
        System.out.println ("Tu resultado es: " + resultado4);
        sc.nextLine();
    }

}
