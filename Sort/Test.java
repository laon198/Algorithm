package Sort;

import java.util.Arrays;

import subject.*;

public class Test {
	public static void main(String args[]) {

		IntegerGenerator.setSeed(10);
		Integer[] intRanArr = IntegerGenerator.random(15, 100);
		long timeB = System.currentTimeMillis();
		IterativeMergeSort.sort(intRanArr);
		long timeA = System.currentTimeMillis();
		System.out.println("time : " + (double) (timeA - timeB) / 1000);
		System.out.println(Arrays.toString(intRanArr));

//
//		IntegerGenerator.setSeed(10);
//		Integer[] intDeArr = IntegerGenerator.decrease(5000, 1000);
//		timeB = System.currentTimeMillis();
//		BubbleSort.sort(intDeArr);
//		timeA = System.currentTimeMillis();
//		System.out.println("time : " + (double) (timeA - timeB) / 1000);
	}
}
