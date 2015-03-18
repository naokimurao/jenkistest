package org.naoki;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;


public class ReadCSV {
	
	private List<UserDetail> userDetailList;
	
	public ReadCSV() {}
	
	public void loadDate() {
		try {
			String filePath = new File("").getAbsolutePath();
			System.out.println(filePath);
			File csvFile = new File(filePath + "//UserInfoTable.csv");
			//System.out.println(csvFile.exists());
			InputStream in = new FileInputStream(filePath + "//UserInfoTable.csv");
		
			CSVReader reader;
			reader = new CSVReader(new InputStreamReader(in));
			
			ColumnPositionMappingStrategy<UserDetail> mappingStrategy = new ColumnPositionMappingStrategy<UserDetail>();
			mappingStrategy.setType(UserDetail.class);
			
			String[] columns = new String[] {"userId","sid","ctim","extension_Partition", "deviceId"};
	        mappingStrategy.setColumnMapping(columns);

			CsvToBean<UserDetail> csv = new CsvToBean<UserDetail>();
	        userDetailList = csv.parse(mappingStrategy, reader);
	        
	        for (int i = 0; i < userDetailList.size(); i++)  {
	        	UserDetail userDetail = userDetailList.get(i);
	        	//LOG.info(userDetail.toString());
	        	System.out.println(userDetail.toString());
	        }
	        
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	

}
