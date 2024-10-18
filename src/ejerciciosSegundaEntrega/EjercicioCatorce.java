package ejerciciosSegundaEntrega;

import java.util.Scanner;

public class EjercicioCatorce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo (N): ");
        int N = scanner.nextInt(); 

        if (N <= 0) {
            System.out.println("Por favor, introduce un número entero positivo.");
        } else {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* "); 
                }
                System.out.println(); 
            }
        }

      
    }
}
30
