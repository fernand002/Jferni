package EjerciciosPrimeraEntrega;

import java.util.Scanner;

public class ejercicioNueve {
	public static void main (String[]args) {
		
	Scanner myObj = new Scanner(System.in);  
	
	
    System.out.println("Su nombre : ");
	String userNombre = myObj.nextLine();  
	System.out.println("Su apellido : ");
	String userApellido = myObj.nextLine();  
	System.out.println("Sus Años : ");
	String userEdad = myObj.nextLine();  
    System.out.println("¿ Se  llama " + userNombre + userApellido + " y tiene " + userEdad + " años ?" );  
    myObj.close();
} 
}	