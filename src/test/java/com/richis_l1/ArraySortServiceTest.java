package com.richis_l1;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.richis_l1.entity.array.ArrayImpl;
import com.richis_l1.entity.array.MyArray;
import com.richis_l1.service.ArraySortService;

public class ArraySortServiceTest {

	MyArray unsortedArray;
	MyArray acsSortedArray;
	MyArray descSortedArray;
	
	@BeforeTest
	public void initTest(){
		unsortedArray = new ArrayImpl();
		unsortedArray.add(3);
		unsortedArray.add(1);
		unsortedArray.add(6);
		unsortedArray.add(2);
		unsortedArray.add(-1);
		
		acsSortedArray = new ArrayImpl();
		acsSortedArray.add(-1);
		acsSortedArray.add(1);
		acsSortedArray.add(2);
		acsSortedArray.add(3);
		acsSortedArray.add(6);

		descSortedArray = new ArrayImpl();
		descSortedArray.add(6);
		descSortedArray.add(3);
		descSortedArray.add(2);
		descSortedArray.add(1);
		descSortedArray.add(-1);
	}

	@Test
	public void ascendingBubbleSortTest(){
		Assert.assertEquals(ArraySortService.bubbleSort(unsortedArray, true), acsSortedArray);
	}
	
	@Test
	public void SelectiondingBubbleSortTest(){
		Assert.assertEquals(ArraySortService.bubbleSort(unsortedArray, false), descSortedArray);
	}

	@Test
	public void ascendingGnomeSortTest(){
		Assert.assertEquals(ArraySortService.gnomeSort(unsortedArray, true), acsSortedArray);
	}
	
	@Test
	public void descendingGnomeSortTest(){
		Assert.assertEquals(ArraySortService.gnomeSort(unsortedArray, false), descSortedArray);
	}

	@Test
	public void ascendingSelectionSortTest(){
		Assert.assertEquals(ArraySortService.selectionSort(unsortedArray, true), acsSortedArray);
	}
	
	@Test
	public void descendingSelectionSortTest(){
		Assert.assertEquals(ArraySortService.selectionSort(unsortedArray, false), descSortedArray);
	}
}
