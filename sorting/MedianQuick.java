package sorting;

import java.util.Random;

public class MedianQuick {
		public static void sort(Comparable[] keys) {
			sort(keys,0,keys.length - 1);
		}
		
		public static void sort(Comparable[] keys,int low,int high) {
			if(high <= low + 7) {
				Inserting.sort(keys, low, high);
				return;
			}
			int j = partition(keys,low,high);
			sort(keys,low,j-1);
			sort(keys,j+1,high);
		}
		
		public static int partition(Comparable[] keys,int pivot,int high) {
			int i = pivot;
			int j = high + 1;
			Comparable p = keys[pivot];
			while(true) {
				while(isLess(keys[++i],p)) 
					if(i == high) break;
				while(isLess(p,keys[--j]))
					if(j == pivot) break;
				
				if(i >= j) break;
				swap(keys,i,j);
			}
			swap(keys,pivot,j);
			return j;
		}
		
		public static boolean isLess(Comparable a,Comparable b) {
			return a.compareTo(b) < 0;
		}
		
		
		public static void swap(Comparable[] keys, int a, int b) {
			Comparable tmp = keys[a];
			keys[a] = keys[b];
			keys[b] = tmp;
		}
		
		public static Comparable median(Comparable[] a,int low , int high) {
			
			Random r = new Random();
			
			int num1 = (int)(r.nextInt(high - low) + low);
			int num2 = (int)(r.nextInt(high - low) + low);
			int num3 = (int)(r.nextInt(high - low) + low);
			
			if(a[num1].compareTo(a[num2]) >= 0 && a[num2].compareTo(a[num3]) >= 0) {
				return a[num2];
			}
			else if(a[num2].compareTo(a[num1]) >= 0 && a[num1].compareTo(a[num3]) >= 0) {
				return a[num1];
			}
			else return a[num3];
		}
}
