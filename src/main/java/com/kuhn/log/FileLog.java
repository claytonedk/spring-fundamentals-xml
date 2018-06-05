package com.kuhn.log;

public class FileLog implements Log {

	@Override
	public void log(String message) {
		System.out.println("File log: " + message);
	}

}
