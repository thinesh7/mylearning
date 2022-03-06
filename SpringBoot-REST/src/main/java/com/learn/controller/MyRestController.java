package com.learn.controller;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.inject.Provider;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.bean.EmployeeDTO;
import com.learn.bean.MyTestBean;
import com.learn.service.AccountService;

@RestController
@RequestMapping(value = "/v1/api")
public class MyRestController {

	@Autowired()
	@Qualifier("SingleBean")
	private MyTestBean singleton1;

	@Autowired
	@Qualifier("SingleBean")
	private MyTestBean singleton2;

	@Autowired
	@Qualifier("prototypeBean")
	private MyTestBean prototype1;

	@Autowired
	@Qualifier("prototypeBean")
	private MyTestBean prototype2;

	@Autowired
	@Qualifier("requestBean")
	private Provider<MyTestBean> request1; // Request initially it cannot be instantiated as by this we use Provider

	@Autowired
	@Qualifier("requestBean")
	private Provider<MyTestBean> request2;

	@Autowired
	@Qualifier("sessionBean")
	private Provider<MyTestBean> session1;

	@Autowired
	@Qualifier("sessionBean")
	private Provider<MyTestBean> session2;

	@Autowired
	private AccountService accServ;

	@GetMapping("ll")
	public String call() {
		accServ.callMe();
		return "";
	}

	@GetMapping(value = "/getAllList1")
	public ResponseEntity<Map<String, Object>> getAllList() {
		Map<String, Object> mapList = new LinkedHashMap<>();
		mapList.put("0", "Hello..!");
		mapList.put("1", "Hello..!");
		mapList.put("2", "Hello..!");
		mapList.put("3", "Hello..!");
		mapList.put("1", "Duplicate - Hello..!");
		mapList.put("2", "Duplicate - Hello..!");
		return ResponseEntity.ok(mapList);
	}

	@GetMapping(value = "/getAllList2")
	public ResponseEntity<Map<String, Object>> getAllList2() throws Exception {
		throw new IllegalAccessException("Exception Testing");
	}

	@GetMapping(value = "/getAllList3")
	public Map<String, Object> getAllList3() {
		Map<String, Object> mapList = new TreeMap<>();
		mapList.put("A", "Hello..!");
		mapList.put("B", "Hello..!");
		mapList.put("C", "Hello..!");
		mapList.put("D", "Hello..!");
		mapList.put("E", "Hello..!");
		mapList.put("E", "Duplicate - Hello..!");
		mapList.put("A", "Duplicate - Hello..!");
		return mapList;
	}

	@GetMapping(value = "/getSingleton")
	public ResponseEntity<String> getSingleton() {
		return new ResponseEntity<>(singleton1.getTest() + " " + singleton2.getTest(), HttpStatus.OK);
	}

	@GetMapping(value = "/getprototype")
	public ResponseEntity<String> getPrototype() {
		return new ResponseEntity<>(prototype1.getTest() + " " + prototype2.getTest(), HttpStatus.OK);
	}

	@GetMapping(value = "/getRequest")
	public ResponseEntity<String> getRequest() {
		return new ResponseEntity<>(request1.get().getTest() + " " + request2.get().getTest(), HttpStatus.OK);
	}

	@GetMapping(value = "/getSession")
	public ResponseEntity<String> getSession() {
		return new ResponseEntity<>(session1.get().getTest() + " " + session2.get().getTest(), HttpStatus.OK);
	}

	@PostMapping(value = "/saveEmp")
	public ResponseEntity<EmployeeDTO> saveEmployee(@Valid @RequestBody EmployeeDTO emp) {
		return ResponseEntity.status(HttpStatus.OK).body(emp);
	}

}
