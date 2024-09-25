package com.richis_l1.exception;

import java.io.FileNotFoundException;

public class ThereIsNoSuchFileInInputDirectoryException extends FileNotFoundException{
	
	public ThereIsNoSuchFileInInputDirectoryException(String message){
		super(message);
	}
}
