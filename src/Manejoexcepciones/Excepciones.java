package Manejoexcepciones;
import java.util.Scanner;
public class Excepciones {

	public static void main(String[] args) {
		try {
			String texto = "Jorge";
			System.out.println(texto.length());
		}catch(NullPointerException e) {
			System.out.println("Error: estás intentando acceder a un objeto nulo");
		}
		
		//segundo metodo
		int numero=pedirNumeroEntero();
		System.out.println("Número ingresado correctamente: " + numero);
		
	}
	
	public static int pedirNumeroEntero() {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		boolean a = false; //amarillo
		
		while(!a) {
			System.out.println("Ingrese un número entero: ");
			String entrada = scanner.nextLine();
			try {
				numero = Integer.parseInt(entrada);
				a = true; //rojo
			}catch(NumberFormatException e) {
				System.out.println("Error: no ingresaste un número valido");
			}
		}
		scanner.close();
		return numero;
	}

}
