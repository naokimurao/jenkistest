package org.naoki;

public class App {
	
	public void start() {
		ReadCSV readCSV = new ReadCSV();
		readCSV.loadDate();
		
		ReadXML readXML = new ReadXML();
		readXML.loadDate();
		
		ReadProperties readProperties = new ReadProperties();
		readProperties.readSystemProperties();
		readProperties.readApplicationProperties();
	}

	public static void main(String[] args) {
		App app = new App();
		app.start();

	}

}
