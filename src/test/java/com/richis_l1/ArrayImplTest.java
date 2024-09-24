package com.richis_l1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.richis_l1.entity.array.MyArray;
import com.richis_l1.entity.array.ArrayImpl;
import com.richis_l1.exception.OutOfBoundException;

public class ArrayImplTest {
	
	@Test(priority = 1, enabled = true)
	public void getTest(){
		MyArray array = new ArrayImpl(3);
		array.set(0, 2);
		array.set(1, 4);
		array.set(2, 8);
		
		Assert.assertEquals(array.get(0), 2);
		Assert.assertEquals(array.get(1), 4);
		Assert.assertEquals(array.get(2), 8);
	}

	@Test(expectedExceptions = OutOfBoundException.class)
	public void getOutOfBoundExceptionTest(){
		MyArray array = new ArrayImpl(3);
		array.get(3);
	}

	@Test
	public void addElementTest(){
		MyArray array = new ArrayImpl();
		array.add(10);

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(array.size(), 1);
		softAssert.assertEquals(array.get(0), 10);
		softAssert.assertAll();
	}

	@Test
	public void sizeTest(){
		MyArray array = new ArrayImpl(3);
		Assert.assertEquals(array.size(), 3);
	}

	@Test
	public void copyArrayTest(){
		MyArray array = new ArrayImpl();
		array.add(1);
		array.add(2);
		array.add(3);
		MyArray copiedArray = array.copyArray();
		Assert.assertEquals(array, copiedArray);
	}
}
