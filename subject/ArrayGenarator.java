package Sort;

import subject.*;

import java.util.Arrays;
import java.util.Collections;

public class Test {
	
	public static Comparable[] getArray(String DataType, String sortType, int DataSize) {
		Comparable[] arr;

		if (DataType.equals("I")) {
			arr = DataGenerator.getRandomIntArr(DataSize);
		} else if (DataType.equals("D")) {
			arr = DataGenerator.getRandomDoubleArr(DataSize);
		} else if (DataType.equals("STR")) {
			arr = DataGenerator.getRandomStringArr(DataSize);
		} else if (DataType.equals("STD")) {
			arr = DataGenerator.getRandomStdArr(DataSize);
		}
		else 
			return null;
		
		if (sortType.equals("R")) {
			return arr;
		}
		else if (sortType.equals("I")) {
			Arrays.sort(arr);
			return arr;
		}
		else if (sortType.equals("D")) {
			Arrays.sort(arr, Collections.reverseOrder());
			return arr;
		}
		else return null;

	}

	public static String getSortType(int input) {
		if (input == 1)
			return "R";
		else if (input == 2)
			return "I";
		else if (input == 3)
			return "D";
		else
			return "";
	}

	public static String getDataType(int input) {
		final int I = 1;
		
		if (input == 1)
			return "I";
		else if (input == 2)
			return "D";
		else if (input == 3)
			return "STR";
		else if (input == 4)
			return "STD";
		else
			return "";
	}

	public static int getDataSize(int input) {
		if (input == 1)
			return 5000;
		else if (input == 2)
			return 10000;
		else if (input == 3)
			return 25000;
		else if (input == 4)
			return 50000;
		else if (input == 4)
			return 100000;
		else
			return 0;
	}

}
