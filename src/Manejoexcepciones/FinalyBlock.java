package Manejoexcepciones;

public class FinalyBlock {

	public static void main(String[] args) {
		Integer resultado = null;
		
		try {
			System.out.println("Intentando dividir.........");
			resultado = 10 / 0;
			System.out.println("Resultado: " + resultado);
			
			//Guardar resultado
			System.out.println("Guardando resultado en BD");
		} catch (ArithmeticException e){
			System.out.println("Error división por cero");
		} finally {
			//Solo limpieza
			System.out.println("Cerrando conexión a la BD");
		}

	}

}
