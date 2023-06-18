package com.practice;

import java.io.Serializable;

public class MyClass implements Serializable{
	private String message;
	private int number;
	
	public MyClass(String message, int number) {
		this.message = message;
		this.number = number;
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getNumber() {
		return number;
	}

}
