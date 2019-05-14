package com.packt.cookbook;
import java.io.IOException;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Properties configFile = new Properties();
		try {
			configFile.load(App.class.getClassLoader().getResourceAsStream("app.properties"));
			String name = configFile.getProperty("display.name");
			System.out.println(name);
		} catch (IOException e) {
 
			e.printStackTrace();
		}
        
    }
}
