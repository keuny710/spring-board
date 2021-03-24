package com.spring.board2.logging;

import java.lang.annotation.Annotation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Logging implements Slf4j {
	
	public Logging() {
	}
	
	
	public void info(String consoleOut) {
		System.out.println(consoleOut);
	}

	
	
	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String topic() {
		// TODO Auto-generated method stub
		return null;
	}

}
