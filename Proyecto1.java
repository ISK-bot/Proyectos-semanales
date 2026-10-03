import java.util.Scanner;

public class Proyecto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //Creo un nuevo Scan, que escanea el periferico de entrada (el teclado)

        System.out.println("¿Cómo te llamas?");     // Pregunta por mi nombre
        String nombre = sc.nextLine();              // Pregunta por mi edad
        System.out.println("¿Y que edad tienes?");
        int edad = sc.nextInt();

        System.out.print("Hola, mi nombre es " + nombre + ", ");        //Yo soy Y
        System.out.print("tengo " + edad + " años");                    // Tengo X años
        System.out.println(" y soy joven con una mente grandiosa");     // En que sé desarrollarme

        sc.close();
    }

}
