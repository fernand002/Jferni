package EjerciciosPrimeraEntrega;

import java.util.Scanner;

public class ejercicioDiez {
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca el precio que quiere calcular : ");
		double precio = scan.nextDouble();
		
	
		double ivaPorcentaje = 21.0; 
		
		double precioFinal = precio + (precio * ivaPorcentaje / 100);
		System.out.println("El precio final con IVA es: " + precioFinal);
		scan.close();
	}
}
