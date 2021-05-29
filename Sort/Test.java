package Sort;

import java.util.Arrays;

import subject.*;

public class Test {
	public static void main(String args[]) {

		IntegerGenerator.setSeed(10);
		Integer[] intRanArr = IntegerGenerator.random(10000, 1000);
		long timeB = System.currentTimeMillis();
		InsertionSort.sort(intRanArr);
		long timeA = System.currentTimeMillis();
		System.out.println("time : " + (double) (timeA - timeB) / 1000);

//
//		IntegerGenerator.setSeed(10);
//		Integer[] intDeArr = IntegerGenerator.decrease(5000, 1000);
//		timeB = System.currentTimeMillis();
//		BubbleSort.sort(intDeArr);
//		timeA = System.currentTimeMillis();
//		System.out.println("time : " + (double) (timeA - timeB) / 1000);
	}
}
