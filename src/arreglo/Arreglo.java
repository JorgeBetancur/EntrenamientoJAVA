package arreglo;

public class Arreglo {

	public static void main(String[] args) {

		int arregloUno[]=new int[10];
		
		arregloUno[0]=12;
		arregloUno[1]=15;
		arregloUno[2]=22;
		arregloUno[3]=24;
		arregloUno[4]=29;
		arregloUno[5]=30;
		arregloUno[6]=34;
		arregloUno[7]=36;
		arregloUno[8]=45;
		//arregloUno[9]=15;
		//arregloUno[10]=15;
		
		//Acceder a los valores del arreglo
		System.out.println(arregloUno[4]);
		
		//Iterar el arreglo
		for(int i=0; i<arregloUno.length; i++)
		{
			System.out.println(arregloUno[i]);			
		}
		
		// Otra manera de definir e iniciar el arreglo
		int arregloDos[]= {5,10,15,20,25,30,35};
		System.out.println("Tamaño del arreglo es: "+arregloDos.length);
	}

}
