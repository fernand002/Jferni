package ejerciciosSegundaEntrega;

import java.util.Scanner;

public class EjercicioDies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el número de términos de la serie de Fibonacci que deseas mostrar: ");
        int N = scanner.nextInt();
        
        
        if (N <= 0) {
            System.out.println("Por favor, introduce un número entero positivo.");
        } else {
            System.out.println("Los primeros " + N + " términos de la serie de Fibonacci son:");

            int a = 0; 
            int b = 1; 
            
            for (int i = 1; i <= N; i++) {
                System.out.print(a + " "); 
                              
                int siguiente = a + b;
                a = b; 
                b = siguiente; 
            }
        }
        
    }
}
