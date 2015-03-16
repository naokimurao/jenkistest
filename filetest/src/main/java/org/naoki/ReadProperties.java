package org.naoki;


import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	public ReadProperties() {}
	
	public void readSystemProperties() {
		System.out.println("-------------------SYSTEM PROPERTY--------------------------");
		System.out.println("[java.version] " + System.getProperty("java.version"));
		System.out.println("[java.home] " + System.getProperty("java.home"));
		System.out.println("[java.vm.path] " + System.getProperty("java.vm.version"));
		System.out.println("[java.compiler] " + System.getProperty("java.compiler"));
		System.out.println("[java.class.version] " + System.getProperty("java.class.version"));
		System.out.println("[java.class.path] " + System.getProperty("java.class.path"));
		System.out.println("[user.home] " + System.getProperty("user.home"));
		System.out.println("[user.dir] " + System.getProperty("user.dir"));
	}
	
	public void readApplicationProperties() {
		System.out.println("-------------------APPLICATION PROPERTY--------------------------");
		try {            
		    Properties prop = new Properties();
		    
		    //READ file from current directory
		    //pro.load(new FileInputStream("config.properties"));
		    
		    //READ FILE as resource which is bundled in jar file.
		    prop.load(ReadProperties.class.getResourceAsStream("/config.properties"));
		    String name = prop.getProperty("name");
		    String version = prop.getProperty("version");
		    System.out.println("[name] " + name);
		    System.out.println("[version] " + version);
		    
		} catch (IOException ex) {
			System.out.println(ex.toString());
		}
	}

}
