package com.richis_l1.other;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.richis_l1.entity.array.MyArray;

public class ArrayFromFileCreator {
	
	private final Path INPUT_FILES_LOCATION = Paths.get("src\\main\\resources\\inputFiles");
	private final Path INPUT_FILE_PATH;

	public ArrayFromFileCreator(String fileName){
		INPUT_FILE_PATH = Paths.get(INPUT_FILES_LOCATION.toString(), fileName);
	}

	public MyArray nextArray(){
		return null;
	}

}
