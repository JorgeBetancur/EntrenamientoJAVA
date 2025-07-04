package Utilities;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritePropierties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		OutputStream writeFile = null;
		
		try {
			writeFile = new FileOutputStream("config.properties");
			prop.setProperty("DBServer", "Jorge666");
			prop.setProperty("DBName", "db_betancur");
			prop.setProperty("DBPass", "TestPassword");
			prop.setProperty("username", "root");
			
			prop.store(writeFile, null);
			System.out.println("Create properties Succesfully");
			
		}catch (IOException io) {
			io.printStackTrace();
			
		}finally {
			
			if(writeFile !=null) {
				try {
					writeFile.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
