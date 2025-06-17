package Utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		InputStream readFile = null;
		
		try {
			readFile = new FileInputStream("config.properties");
			
			//Se cargan las propiedades desde el archivo hacia el obejto prop
			prop.load(readFile);
			
			//Se recupera y muestra las propiedades especificas
			System.out.println(prop.getProperty("DBServer"));
			System.out.println(prop.getProperty("DBName"));
			System.out.println(prop.getProperty("DBPass"));
			System.out.println(prop.getProperty("username"));
		}catch(IOException io) {
			//Mensaje creado por el programador para exponer la excepción
			System.out.println("Ojo, ponga cuidado: ocurrio un error al leer el archivo");
			io.printStackTrace();
		}finally {
			if(readFile !=null) {
				try {
					readFile.close();//Cierra el flujo de entrada
				}catch (IOException e) {
					e.printStackTrace();//Muestra cualquier error al cerrar el archivo
				}
			}
		}

	}

}
