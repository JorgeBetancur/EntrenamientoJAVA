package Utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

public class ReadYAMLData {

	public static void main(String[] args) throws FileNotFoundException, YamlException{
		//Construye la ruta al archivo tesrData.yml dentro del proyecto
		String filepath = System.getProperty("user.dir") + "//testData.yml";
		
		//Abrir el archivo YAML
		FileReader file = new FileReader(filepath);
		
		//Crea un lector yml a partir del archivo
		YamlReader reader = new YamlReader(file);
		
		//Leer el contenido del archivo yaml como map con claves tipo string y valores tipo oblect
		@SuppressWarnings("unchecked")
		Map <String, Object> testData = (Map<String, Object>)reader.read();
		
		//Extrae la lista de casos de prueba bajo la clave testdata
		List<Map<String, Object>> testCases = (List<Map<String, Object>>) testData.get("testdata");
		System.out.println("Todos los casos de prueba");
		System.out.println(testCases);
		
		//Toma el primer caso de prueba
		Map<String, Object> loginTestData = testCases.get(0);
		System.out.println("Nombre del primer test:");
		System.out.println(loginTestData.get("testName"));
		
		//Extrae la lista de datos del primer caso de prueba.
		@SuppressWarnings("Unchecked")
		List<Map<String, Object>> loginTestDataData = (List<Map<String, Object>>)loginTestData.get("data");
		System.out.println("Datos del primer test:");
		System.out.println(loginTestDataData);

	}

}
