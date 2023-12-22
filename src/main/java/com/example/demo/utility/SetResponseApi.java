package com.example.demo.utility;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.entities.ResponseWrapper;

import jakarta.persistence.Entity;

public class SetResponseApi {

	public static ResponseEntity<ResponseWrapper> setResponse(String from, String to, List<?> data,String message, HttpStatus status, int statusCode) {
		ResponseWrapper responseWrapper = new ResponseWrapper();
	    responseWrapper.header.from = from;
	    responseWrapper.header.to = to;
	    responseWrapper.body.status = status;
	    responseWrapper.body.message = message;
	    responseWrapper.body.data = data;
	    responseWrapper.body.statusCode = statusCode;
	    return new ResponseEntity<>(responseWrapper, status);
	}
}
