package com.jspiders.shoppingcart.helper;

import lombok.Data;

@Data
public class Password {
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
