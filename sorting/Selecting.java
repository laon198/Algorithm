package sorting;

public class Selecting{
	
	public static <K extends Comparable<K>> void sort(K[] keys) {
		sort(keys,0,keys.length -1);
	}
	
	private static <K extends Comparable<K>> void sort(K[] keys,int start , int end) {
		if(start > end) return;
		
		int max_index = start; 
		for(int i = start; i <= end;i++) {
			if(keys[i].compareTo(keys[max_index]) > 0) max_index = i;
		}
		swap(keys,start,max_index);
		
		sort(keys,start+1,end);
	}
	
	public static <K extends Comparable<K>> void swap(K[] keys,int a, int b) {
		K tmp = keys[a];
		keys[a] = keys[b];
		keys[b] = tmp;
	}
	
	
	
}
