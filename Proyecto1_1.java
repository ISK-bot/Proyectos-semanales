// Hoy hemos dado operaciones básicas (variables y operadores). 
import java.util.Scanner;

public class Main {             // Nombre del proyecto = Proyecto_1_1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //Creo un nuevo Scan, que escanea el periferico de entrada (el teclado)

        System.out.println("¿Cómo te llamas?");     // Pregunta por mi nombre
        String nombre = sc.nextLine();              // Pregunta por mi edad

        System.out.println("¿Y que edad tienes?");
        int edad = sc.nextInt();
        if (edad > 18)                      // He decidido meterle el condicional porque sino no quedaría bien para el proyecto
        System.out.println("Eres mayor de edad");
        else
        System.out.println("Aún eres joven");
        System.out.println(" ");
        
        System.out.print("Hola, mi nombre es " + nombre + ", ");        //Yo soy Y
        System.out.print("tengo " + edad + " años");                    // Tengo X años
        System.out.println(" y soy joven con una mente grandiosa");     // En que sé desarrollarme

        sc.close();
    }

}
