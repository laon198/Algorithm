package subject;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class StringGenerator {
	static final int a = 97;
	static final int z = 123;
	static Random random = new Random();

	public static String[] random(int size,int string_length) {
		String[] array = new String[size];

		for (int j = 0; j < size; j++) {
			String s = new String();

			for (int i = 1; i <= string_length; i++) {
				
				int num = random.nextInt(z - a);

				char c = (char) (num + 'a');

				s = s + c;
			}
			array[j] = s;
		}
		return array;
	}

	public static String[] increase(int size, int string_length) {
		String[] array = new String[size];

		for (int j = 0; j < size; j++) {
			String s = new String();

			for (int i = 1; i <= string_length; i++) {
				int num = random.nextInt(z - a);

				char c = (char) (num + 'a');

				s = s + c;
			}
			array[j] = s;
		}
		Arrays.sort(array);
		return array;
	}

	public static String[] decrease(int size, int string_length) {
		String[] array = new String[size];

		for (int j = 0; j < size; j++) {
			String s = new String();

			for (int i = 1; i <= string_length; i++) {
				int num = random.nextInt(z - a);

				char c = (char) (num + 'a');

				s = s + c;
			}
			array[j] = s;
		}
		
		Arrays.sort(array,Collections.reverseOrder());
		
		return array;
	}

	public static void setSeed(long seed) {
		random.setSeed(seed);
	}
}
