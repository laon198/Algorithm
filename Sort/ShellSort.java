package Sort;

public class ShellSort {
    public static void sort(Comparable[] arr){
        int interval = arr.length/2; //TODD : interval 다른 알고리즘 생각하기
        while(interval>=1){
            sort(arr, interval);
            interval /= 2;
        }
    }

    private static void sort(Comparable[] arr, int interval){
        for(int i=interval; i<arr.length; i++){
            Comparable curElement = arr[i];
            int j = i-interval;
            while(j>=0 && curElement.compareTo(arr[j])<0){
                arr[j+interval] = arr[j];
                arr[j] = curElement;
                j -= interval;
            }
        }
    }
}
