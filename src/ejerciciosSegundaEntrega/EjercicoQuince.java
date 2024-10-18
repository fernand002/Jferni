package ejerciciosSegundaEntrega;

import java.util.Scanner;

import java.util.Scanner;

public class EjercicoQuince {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de números (N): ");
        int N = scanner.nextInt(); 
        if (N <= 0) {
            System.out.println("Por favor, introduce un número entero positivo.");
        } else {
            double suma = 0; 

            for (int i = 1; i <= N; i++) {
                System.out.print("Introduce el número " + i + ": ");
                double numero = scanner.nextDouble(); 
                suma += numero; 

            double promedio = suma / N;

            System.out.println("El promedio de los números introducidos es: " + promedio);
        }

    }
}
}