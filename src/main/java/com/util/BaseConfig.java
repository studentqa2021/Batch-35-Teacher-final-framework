package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseConfig {
	
	//getConfig return ""
	public static String getConfig(String testData) throws Exception{
		// path of dev.propeties
		String path ="./Environments/dev.properties";
		//convert file into steam
		FileInputStream fis = new FileInputStream(path);
		//read the file
		Properties pro= new Properties();
		pro.load(fis);
		String value =pro.get(testData).toString();	
	return value;	
	}
	
	public static void main(String[] args) throws Exception {
		
		System.out.println(BaseConfig.getConfig("URL"));

		System.out.println(BaseConfig.getConfig("USER"));

		System.out.println(BaseConfig.getConfig("PASSWORD"));
	}
	
}
