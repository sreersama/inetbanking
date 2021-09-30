package com.qa.iNetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File file= new File("./configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			pro= new Properties();
			pro.load(fis);
		}
		catch (Exception e)
		{
			System.out.println("Exception is "+ e.getMessage());
		}
		
	}
	
	public String getApplicationURL()
	{
		String url= pro.getProperty("baseurl");
		return url;
	}
	
	public String getUserName()
	{
		String uName= pro.getProperty("uName");
		return uName;		
	}
	
	public String getPassword()
	{
		String password=pro.getProperty("Password");
		return password;
	}
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getIEPath()
	{
		String iepath=pro.getProperty("IEpath");
		return iepath;
	}
	public String getgeckoPath()
	{
		String gecopath=pro.getProperty("geckopath");
		return gecopath;
	}

}
