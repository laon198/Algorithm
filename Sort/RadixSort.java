package Sort;

public class RadixSort {
    public static void sort(Integer[] arr){
        int max = getMax(arr);
        for(int exp=1; max/exp>0; exp*=10){
            countSort(arr, exp);
        }
    }

    private static void countSort(Integer[] arr, int exp) {
        int[] output = new int[arr.length];
        int[] count = new int[10];

        for(int i=0; i<arr.length; i++){
            count[(arr[i]/exp)%10]++;
        }

        for(int i=1; i<10; i++) {
            count[i] += count[i-1];
        }

        for(int i=arr.length-1; i>=0; i--){
            output[count[(arr[i]/exp)%10]-1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }

        for(int i=0; i<arr.length; i++) {
            arr[i] = output[i];
        }


    }

    private static int getMax(Integer[] data) {
        int mx = data[0];
        for(int i=1; i<data.length; i++) {
            if(data[i] > mx) {
                mx = data[i];
            }
        }
        return mx;
    }

}
