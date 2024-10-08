package com.richis_l1.service;

import com.richis_l1.entity.array.MyArray;
import com.richis_l1.entity.array.MyArrayImpl;

public class MyArrayStreamServices {
	
	public static int getMinValue(MyArray array){
		return array.stream().min().getAsInt();
	}

	public static int getMaxValue(MyArray array){
		return array.stream().max().getAsInt();
	}

	public static double averageOfValues(MyArray array){
		return sumOfValues(array)/array.size();
	}

	public static int sumOfValues(MyArray array){
		return array.stream().sum();
	}

	public static int countPositiveValues(MyArray array){
		return (int) array.stream().filter(val -> val > 0).count();
	}

	public static int countNegativeValues(MyArray array){
		return (int) array.stream().filter(val -> val < 0).count();
	}

	public static MyArray replaceElementByCondition(MyArray array, String condition, int value){
		MyArray newArray = new MyArrayImpl();
		switch (condition) {
			case ">":		
				newArray = new MyArrayImpl(array.stream().filter(v -> v > value).toArray());			
				break;
			case "<":
				newArray = new MyArrayImpl(array.stream().filter(v -> v < value).toArray());
				break;
			case "==":
				newArray = new MyArrayImpl(array.stream().filter(v -> v == value).toArray());
				break;
			case ">=":
				newArray = new MyArrayImpl(array.stream().filter(v -> v >= value).toArray());
				break;
			case "<=":
				newArray = new MyArrayImpl(array.stream().filter(v -> v <= value).toArray());
				break;			
			case "!=":
				newArray = new MyArrayImpl(array.stream().filter(v -> v != value).toArray());
				break;			
			default:
				break;
		}
		
		return newArray;
	}
}
