package Sort;

public class RecursiveMergeSort {
		public static void merge(Comparable a[],Comparable b[],int start,int mid,int end) {
			int i = start; int j = mid + 1;
			for(int k = start; k <= end;k++) {
				if(i > mid) b[k] = a[j++];
				else if(j > end) b[k] = a[i++];
				else if(isLess(a[j],a[i])) b[k] = a[j++];
				else b[k] = a[i++];
			}
			for(int k = start ; k <= end; k++) {
				a[k] = b[k];
			}
		}
		
		
		public static void sort(Comparable a[],Comparable b[],int start,int end) {
			if(start > end) return;
			int mid = start + (end - start)/2;
			sort(a,b,start,mid);
			sort(a,b,mid+1,end);
			if(isLess(a[mid], a[mid + 1])) return;
			merge(a,b,start,mid,end);
		
		}
		
		
		public static void sort(Comparable a[]) {
			Comparable []b = new Comparable[a.length];
			sort(a,b,0,a.length - 1);
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
