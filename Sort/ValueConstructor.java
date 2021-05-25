package Sort;

import java.util.Random;

public class ValueConstructor {
    private static Random ran = new Random();

    public static Integer[] intRandomArr(int size){
        Integer[] intArr = new Integer[size];
        for(int i=0; i<intArr.length; i++){
            intArr[i] = ran.nextInt();
        }
        return intArr;
    }
}
