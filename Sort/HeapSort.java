package Sort;

public class HeapSort {
		public static void sort(Comparable[] a) {
			
			int heapsize = a.length - 1;
			
			for(int i = heapsize/2 ; i >0;i--) {
				downheap(a,i,heapsize);
			}
			while(heapsize > 1) {
				swap(a,1,heapsize--);
				downheap(a,1,heapsize);
			}
		}
		
		
		public static void downheap(Comparable[] a,int p,int heapsize) {
			while(2*p <= heapsize) {
				int s = 2*p;
				if(s < heapsize && isLess(a[s],a[s+1])) s++;
				if(!isLess(a[p],a[s])) break;
				swap(a,p,s);
				p = s;
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
