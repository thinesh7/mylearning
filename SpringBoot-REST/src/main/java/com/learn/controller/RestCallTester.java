package com.learn.controller;

import java.util.Base64;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestCallTester {

	private HttpHeaders createHttpHeaders(String user, String password) {
		String notEncoded = user + ":" + password;
		String encodedAuth = Base64.getEncoder().encodeToString(notEncoded.getBytes());
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", "Basic " + encodedAuth);
		return headers;
	}

	private void doYourThing() {
		String theUrl = "http://blah.blah.com:8080/rest/api/blah";
		RestTemplate restTemplate = new RestTemplate();
		try {
			HttpHeaders headers = createHttpHeaders("fred", "1234");
			HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
			ResponseEntity<String> response = restTemplate.exchange(theUrl, HttpMethod.GET, entity, String.class);
			System.out.println("Result - status (" + response.getStatusCode() + ") has body: " + response.hasBody());
		} catch (Exception eek) {
			System.out.println("** Exception: " + eek.getMessage());
		}
	}
}
