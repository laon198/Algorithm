package subject;

public class DataGenerator {
    private static final int SEED = 10;
    private static final int MAX_VALUE = 500;
    private static final int MAX_STRING_LENGTH = 10;

    public static Integer[] getRandomIntArr(int size){
        IntegerGenerator.setSeed(SEED);
        return IntegerGenerator.random(size, MAX_VALUE);
    }

    public static Integer[] getIncreseIntArr(int size){
        IntegerGenerator.setSeed(SEED);
        return IntegerGenerator.increase(size, MAX_VALUE);
    }

    public static Integer[] getDecreseIntArr(int size){
        IntegerGenerator.setSeed(SEED);
        return IntegerGenerator.decrease(size, MAX_VALUE);
    }

    public static Double[] getRandomDoubleArr(int size){
        DoubleGenerator.setSeed(SEED);
        return DoubleGenerator.random(size, MAX_VALUE);
    }

    public static Double[] getIncreseDoubleArr(int size){
        DoubleGenerator.setSeed(SEED);
        return DoubleGenerator.increase(size, MAX_VALUE);
    }

    public static Double[] getDecreseDoubleArr(int size){
        DoubleGenerator.setSeed(SEED);
        return DoubleGenerator.decrease(size, MAX_VALUE);
    }

    public static String[] getRandomStringArr(int size){
        StringGenerator.setSeed(SEED);
        return StringGenerator.random(size, MAX_STRING_LENGTH);
    }

    public static String[] getIncreseStringArr(int size){
        StringGenerator.setSeed(SEED);
        return StringGenerator.increase(size, MAX_STRING_LENGTH);
    }

    public static String[] getDecreseStringArr(int size){
        StringGenerator.setSeed(SEED);
        return StringGenerator.decrease(size, MAX_STRING_LENGTH);
    }

    public static Student[] getRandomStdArr(int size){
        StudentGenerator.setSeed(SEED);
        return StudentGenerator.random(size);
    }

    public static Student[] getIncreseArr(int size){
        StudentGenerator.setSeed(SEED);
        return StudentGenerator.increase(size);
    }

    public static Student[] getDecreseArr(int size){
        StudentGenerator.setSeed(SEED);
        return StudentGenerator.decrease(size);
    }
}
