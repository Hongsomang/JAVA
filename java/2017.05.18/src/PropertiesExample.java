import java.io.*;
import java.util.*;



public class PropertiesExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Properties properties=new Properties();
		String path=PropertiesExample.class.getResource("database.properties").getPath();
		properties.load(new FileReader(path));
		String driver=properties.getProperty("driver");
		String url=properties.getProperty("url");
		String username=properties.getProperty("username");
		String password=properties.getProperty("password");
		System.out.println("driver:"+driver);
		System.out.println("url:"+url);
		System.out.println("username:"+username);
		System.out.println("password:"+password);
	}

}
