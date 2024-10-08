package com.richis_l1.entity.array;

import java.util.stream.IntStream;

import com.richis_l1.exception.OutOfBoundException;

public abstract class MyArray {
	
	protected int[] array = null;
	protected int size = 0;

	public int get(int index) {
		if(index < 0 || index >= size)
			throw new OutOfBoundException("Выход за границы массива");
		return array[index];
	}

	public void set(int index, int value){
		array[index] = value;
	}

	public abstract void add(int value);

	public abstract int remove(int index);

	public abstract MyArray copyArray();

	public abstract int size();

	public abstract IntStream stream();
}
