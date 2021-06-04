package Sort;

import subject.*;

public class Test {
	public static void main(String args[]) {
		//5,000 10,000 25,000 50,000 100,000
		
		StudentGenerator.setSeed(10);
		IntegerGenerator.setSeed(10);
<<<<<<< HEAD
		DoubleGenerator.setSeed(10);
		StringGenerator.setSeed(10);
		
		Comparable[] intRanArr = StudentGenerator.decrease(5000);
		
		long timeB = System.currentTimeMillis();
		BinaryInsertionSort.sort(intRanArr);
=======
		Integer[] intRanArr = IntegerGenerator.random(20, 100);
		System.out.println(Arrays.toString(intRanArr));
		long timeB = System.currentTimeMillis();
		NaturalMergeSort.sort(intRanArr);
>>>>>>> 53aced42400030bb09ccc1a501001bf9b5f0c846
		long timeA = System.currentTimeMillis();
		System.out.println("time : " + (double)(timeA - timeB) /1000);

	}
}
