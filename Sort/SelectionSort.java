package Sort;

public class SelectionSort {
    public static void sort(Comparable[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minIdx = getMinIdx(arr, i);
            swap(arr, i, minIdx);
        }
    }

    private static int getMinIdx(Comparable[] arr, int startIdx){
        int minIdx = startIdx;
        for(int i=startIdx+1; i<arr.length; i++){
            if(arr[i].compareTo(arr[minIdx])<0) minIdx = i;
        }
        return minIdx;
    }

    private static void swap(Comparable[] arr, int idx1, int idx2){
        Comparable tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
}
