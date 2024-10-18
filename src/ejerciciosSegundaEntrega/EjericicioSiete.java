package ejerciciosSegundaEntrega;

public class EjericicioSiete {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 y 100:");

        for (int numero = 2; numero <= 100; numero++) {
            boolean esPrimo = true; 
            
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) { 
                    esPrimo = false;
                    break; 
                }
            }
                       
            if (esPrimo) {
                System.out.println(numero);
            }
        }
    }
}
