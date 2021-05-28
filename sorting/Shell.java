package sorting;

public class Shell {
	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 4;
		while(h >= 1) {
			for(int i = h;i<N;i++) {
				for(int j = i ; j >= h ;j = j - h) {
					if(isLess(a[j],a[j-h]))
					swap(a,j,j-h);
					else break;
				}
			}
			break;
		}
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
