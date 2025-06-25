package Utilities;

import java.io.FileWriter;
import java.io.IOException;

//Importa las clases necesarias para el manejo JSON
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class writeJson {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//------Estudiante 1--------
		JSONObject estudiante1 = new JSONObject();
		estudiante1.put("nombreEstudiante", "Jorge");
		estudiante1.put("grado", "Sexto");
		estudiante1.put("ubicación", "La Ceja");
		
		//------Estudiante 2--------
		JSONObject estudiante2 = new JSONObject();
		estudiante2.put("nombreEstudiante", "Jessica");
		estudiante2.put("grado", "Octavo");
		estudiante2.put("ubicación", "Medellin");
				
		//------Estudiante 3--------
		JSONObject estudiante3 = new JSONObject();
		estudiante3.put("nombreEstudiante", "Maria");
		estudiante3.put("grado", "Octavo");
		estudiante3.put("ubicación", "Ibague");
				
		//Arreglo de estudiantes
		JSONArray detalleEstudiantes = new JSONArray();
		detalleEstudiantes.add(estudiante1);
		detalleEstudiantes.add(estudiante2);
		detalleEstudiantes.add(estudiante3);
		
		//Objeto contenedor principal
		JSONObject datos = new JSONObject();
		datos.put("detalleEstudiantes", detalleEstudiantes);
		
		System.out.println(datos.toJSONString());
		
		try(FileWriter archivo = new FileWriter("estudiantes.json")){
			archivo.write(datos.toJSONString()); //Escribe el contenido JSON como texto
			archivo.flush(); //Fuerza la escritura inmediata de los datos en el disco
			System.out.println("Archivo JSON guardado como 'estudiantes.json'");
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
