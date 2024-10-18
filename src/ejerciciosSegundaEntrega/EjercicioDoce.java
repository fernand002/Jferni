package ejerciciosSegundaEntrega;

import java.util.Scanner;

public class EjercicioDoce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        int suma = 0; 
        
        numero = Math.abs(numero);

       
        while (numero > 0) {
            int digito = numero % 10; 
            suma += digito; 
            numero /= 10; 
        }

        System.out.println("La suma de los dígitos es: " + suma); 
        scanner.close();
}
}