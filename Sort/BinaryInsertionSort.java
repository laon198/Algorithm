//package Sort;
//
//public class BinaryInsertionSort {
//    public static void sort(Comparable[] arr){
//        for(int i=1; i<arr.length; i++){
//            Comparable curElement = arr[i];
//            int insertIdx = binarySearchIdx(arr, 0, i-1, arr[i]);
//        }
//    }
//
//    private static int binarySearchIdx(Comparable[] arr, int start, int end, Comparable value) {
//        if(start==end){ //start가 0일때
//            if(value.compareTo(arr[start])<0) return 0;
//            else return 1;
//        }
//
//        int curIdx = (start+end)/2;
//        while(true){
//            if(value.compareTo(arr[curIdx])>0){
//                curIdx=(curIdx+end)/2;
//            }
//            else if(value.compareTo(arr[curIdx]<0)) curIdx=(start+curIdx)/2;
//        }
//
//    }
//}
