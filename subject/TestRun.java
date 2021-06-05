package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("DataSize : ");
		int size = s.nextInt();
		System.out.print("Sort Type(R(random), I(increse), D(decrese)): ");
		String sorttype = s.next();
		System.out.print("Data Type(I(integer), D(double), STR(String), STD(Student)) : ");
		String datatype = s.next();

		System.out.printf("\t\t\t   Menu\n");
		
		System.out.printf("%-20s%-20s%-20s%n","1.Insertion","2.BinaryInsertion","3.ShellSort");
		System.out.printf("%-20s%-20s%-20s%n","4.recursiveQuick","5.MedianQuick","6.recursive Merge");
		System.out.printf("%-20s%-20s%-20s%n","7.iterativeMerge", "8.NaturalMerge","9.Heap");
		System.out.printf("%-20s%-20s%-20s%n","10.Bubble","11.Selection","12.Collections");
		System.out.printf("%-20s%-20s%-20s%n","13.Arrays","14.Radix","15.HexRadix");
		System.out.printf("%-20s%n","16.LogicalRadix");
		int input = s.nextInt();
		
		Comparable[] arr = Test.getArray(datatype, sorttype, size);
		
		switch(input) {	
		case 1 : {
			long a = System.currentTimeMillis();
			InsertionSort.sort(arr);
			long b = System.currentTimeMillis();
			System.out.println("time :" +  (double)(b-a)/1000);
			break;
		}
		case 2 : {
			long a = System.currentTimeMillis();
			BinaryInsertionSort.sort(arr);
			long b = System.currentTimeMillis();
			System.out.println("time :" + (double)(b-a)/1000);
			break;
		}
		case 3 : {
			long a = System.currentTimeMillis();
			ShellSort.sort(arr);
			long b = System.currentTimeMillis();
			System.out.println("time :" + (double)(b-a)/1000);
			break;
		}
		case 4 : {
			long a = System.currentTimeMillis();
			QuickSort.sort(arr);
			long b = System.currentTimeMillis();
			System.out.println("time :" + (double)(b-a)/1000);
			break;
		}
		case 5 : {
			long a = System.currentTimeMillis();
			MedianQuickSort.sort(arr);
			long b = System.currentTimeMillis();
			System.out.println("time :" + (double)(b-a)/1000);
			break;
		}
		case 6 :{
			long a = System.currentTimeMillis();
			RecursiveMergeSort.sort(arr);
			long b = System.currentTimeMillis();
			System.out.println("time :" + (double)(b-a)/1000 );
			break;
		}
		case 7 : {
			long a = System.currentTimeMillis();
			IterativeMergeSort.sort(arr);
			long b = System.currentTimeMillis();
			System.out.println("time :" + (double)(b-a)/1000);
			break;
		}
		case 8 : {
			long a = System.currentTimeMillis();
			NaturalMergeSort.sort(arr);
			long b = System.currentTimeMillis();
			System.out.println("time :" + (double)(b-a)/1000);
			break;
		}
		case 9 :{
			long a = System.currentTimeMillis();
			HeapSort.sort(arr);
			long b = System.currentTimeMillis();
			System.out.println("time :" + (double)(b-a)/1000);
			break;
		}
		case 10 :{
			long a = System.currentTimeMillis();
			BubbleSort.sort(arr);
			long b = System.currentTimeMillis();
			System.out.println("time :" + (double)(b-a)/1000);
			break;
		}
		case 11 :{
			long a = System.currentTimeMillis();
			SelectionSort.sort(arr);
			long b = System.currentTimeMillis();
			System.out.println("time :" + (double)(b-a)/1000);
			break;
		}
		case 12 :{
			ArrayList list = new ArrayList<Comparable>();
			for(int i = 0 ; i < arr.length ; i++) {
				list.add(arr[i]);
			}
			
			long a = System.currentTimeMillis();
			Collections.sort(list);
			long b = System.currentTimeMillis();
			System.out.println("time :" + (double)(b-a)/1000);
			break;
		}
		case 13 :{
			long a = System.currentTimeMillis();
			Arrays.sort(arr);
			long b = System.currentTimeMillis();
			System.out.println("time :" + (double)(b-a)/1000);
			break;
		}
		case 14 :{
			long a = System.currentTimeMillis();
			RadixSort.sort((Integer[])arr);
			long b = System.currentTimeMillis();
			System.out.println("time :" + (double)(b-a)/1000);
			break;
		}
		case 15 :{
			long a = System.currentTimeMillis();
			HexRadixSort.sort((Integer[])arr);
			long b = System.currentTimeMillis();
			System.out.println("time :" + (double)(b-a)/1000);
			break;
		}
		case 16 :{
			long a = System.currentTimeMillis();
			LogicalRadixSort.sort((Integer[])arr);
			long b = System.currentTimeMillis();
			System.out.println("time :" + (double)(b-a)/1000);
			break;
		}
		
		default : System.out.println("잘못된 입력");
		}
		
		
		
	}
}
