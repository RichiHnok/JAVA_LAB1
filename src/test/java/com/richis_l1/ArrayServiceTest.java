package com.richis_l1;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.richis_l1.entity.array.ArrayImpl;
import com.richis_l1.entity.array.MyArray;
import com.richis_l1.service.ArrayService;

public class ArrayServiceTest {
	
	@Test
	public void getMinValueTest(){
		MyArray array = new ArrayImpl();
		array.add(8);
		array.add(5);
		array.add(-1);
		Assert.assertEquals(ArrayService.getMinValue(array), -1);
	}

	@Test
	public void getMaxValueTest(){
		MyArray array = new ArrayImpl();
		array.add(8);
		array.add(5);
		array.add(-1);
		Assert.assertEquals(ArrayService.getMaxValue(array), 8);
	}

	@Test
	public void averageOfValuesTest(){
		MyArray array = new ArrayImpl();
		array.add(8);
		array.add(5);
		array.add(-1);
		Assert.assertEquals(ArrayService.averageOfValues(array), 4);
	}

	@Test
	public void sumOfValuesTest(){
		MyArray array = new ArrayImpl();
		array.add(8);
		array.add(5);
		array.add(-1);
		Assert.assertEquals(ArrayService.sumOfValues(array), 12);
	}

	@Test
	public void countPositiveValuesTest(){
		MyArray array = new ArrayImpl();
		array.add(8);
		array.add(5);
		array.add(-1);
		Assert.assertEquals(ArrayService.countNegativeValues(array), 1);
	}

	@Test
	public void countNegativeValuesTest(){
		MyArray array = new ArrayImpl();
		array.add(8);
		array.add(5);
		array.add(-1);
		Assert.assertEquals(ArrayService.countPositiveValues(array), 2);
	}
}
