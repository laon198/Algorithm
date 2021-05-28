package subject;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class IntegerGenerator {
	static Random random = new Random();

	public static Integer[] increase(int size,int max) {
		Integer[] a = new Integer[size];

		for (int i = 0; i < a.length; i++)
			a[i] = random.nextInt(max + 1);

		Arrays.sort(a);

		return a;
	}
	
	public static Integer[] decrease(int size,int max) {
		Integer[] a = new Integer[size];

		for (int i = 0; i < a.length; i++)
			a[i] = random.nextInt(max + 1);

		Arrays.sort(a,Collections.reverseOrder());

		return a;
	}
	
	public static Integer[] random(int size , int max) {
		Integer[] a = new Integer[size];

		for (int i = 0; i < a.length; i++)
			a[i] = random.nextInt(max + 1);

		return a;
	}

	public static void setSeed(long seed) {
		random.setSeed(seed);
	}

}
