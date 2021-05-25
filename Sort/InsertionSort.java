package Sort;

public class InsertionSort {
    public static void sort(Comparable[] arr){
        for(int i=1; i<arr.length; i++){
            Comparable curElement = arr[i];

            int j = i-1;
            while(j>=0 && curElement.compareTo(arr[j])<0){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = curElement;
        }
    }
}
