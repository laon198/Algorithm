package Sort;

import subject.*;

public class Test {
	public static void main(String args[]) {
		//5,000 10,000 25,000 50,000 100,000
		
		StudentGenerator.setSeed(10);
		IntegerGenerator.setSeed(10);
		DoubleGenerator.setSeed(10);
		StringGenerator.setSeed(10);
		
		Comparable[] intRanArr = StudentGenerator.decrease(5000);
		
		long timeB = System.currentTimeMillis();
		BinaryInsertionSort.sort(intRanArr);
		long timeA = System.currentTimeMillis();
		System.out.println("time : " + (double)(timeA - timeB) /1000);

	}
}
