package com.shivaraj.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearch)
	{
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println("sortAlgorithm :"+sortAlgorithm);
		return 3;
	}
	
}
