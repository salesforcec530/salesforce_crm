package com.example.demo.entity;

public class ResponseTransfer {
	private String from;
	private String text;

	public String getText() {
		return text;
	}

	public ResponseTransfer(String from, String text) {
		super();
		this.from = from;
		this.text = text;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ResponseTransfer(String text) {
		super();
		this.text = text;
	}

	public ResponseTransfer() {
		super();
	} 

}
