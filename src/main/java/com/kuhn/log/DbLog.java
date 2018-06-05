package com.kuhn.log;

public class DbLog implements Log {

	@Override
	public void log(String message) {
		System.out.println("Database log: " + message);
	}

}
