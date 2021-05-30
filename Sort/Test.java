package Sort;

import subject.*;

// 데이터 개수 : 5,000 10,000 25,000 50,000 100,000  max =  1000 / String = 100
public class Test {

	public static void main(String args[]) {
		
		StudentGenerator.setSeed(10);
		
		Comparable[] intRanArr = StudentGenerator.random(5000);
		
		long timeB = System.currentTimeMillis();
		ShellSort.sort(intRanArr);
		long timeA = System.currentTimeMillis();
		
		System.out.println("time : " + (double) (timeA - timeB) / 1000);

//		// increase value
//		IntegerGenerator.setSeed(10);
//
//		Comparable[] intInArr = IntegerGenerator.increase(5000,1000);
//		long timeB = System.currentTimeMillis();
//		RecursiveMergeSort.sort(intInArr);
//		long timeA = System.currentTimeMillis();
//		System.out.println("time : " + (double) (timeA - timeB) / 1000);

		// decrease value
//		StudentGenerator.setSeed(10);
//		Comparable[] intDeArr = StudentGenerator.decrease(5000);
//		long timeB = System.currentTimeMillis();
//		ShellSort.sort(intDeArr);
//		long timeA = System.currentTimeMillis();
//		System.out.println("time : " + (double) (timeA - timeB) / 1000);

	}
}
