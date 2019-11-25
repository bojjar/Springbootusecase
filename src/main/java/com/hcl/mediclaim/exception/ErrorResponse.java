package com.hcl.mediclaim.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

	public ErrorResponse(String message2, String errorResponseFail) {
		// TODO Auto-generated constructor stub
	}
	private String message;
	private String status;
}
