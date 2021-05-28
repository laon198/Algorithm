package sorting;

public class Quick {
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
}
