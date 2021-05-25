package Sort;

import java.util.Arrays;

public class Test {
    public static void main(String args[]){
        Integer[] intRanArr = ValueConstructor.intRandomArr(50000);
        long timeB = System.currentTimeMillis();
        InsertionSort.sort(intRanArr);
        long timeA = System.currentTimeMillis();

        System.out.println("time : "+(double)(timeA-timeB)/1000);
    }
}
