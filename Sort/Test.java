package Sort;

import subject.*;

import java.util.Arrays;

public class Test {
	public static void main(String args[]) {
		IntegerGenerator.setSeed(10);
		Integer[] intRanArr = IntegerGenerator.random(500000, 100);
		long timeB = System.currentTimeMillis();
		QuickSort.sort(intRanArr);
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
