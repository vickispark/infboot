package com.inf.irs.exception;

@SuppressWarnings("serial")
public class UserIdAlreadyPresentException extends Exception {
	public UserIdAlreadyPresentException(String message){
		super(message);
	}
}