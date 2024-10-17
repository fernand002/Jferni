package ejerciciosSegundaEntrega;

import java.util.Scanner;

public class EjercicioDos {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduzca el numero para calcular : ");
		int numero = scan.nextInt();

		for (int i = (int) 0; i < numero + 1; i++) {
			System.out.println(+i);
		}

	}
}
