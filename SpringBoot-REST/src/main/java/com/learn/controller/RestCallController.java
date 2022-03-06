package com.learn.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/v1/api")
public class RestCallController {

	@Autowired
	@Qualifier("restTemplate")
	private RestTemplate restTemplate;

	private static final String URL = "https://jsonplaceholder.typicode.com/comments+";

	@GetMapping(value = "/getComments")
	public ResponseEntity<Object> getComments(@RequestParam Map<String, String> req) {
		System.out.println(req);
		List<Map<String, String>> response = restTemplate.getForObject(URL, ArrayList.class);
		return ResponseEntity.ok(response);
	}

	@GetMapping(value = "/getComments/{id}")
	public ResponseEntity<HashMap> getCommentsByID(@PathVariable(name = "id", required = true) String commentId) {
		ResponseEntity<HashMap> resp = restTemplate.getForEntity(URL + "/" + commentId, HashMap.class);
		System.out.println(resp.getStatusCode());
		return resp;
	}
	
}
