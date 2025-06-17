package strings;

public class StringMethods {

	public static void main(String[] args) {
		String saludo = "Hola mundo";
		System.out.println(saludo.charAt(3));
		System.out.println("Longitud: " + saludo.length());
		System.out.println("En mayusculas: " + saludo.toUpperCase());
		System.out.println("¿Contiene 'mun'?: " + saludo.contains("mun"));
		System.out.println("Reemplazo: " + saludo.replace("mundo", "Java"));
		System.out.println(saludo.concat(" animal"));
		System.out.println("Termina en 'Hola'?: " + saludo.endsWith("Hola"));
		
		System.out.println("--------------------");
		
		String text1 = "Hola Mundo";
		System.out.println(text1.equals(saludo));
		System.out.println("Indice de 'm': " + saludo.indexOf("mundo"));
		System.out.println("Indice de 'mundo': " + saludo.indexOf("mundo"));
		System.out.println("Indice de 'Mundo': " + saludo.indexOf("Pablo"));
		
	}

}
