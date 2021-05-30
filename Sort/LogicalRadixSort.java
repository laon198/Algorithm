package Sort;

public class LogicalRadixSort {
    public static void sort(Integer[] arr){
        int max = getMax(arr);
        for(int exp=1, shifNum=0; max/exp>0; exp*=16, shifNum+=4){
            countSort(arr, shifNum);
        }
    }

    private static void countSort(Integer[] arr, int shiftNum) {
        int[] output = new int[arr.length];
        int[] count = new int[16];

        for(int i=0; i<arr.length; i++){
            count[(arr[i]>>shiftNum)&15]++;
        }

        for(int i=1; i<16; i++) {
            count[i] += count[i-1];
        }

        for(int i=arr.length-1; i>=0; i--){
            output[count[(arr[i]>>shiftNum)&15]-1] = arr[i];
            count[(arr[i]>>shiftNum)&15]--;
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
