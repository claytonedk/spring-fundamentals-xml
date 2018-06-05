package com.kuhn.log;

public class CloudLog implements Log {

	@Override
	public void log(String message) {
		System.out.println("Cloud log: " + message);
	}

}
