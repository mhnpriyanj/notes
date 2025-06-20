package com.athena.insurance.exception;

import lombok.Data;

@Data
public class Error {
	private int errorCode;
	private String errorMessage;

}
