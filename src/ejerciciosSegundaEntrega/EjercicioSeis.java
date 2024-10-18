package ejerciciosSegundaEntrega;

import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        
       
        int contador = 0;
        int numeroAbsoluto = Math.abs(numero);
        
      
        if (numeroAbsoluto == 0) {
            contador = 1; 
        } else {
           
            while (numeroAbsoluto > 0) {
                numeroAbsoluto /= 10; 
                contador++; 
            }
        }
        
        System.out.println("El número " + numero + " tiene " + contador + " dígitos.");
        
        scanner.close();
    }
}
