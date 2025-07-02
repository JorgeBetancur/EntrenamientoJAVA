package Utilities;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

//Importa las clases de la biblioteca JSON
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJasonData {

	public static void main(String[] args) throws IOException, ParseException{
		
		String filepath = System.getProperty("user.dir") + "//testData.json"; //Obtiene la ruta absoluta del directorio actual
		
		FileReader file = new FileReader(filepath);
		//Abre el archivo json ubicado de la ruta especifica
		
		JSONParser parser = new JSONParser();
		//Crea una instancia en la clase Parser que se usa para convertir el texto del archivo
		
		JSONObject json = (JSONObject) parser.parse(file);
		//Parsea el contenido del archivoy lo convierte en un objeto json principal.
		
		System.out.println(json.toJSONString());
		//Muestra contenido completo del archivo json en forma de texto
		
		JSONArray testData = (JSONArray) json.get("testdata");
		//Extrae el objeto json el arregla que esta bajo la clave "testdata"
		//Este arreglo contiene uno o mas casos de prueba
		
		for (int i = 0; i < testData.size(); i++) {
			//Itera sobre cada uno de los elementos  del arreglo testData
			JSONObject testCase = (JSONObject) testData.get(i);
			//Extrae un objeto individual que representa el caso de prueba
			
			System.out.println("Test case name is:" + testCase.get("testName"));
			//Imprime el nombre del caso de prueba
			
			JSONArray testCaseData = (JSONArray) testCase.get("data");
			//Extrae el arreglo de datos que está bajo la clave "data"
			
			for (int j = 0; j< testCaseData.size(); j++) {
				//Itera sobre cada elemento dentro del arreglo "data" 
				
				JSONObject currentTestData = (JSONObject) testCaseData.get(j);
				//Obtiene el objeto json actual (un conjunto clave-valor)
				
				Set<String> keys = currentTestData.keySet();
				//Obtiene el conjunto de claves del objeto actual
				
				Iterator<String> it = keys.iterator();
				//Crea un iteraador para recorrer todas las claves del objeto
				
				while (it.hasNext()) {
					//Mientras haya mas claves por recorrer:
					String key = it.next();//Obtiene la siguiente clave
					String value = (String) currentTestData.get(key);//Obtiene el valor correspondiente a la clave
					
					System.out.println(key + "----" + value);
				}
				
			}
			
		}
		
		

	}

}
