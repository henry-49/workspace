package com.hn.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	// 1. GET method
	public void get(String url) {
		// createDefault creates one Client connection
		// createDefault returns CloseableHttpClient object
		CloseableHttpClient httpClient = HttpClients.createDefault();
		try {
		HttpGet httpget = new HttpGet(url); // http get request
		
		CloseableHttpResponse closseableHttpRes=  httpClient.execute(httpget); // hit the get URL
		
		// Getting Status Code
		int statusCode = closseableHttpRes.getStatusLine().getStatusCode();
		
		System.out.println("Status Code--> "+ statusCode);
		
		// Getting JSON String
		String responseString = EntityUtils.toString(closseableHttpRes.getEntity(), "UTF-8");
		
		// Getting JSON Objects
		JSONObject jsonObject = new JSONObject(responseString);
		
		System.out.println("Response JSON from API-->"+ jsonObject);
		
		// Getting allHeaders
		Header[] headersArray = closseableHttpRes.getAllHeaders();
		
		HashMap<String, String> allheaders = new HashMap<String, String>();
		
		for(Header header : headersArray) {
			allheaders.put(header.getName(), header.getValue());
		}
		
		
		System.out.println("Headers Array--> "+ allheaders);
		
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
