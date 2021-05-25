package sorting;

public class Inserting {
	
	public static <K extends Comparable<K>> void sort(K[] keys) {
		int end = keys.length - 1;
		for(int i = 0 ; i <= end ;i++) {
			for(int j = i  ;j > 0 ;j--) {
				if(keys[j].compareTo(keys[j -1]) > 0) 
					swap(keys, j, j - 1);
				else break;
			}
			
		}
	}
	
	public static void insort(Comparable[] a) {
		sort(a,0,a.length -1);
	}
	
	public static void sort(Comparable[] a,int low,int high) {
		for(int i = low; i <= high;i++) {
			for(int j = i; j > 0 ;j--) {
				if(a[j].compareTo(a[j -1]) < 0) 
					swap(a, j, j - 1);
				else break;
			}
		}
		
		
	}
	
	
	
	
	public static <K extends Comparable<K>> void swap(K[] keys,int a, int b) {
		K tmp = keys[a];
		keys[a] = keys[b];
		keys[b] = tmp;
	}
	
}
















