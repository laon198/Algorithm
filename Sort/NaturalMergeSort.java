package Sort;

public class NaturalMergeSort {
    private static Comparable[] sorted;

    public static void sort(Comparable[] arr){
        sorted = new Comparable[arr.length];
        while(getSortedRange(arr, 0)!=arr.length-1){
            int leftIdx = 0;
            int rightIdx = 0;
            while(leftIdx<arr.length-1){
                int leftEnd = getSortedRange(arr, leftIdx);
                if(leftIdx==arr.length-1) break;
                rightIdx = leftEnd+1;
                int rightEnd = getSortedRange(arr, rightIdx);

                merge(arr, leftIdx, leftEnd, rightEnd);
                leftIdx = rightEnd+1;
            }
        }
        sorted = null;
    }

    private static int getSortedRange(Comparable[] arr, int start){
        for(int i=start+1; i<arr.length; i++){
            if(arr[i].compareTo(arr[i-1])<0) return i-1;
        }
        return arr.length-1;
    }

    private static void merge(Comparable[] a, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;


        while(l <= mid && r <= right) {
            if(a[l].compareTo(a[r])<=0) {
                sorted[idx] = a[l];
                idx++;
                l++;
            } else {
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        }

        if(l > mid) {
            while(r <= right) {
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        }

        else {
            while(l <= mid) {
                sorted[idx] = a[l];
                idx++;
                l++;
            }
        }

        for(int i = left; i <= right; i++) {
            a[i] = sorted[i];
        }
    }

}
