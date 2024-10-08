package com.richis_l1;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.richis_l1.entity.array.MyArrayImpl;
import com.richis_l1.entity.array.MyArray;
import com.richis_l1.service.MyArrayServices;

public class ArrayServiceTest {

	MyArray array;

	@BeforeTest
	public void initArrays(){
		MyArray array = new MyArrayImpl();
		array.add(8);
		array.add(5);
		array.add(-1);
		this.array = array;
	}
	
	@Test
	public void getMinValueTest(){
		Assert.assertEquals(MyArrayServices.getMinValue(array), -1);
	}

	@Test
	public void getMaxValueTest(){
		Assert.assertEquals(MyArrayServices.getMaxValue(array), 8);
	}

	@Test
	public void averageOfValuesTest(){
		Assert.assertEquals(MyArrayServices.averageOfValues(array), 4);
	}

	@Test
	public void sumOfValuesTest(){
		Assert.assertEquals(MyArrayServices.sumOfValues(array), 12);
	}

	@Test
	public void countPositiveValuesTest(){
		Assert.assertEquals(MyArrayServices.countPositiveValues(array), 2);
	}

	@Test
	public void countNegativeValuesTest(){
		Assert.assertEquals(MyArrayServices.countNegativeValues(array), 1);
	}

	@Test
	public void replaceElementByConditionTest(){

		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(MyArrayServices.replaceElementByCondition(array, ">", 7), new MyArrayImpl(new int[]{8}));
		softAssert.assertEquals(MyArrayServices.replaceElementByCondition(array, "<", 8), new MyArrayImpl(new int[]{5, -1}));
		softAssert.assertEquals(MyArrayServices.replaceElementByCondition(array, "==", 8), new MyArrayImpl(new int[]{8}));
		softAssert.assertEquals(MyArrayServices.replaceElementByCondition(array, "!=", 8), new MyArrayImpl(new int[]{5, -1}));
		softAssert.assertEquals(MyArrayServices.replaceElementByCondition(array, ">=", 8), new MyArrayImpl(new int[]{8}));
		softAssert.assertEquals(MyArrayServices.replaceElementByCondition(array, "<=", 8), new MyArrayImpl(new int[]{8, 5, -1}));
		softAssert.assertAll();
	}
}
