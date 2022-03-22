package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	public ConfigDataProvider() throws Exception {
	   String path="C:\\Users\\Dell\\eclipse-workspace\\DSS_BatchDEC\\Config\\config.Properties";
       FileInputStream fis=new FileInputStream(path);
       pro=new Properties();
       pro.load(fis);
	}
	
	public String getBaseUrl_stage() {
		return pro.getProperty("BaseUrl_stage");
	}
}
