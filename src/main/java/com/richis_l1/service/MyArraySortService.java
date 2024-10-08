package com.richis_l1.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.richis_l1.entity.array.MyArray;
import com.richis_l1.entity.array.MyArrayImpl;

public class MyArraySortService {

	private static final Logger logger = LogManager.getLogger(MyArraySortService.class);

	public static MyArray sortUsingStream(MyArray array, boolean ascendingOrder){
		if (ascendingOrder) {
			return new MyArrayImpl(array.stream().sorted().toArray());
		}else{
			return new MyArrayImpl(array.stream().boxed().sorted(Collections.reverseOrder()).mapToInt(value -> value.intValue()).toArray());
		}
	}
	
	public static MyArray bubbleSort(MyArray array, boolean ascendingOrder){
		MyArray sortedArray = array.copyArray();
		int temp;
		boolean swapped;
		if(ascendingOrder){
			for (int i = 0, n = sortedArray.size(); i < n - 1; i++) {
				swapped = false;
				for (int j = 0; j < n - i - 1; j++) {
						if (sortedArray.get(j) > sortedArray.get(j + 1)) {
							
							// Swap arr[j] and arr[j+1]
							temp = sortedArray.get(j);
							sortedArray.set(j, sortedArray.get(j + 1));
							sortedArray.set(j + 1, temp);
							swapped = true;
						}
				}
				// If no two elements were
				// swapped by inner loop, then break
				if (swapped == false)
						break;
			}
		}else{
			for (int i = 0, n = sortedArray.size(); i < n - 1; i++) {
				swapped = false;
				for (int j = 0; j < n - i - 1; j++) {
						if (sortedArray.get(n-1 - j) > sortedArray.get(n-1 - j - 1)) {
							
							// Swap arr[n-1 - j] and arr[n-1 - j - 1]
							temp = sortedArray.get(n-1 - j);
							sortedArray.set(n-1 - j, sortedArray.get(n-1 - j - 1));
							sortedArray.set(n-1 - j - 1, temp);
							swapped = true;
						}
				}
				// If no two elements were
				// swapped by inner loop, then break
				if (swapped == false)
						break;
			}
		}
		return sortedArray;
	}

	public static MyArray gnomeSort(MyArray array, boolean ascending){
		MyArray sortedArray = array.copyArray();
		
		if(ascending){
			int index = 0; 
			while (index < sortedArray.size()) { 
				if (index == 0) 
						index++; 
				if (sortedArray.get(index) >= sortedArray.get(index - 1)) 
						index++; 
				else { 
						int temp = 0; 
						temp = sortedArray.get(index); 
						sortedArray.set(index, sortedArray.get(index - 1)); 
						sortedArray.set(index - 1, temp); 
						index--; 
				} 
			} 
		}else{
			int index = sortedArray.size() - 1;
			while (index >= 0) { 
				if (index == sortedArray.size() - 1) 
						index--; 
				if (sortedArray.get(index) > sortedArray.get(index + 1)) 
						index--; 
				else { 
						int temp = 0; 
						temp = sortedArray.get(index); 
						sortedArray.set(index, sortedArray.get(index + 1)); 
						sortedArray.set(index + 1, temp); 
						index++; 
				} 
			} 
		}
		return sortedArray;
	}

	public static MyArray selectionSort(MyArray array, boolean ascending){
		MyArray sortedArray = array.copyArray();

		if(ascending){
			for (int i = 0, n = sortedArray.size(); i < n-1; i++)
			{
				// Find the minimum element in unsorted array
				int min_idx = i;
				for (int j = i + 1; j < n; j++)
						if (sortedArray.get(j) < sortedArray.get(min_idx))
							min_idx = j;
	
				// Swap the found minimum element with the first
				// element
				int temp = sortedArray.get(min_idx);
				sortedArray.set(min_idx, sortedArray.get(i));
				sortedArray.set(i, temp);
			}
		}else{
			for (int i = 0, n = sortedArray.size(); i < n-1; i++)
			{
				// Find the minimum element in unsorted array
				int min_idx = i;
				for (int j = i + 1; j < n; j++)
					if (sortedArray.get(j) > sortedArray.get(min_idx))
						min_idx = j;
	
				// Swap the found minimum element with the first
				// element
				int temp = sortedArray.get(min_idx);
				sortedArray.set(min_idx, sortedArray.get(i));
				sortedArray.set(i, temp);
			}
		}

		return sortedArray;
	}
}
