package com.richis_l1.service;

import com.richis_l1.entity.array.MyArray;

public class ArrayService {
	
	public static int getMinValue(MyArray array){
		int min = 0;
		for(int i = 0, n = array.size(); i < n; i++){
			if(array.get(i) < min) min = array.get(i);
		}
		return min;
	}

	public static int getMaxValue(MyArray array){
		int max = 0;
		for(int i = 0, n = array.size(); i < n; i++){
			if(array.get(i) > max) max = array.get(i);
		}
		return max;
	}

	public static double averageOfValues(MyArray array){
		return sumOfValues(array)/array.size();
	}

	public static int sumOfValues(MyArray array){
		int summOfAll = 0;
		for(int i = 0, n = array.size(); i < n; i++){
			summOfAll += array.get(i);
		}
		return summOfAll;
	}

	public static int countPositiveValues(MyArray array){
		int positiveCounter = 0;
		for(int i = 0, n = array.size(); i < n; i++){
			if(array.get(i) > 0) positiveCounter++;
		}
		return positiveCounter;
	}

	public static int countNegativeValues(MyArray array){
		int negativeCounter = 0;
		for(int i = 0, n = array.size(); i < n; i++){
			if(array.get(i) < 0) negativeCounter++;
		}
		return negativeCounter;	}
}
