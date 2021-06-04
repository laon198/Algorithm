package test;

import Sort.QuickSort;
import subject.DataGenerator;


public class QuickSortTest {
    private final static int[] SIZE_ARR = {
            5000, 10000, 25000, 50000, 100000
    };

    public static void main(String args[]){
        System.out.println("랜덤 정수 배열");
        for(int size : SIZE_ARR){
            testRandomIntTime(size);
        }

        System.out.println("오름차순 정수 배열");
        for(int size : SIZE_ARR){
            testIncreseIntTime(size);
        }

        System.out.println("내림차순 정수 배열");
        for(int size : SIZE_ARR){
            testDecreseIntTime(size);
        }
    }

    private static void testRandomIntTime(int size){
        long timeB = System.currentTimeMillis();
        QuickSort.sort(DataGenerator.getRandomIntArr(size));
        long timeA = System.currentTimeMillis();
        System.out.println(size+"개 "+"time : "+(double)(timeA-timeB)/1000);
    }

    private static void testIncreseIntTime(int size){
        long timeB = System.currentTimeMillis();
        QuickSort.sort(DataGenerator.getIncreseArr(size));
        long timeA = System.currentTimeMillis();
        System.out.println(size+"개 "+"time : "+(double)(timeA-timeB)/1000);
    }

    private static void testDecreseIntTime(int size){
        long timeB = System.currentTimeMillis();
        QuickSort.sort(DataGenerator.getDecreseArr(size));
        long timeA = System.currentTimeMillis();
        System.out.println(size+"개 "+"time : "+(double)(timeA-timeB)/1000);
    }
}
