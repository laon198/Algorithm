package Sort;

public class BinaryInsertionSort {
    public static void sort(Comparable[] arr){
        for(int i=1; i<arr.length; i++){
            int insertIdx = binarySearchIdx(arr, 0, i-1, arr[i]);
            shift(arr, insertIdx, i);
        }
    }

    private static void shift(Comparable[] arr, int insertIdx, int valueIdx) {
        Comparable tmp = arr[valueIdx];

        for(int i=valueIdx-1; i>=insertIdx; i--){
            arr[i+1] = arr[i];
        }

        arr[insertIdx] = tmp;
    }


    private static int binarySearchIdx(Comparable[] arr, int start, int end, Comparable value) {
        int mid = 0;

        while((end-start)>1){
            mid = (end+start)/2;

            if(value.compareTo(arr[mid])>0){
                start = mid;
            }else if(value.compareTo(arr[mid])<0){
                end = mid;
            }else if(value.compareTo(arr[mid])==0){
                return mid+1;
            }
        }

        if(mid==end){
            if(value.compareTo(arr[start])<0){
                return start==0 ? start : start-1;
            }
            else{
                return start+1;
            }
        }else{
            if(value.compareTo(arr[end])>=0){
                return arr.length-1==end ? end : end+1;
            }
            else{
                return end-1;
            }
        }
	}
}
