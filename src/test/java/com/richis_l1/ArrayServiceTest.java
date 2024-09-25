package com.richis_l1;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.richis_l1.entity.array.MyArrayImpl;
import com.richis_l1.entity.array.MyArray;
import com.richis_l1.service.MyArrayServices;

public class ArrayServiceTest {
	
	@Test
	public void getMinValueTest(){
		MyArray array = new MyArrayImpl();
		array.add(8);
		array.add(5);
		array.add(-1);
		Assert.assertEquals(MyArrayServices.getMinValue(array), -1);
	}

	@Test
	public void getMaxValueTest(){
		MyArray array = new MyArrayImpl();
		array.add(8);
		array.add(5);
		array.add(-1);
		Assert.assertEquals(MyArrayServices.getMaxValue(array), 8);
	}

	@Test
	public void averageOfValuesTest(){
		MyArray array = new MyArrayImpl();
		array.add(8);
		array.add(5);
		array.add(-1);
		Assert.assertEquals(MyArrayServices.averageOfValues(array), 4);
	}

	@Test
	public void sumOfValuesTest(){
		MyArray array = new MyArrayImpl();
		array.add(8);
		array.add(5);
		array.add(-1);
		Assert.assertEquals(MyArrayServices.sumOfValues(array), 12);
	}

	@Test
	public void countPositiveValuesTest(){
		MyArray array = new MyArrayImpl();
		array.add(8);
		array.add(5);
		array.add(-1);
		Assert.assertEquals(MyArrayServices.countNegativeValues(array), 1);
	}

	@Test
	public void countNegativeValuesTest(){
		MyArray array = new MyArrayImpl();
		array.add(8);
		array.add(5);
		array.add(-1);
		Assert.assertEquals(MyArrayServices.countPositiveValues(array), 2);
	}
}
