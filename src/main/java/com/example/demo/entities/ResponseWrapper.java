package com.example.demo.entities;

import java.util.List;

import org.springframework.http.HttpStatus;

public class ResponseWrapper {
	  public headerWrapper header;
	  public bodyWrapper body;
	  public ResponseWrapper() {
	        this.header = new headerWrapper();
	        this.body = new bodyWrapper();
	    }

	  public class headerWrapper {
		  public String from;
		  public String to;
		public String getFrom() {
			return from;
		}
		public void setFrom(String from) {
			this.from = from;
		}
		public String getTo() {
			return to;
		}
		public void setTo(String to) {
			this.to = to;
		}
		  
	  }
	  
	  public class bodyWrapper {
		  public int statusCode ;
		  public HttpStatus status ;
		  public String message ;
		  public List<?> data;
		public int getStatusCode() {
			return statusCode;
		}
		public void setStatusCode(int statusCode) {
			this.statusCode = statusCode;
		}
		public HttpStatus getStatus() {
			return status;
		}
		public void setStatus(HttpStatus status) {
			this.status = status;
		}
		public List<?> getData() {
			return data;
		}
		public void setData(List<?> data) {
			this.data = data;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
	  }
}
