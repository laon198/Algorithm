package Sort;

public class BubbleSort {
    public static void sort(Comparable[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    Comparable tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
