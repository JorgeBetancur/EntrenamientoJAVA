package strings;

public class introduccionString {

	public static void main(String[] args) {
		String nombre = "Juan Perez";
		String nombre2 = "Juan Perez";
		String nombre3 = "Juan perez";
		
		String pais = new String ("Colombia");
		String pais2 = new String ("Colombia");
		
		System.out.println(nombre.equals(nombre2));
		System.out.println(nombre.equals(nombre3));
		
		System.out.println(nombre.equalsIgnoreCase(nombre3));
		System.out.println(pais.equals(pais2));
		
		//---------//
		
		System.out.println("-----------------");
		
		System.out.println(nombre==nombre2);
		System.out.println(pais==pais2);
		
		//CONCATENACION
		
		String finalString=nombre+nombre2+nombre3;
		System.out.println(finalString);
		
		String segundoString=nombre.concat(nombre2).concat(nombre3);
		System.out.println(segundoString);
		
	}

}
