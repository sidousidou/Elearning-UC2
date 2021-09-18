package com.spring.boot.CRUD.app;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import ch.qos.logback.core.encoder.Encoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder pass = new BCryptPasswordEncoder();
		String rawPass = "bdh";
		String encodedPass = pass.encode(rawPass);
		
		System.out.println(encodedPass);
		
	}

}
