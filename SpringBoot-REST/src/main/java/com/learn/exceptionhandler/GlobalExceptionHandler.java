package com.learn.exceptionhandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestClientResponseException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(IllegalAccessException.class)
	public ResponseEntity<Map<String, Object>> exceptionHandler(IllegalAccessException exp) {

		Map<String, Object> mapList = new HashMap<>();
		mapList.put("0", "Hello..!");
		mapList.put("1", "Hello..!");
		mapList.put("2", "Hello..!");
		mapList.put("3", "Hello..!");
		mapList.put("1", "Duplicate - Hello..!");
		mapList.put("4", exp.getMessage());

		// return new ResponseEntity<Map<String, Object>>(mapList, null,
		// HttpStatus.BAD_GATEWAY);

		return ResponseEntity.internalServerError().header("Test", exp.getMessage()).body(mapList);
	}

	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {

		Map<String, String> errors = new HashMap<>();

		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});

		return errors;
	}

	@ExceptionHandler(RestClientResponseException.class)
	public ResponseEntity<Map<String, String>> restClientException(RestClientResponseException exp) {
		Map<String, String> error = new HashMap<String, String>();
		error.put("error", exp.getResponseBodyAsString());
		error.put("errorMsg", exp.getMessage());
		error.put("status", exp.getStatusText());
		error.put("status code", String.valueOf(exp.getRawStatusCode()));
		return ResponseEntity.status(exp.getRawStatusCode()).body(error);
	}

	/*
	 * new ResponseEntity<>(singleton1.getTest() + " " + singleton2.getTest(), HttpStatus.OK);
	 * ResponseEntity.status(HttpStatus.OK).body(emp);
	 * ResponseEntity.ok().body(null);
	 * ResponseEntity.ok(response);
	 * @ResponseStatus(value = HttpStatus.BAD_REQUEST);
	 * ResponseEntity.internalServerError().header("Test", exp.getMessage()).body(mapList); ResponseEntity.ok(mapList);
	 */

}
