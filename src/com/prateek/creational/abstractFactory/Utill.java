package com.prateek.creational.abstractFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utill {
	
	public  Location getProperty(String key){

		Properties properties=new Properties();
		InputStream input=null;
		
		try {
			input=this.getClass().getResourceAsStream("/com/prateek/creational/abstractFactory/prateek.properties");
					
			properties.load(input);
			
			System.out.println(properties.getProperty(key));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return Location.valueOf(properties.getProperty(key));
		
	}
	

}
