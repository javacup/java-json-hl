package com.hl.json.domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hl.json.domain.HLSearchResult;

public class HLServiceTest {
	public static void main(String[] args) {
	try{	
		
		DefaultHttpClient httpClient = new DefaultHttpClient();
		StringBuffer sbUrl = new StringBuffer("http://192.168.6.76:8080/le-services/rest/query/getLocales");
		sbUrl = new StringBuffer("http://192.168.6.76:8080/le-services/rest/query/search");
		
		HttpPost postRequest = new HttpPost(sbUrl.toString());
		postRequest.addHeader("Content-Type", "application/json");
		postRequest.addHeader("Accept", "application/json");

		StringEntity input = new StringEntity("{\"@maxRecords\":20,\"searchText\":\"leg fracture\",\"searchSpecifications\":[\"ICD9CM_ALL\"],\"targetCodeSystems\":[\"ICD10CM\"]}");
		input.setContentType("application/json");
		postRequest.setEntity(input);

		HttpResponse response = httpClient.execute(postRequest);

		BufferedReader br = new BufferedReader(
                        new InputStreamReader((response.getEntity().getContent())));

		StringBuffer totalOutput = new StringBuffer();
		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
			totalOutput.append(output);
		}
		httpClient.getConnectionManager().shutdown();
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		HLSearchResult hlSearchResult =  mapper.readValue(totalOutput.toString(), HLSearchResult.class);
		System.out.println(hlSearchResult);

	  } catch (MalformedURLException e) {
		e.printStackTrace();
	  } catch (IOException e) {
		e.printStackTrace();
	  }		
	}
}
