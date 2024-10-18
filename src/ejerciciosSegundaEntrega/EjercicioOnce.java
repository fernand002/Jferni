package ejerciciosSegundaEntrega;

import java.util.Random;
import java.util.Scanner;

public class EjercicioOnce {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
    
        int numeroAleatorio = random.nextInt(100) + 1;
        int intento = 0; 
        System.out.println("He generado un número entre 1 y 100. ¡Intenta adivinarlo!");

       
        while (intento != numeroAleatorio) {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt(); 
            
            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        }
             
    }
}
