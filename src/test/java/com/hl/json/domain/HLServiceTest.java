package com.hl.json.domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.List;

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
		sbUrl = new StringBuffer("http://hl-server:8080/le-services/rest/query/search");
		
		HttpPost postRequest = new HttpPost(sbUrl.toString());
		postRequest.addHeader("Content-Type", "application/json");
		postRequest.addHeader("Accept", "application/json");

		StringBuffer searchCriteria = new StringBuffer("{");
		searchCriteria.append("\"@locale\": \"en_US\"");
		searchCriteria.append(",");
		searchCriteria.append("\"@maxRecords\":10");
		searchCriteria.append(",");
		searchCriteria.append("\"@requestId\": \"GB\"");
		searchCriteria.append(",");
		searchCriteria.append("\"options\":[");
		searchCriteria.append("{ \"@name\": \"USE_CASE\", \"@value\": \"pft\" },");
		searchCriteria.append("{ \"@name\": \"PL_DX_ICD9\", \"@value\": \"true\" },");
		searchCriteria.append("{ \"@name\": \"PL_DX_ICD10\", \"@value\": \"true\" },");
		searchCriteria.append("{ \"@name\": \"PREFERRED_ICD10\", \"@value\": \"true\" },");
		searchCriteria.append("{ \"@name\": \"CODE_MATCH_TERM_APPENDER\", \"@value\": \"true\" },");
		searchCriteria.append("{ \"@name\": \"UNIQUE_CODES_ACROSS_MATCHES_FILTER\", \"@value\": \"SNOMED,ICD10CM,ICD9CM\" },");
		searchCriteria.append("{ \"@name\": \"SYNONYM_REPLACER\", \"@value\": \"true\" },");
		searchCriteria.append("{ \"@name\": \"PREFERRED_TERM_APPENDER\", \"@value\": \"true\" },");
		searchCriteria.append("{ \"@name\": \"TARGET_CODE_SYSTEM_FILTER\", \"@value\": \"ICD9CM\" }");
		searchCriteria.append("]");
		searchCriteria.append(",");
		searchCriteria.append("\"searchText\": \"chf\",");
		searchCriteria.append("\"searchSpecifications\": [\"SNOMED_CLINICAL_FINDING_PFT\",   \"ICD10CM_ALL_PFT\", \"ICD9CM_ALL_PFT\"],");
		searchCriteria.append("\"targetCodeSystems\": [\"SNOMED\", \"ICD9CM\", \"ICD10CM\"]");
		searchCriteria.append("}");
		System.out.println(searchCriteria.toString());
		StringEntity input = new StringEntity(searchCriteria.toString());
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
		List<Match> matches = hlSearchResult.getMatches();
		int matchCount=1;
		for (Match match : matches) {
			System.out.println("********** match " + matchCount++ +"****************");
			List<Attribute> attributes = match.getAttributes();
			for (Attribute attribute : attributes) {
				System.out.println(attribute);
			}
			List<CodeSystemResults> codeSystemResults = match.getCodeSystemResults();
			for (CodeSystemResults codeSystemResults2 : codeSystemResults) {
				List<Attribute> codeSystemResultAttributes = codeSystemResults2.getAttributes();
				System.out.println("*********** codeSystemResultAttributes *************");
				for (Attribute attribute : codeSystemResultAttributes) {
					System.out.println(attribute);
				}
				codeSystemResults2.getAttributes();
//				System.out.println(codeSystemResults2);
				List<Concepts> concepts = codeSystemResults2.getConcepts();
				System.out.println("*********** concept *************");
				System.out.println(concepts);
			}
		}
	  } catch (MalformedURLException e) {
		e.printStackTrace();
	  } catch (IOException e) {
		e.printStackTrace();
	  }		
	}
}
