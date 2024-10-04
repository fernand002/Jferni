package ejerciciosSegundaEntrega;

import java.util.Scanner;

public class test {
	public static void  main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escriba un numero para saber si es par o impar : ");
		int num =scan.nextInt();
		
		if (esPar(num)) {
			System.out.println("El numero es par");
			
		} else {
			System.out.println("El numero es impar");

		}
		
	

}

	private static boolean esPar(int num) {
		return num % 2 == 0 ;
	}
}

