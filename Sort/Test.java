package Sort;

import java.util.Arrays;

public class Test {
    public static void main(String args[]){
//        Integer[] intRanArr = ValueConstructor.intRandomArr(50000);
        Integer[] intRanArr = {2, 51, 0, 92, 11, 13, 1, -2};
//        Integer[] intRanArr = {1, 2, 3, 4, 5, 6, 7};
        long timeB = System.currentTimeMillis();
        QuickSort.sort(intRanArr);
        long timeA = System.currentTimeMillis();
        System.out.println("time : "+(double)(timeA-timeB)/1000);
        System.out.println(Arrays.toString(intRanArr));

        Integer[] intArr = {2, 51, 0, 92, 11, 13, 1, -2};
        timeB = System.currentTimeMillis();
        MedianQuickSort.sort(intArr);
        timeA = System.currentTimeMillis();
        System.out.println("time : "+(double)(timeA-timeB)/1000);
        System.out.println(Arrays.toString(intArr));
    }
}
