package Sort;

public class BinaryInsertionSort {

	public static void sort(Comparable[] arr) {

		for (int i = 1; i < arr.length; i++) {
			Comparable curElement = arr[i];
			
			
			for (int k = i; k > pos; k--) {
				swap(arr, k, k - 1);
			}
		}
	}
	
	
	public static void binarySearch(Comparable[] keys , int start,int end,Comparable target ) {
		
	}

	public static void swap(Comparable[] keys, int a, int b) {
		Comparable tmp = keys[a];
		keys[a] = keys[b];
		keys[b] = tmp;
	}

}
