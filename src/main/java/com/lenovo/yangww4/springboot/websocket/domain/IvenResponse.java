package com.lenovo.yangww4.springboot.websocket.domain;

public class IvenResponse {
	private String responseMessage;

	public IvenResponse(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getResponseMessage() {
		return responseMessage;
	}
}
