package com.hn.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hn.client.RestClient;
import com.hn.restapi.TestBase;

public class GetAPITest extends TestBase{
	TestBase testBase;
	String Url;
	String serviceUrl;
	String apiUrl;
	RestClient restClient;
	
	@BeforeMethod
	public void setUp() {
		
		testBase = new TestBase();
		
		 Url = prop.getProperty("url");
		 serviceUrl = prop.getProperty("serviceUrl");
		
		 apiUrl = Url + serviceUrl;
		
		//RestClient restClient = new RestClient();
		//restClient.get(apiUrl);
		
	}

	@Test
	public void GetAPITest(){
		 restClient = new RestClient();
		restClient.get(apiUrl);
	}
}
