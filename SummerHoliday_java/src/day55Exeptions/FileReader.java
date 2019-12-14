package day55Exeptions;

import java.io.FileInputStream;
import java.util.Properties;

public class FileReader {
	
	
	public static void main(String[] args) {
		String path = "/home/serdar/Desktop/Data.properties";
		System.out.println(get("name", path));
		String path2 = "/home/serdar/Documents/GIT/eclipse-workspace/SummerHoliday_java/src/TaskData.properties";
		System.out.println(get("lastName",path2));
		System.out.println(get("name", "TaskData.properties"));// it is also possible if file is in the same folder with your project
		
	}
	public static String get(String key, String path) {
		Properties property = new Properties();
		
		try {
			FileInputStream file = new FileInputStream(path);
			property.load(file);
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("File Not Found");
		}
		return property.getProperty(key);
		
	}
}
