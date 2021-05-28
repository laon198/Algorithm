package Sort;

public class QuickSort {
    public static void sort(Comparable[] arr){
        sort(arr, 0, arr.length-1);
    }

    private static void sort(Comparable[] arr, int start, int end){
        if(start>=end) return;
        int pivotIdx = partition(arr, start, end);
        sort(arr, start, pivotIdx-1);
        sort(arr, pivotIdx+1, end);
    }

    private static int partition(Comparable[] arr, int start, int end) {
        int pivotIdx = start;
        int leftIdx = start+1;
        int rightIdx = end;

        while(leftIdx<rightIdx){
            while(leftIdx<rightIdx && arr[rightIdx].compareTo(arr[pivotIdx])>=0)  rightIdx--;
            while(leftIdx<rightIdx && arr[leftIdx].compareTo(arr[pivotIdx])<0)  leftIdx++;

            swap(arr, leftIdx, rightIdx);
        }


        if(arr[pivotIdx].compareTo(arr[leftIdx])>0){
            swap(arr, pivotIdx, rightIdx);
            return rightIdx;
        }else{
            return pivotIdx;
        }
    }

    private static void swap(Comparable[] arr, int i, int j){
        Comparable tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
