package ejerciciosSegundaEntrega;

import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        
        int numeroInvertido = 0; 
        
        while (numero != 0) {
            int digito = numero % 10; 
            numeroInvertido = numeroInvertido * 10 + digito; 
            numero /= 10;
        }
        
        System.out.println("El número invertido es: " + numeroInvertido);
        
        scanner.close();
    }
}
