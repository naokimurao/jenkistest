package org.naoki;

import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.HierarchicalConfiguration;
import org.apache.commons.configuration.XMLConfiguration;



public class ReadXML {

	public void loadDate() {
		List<HierarchicalConfiguration> hierarchicalConfigurations = this.getHierarchicalConfiguration("ctidriver.xml", "site");
		for(HierarchicalConfiguration siteConfig : hierarchicalConfigurations) {
			
			System.out.println(siteConfig.getString("name"));
			System.out.println(siteConfig.getString("jtapiaddress"));
			System.out.println(siteConfig.getString("jtapiuser"));
			System.out.println(siteConfig.getString("jtapipassword"));
		}
	}
	
	public List<HierarchicalConfiguration> getHierarchicalConfiguration(String fileName, String rootName) {
		List<HierarchicalConfiguration> hierarchicalConfigurations = null;
		try {
			XMLConfiguration config = new XMLConfiguration(fileName);
			
			hierarchicalConfigurations = config.configurationsAt(rootName);
			
		} catch (ConfigurationException e) {
			System.out.println(e.toString());
		}	
		return hierarchicalConfigurations;
	}
	
	public boolean validateInput(int input) {
		boolean result = true;
		if(input < 0) {
			result = false;
		}
		
		return result;
	}
}
