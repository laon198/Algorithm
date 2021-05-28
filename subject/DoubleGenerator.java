package subject;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class DoubleGenerator {
	static Random random = new Random();

	public static Double[] increase(int size,int max) {
		Double[] a = new Double[size];

		for (int i = 0; i < a.length; i++)
			a[i] = random.nextDouble()*(max + 1);

		Arrays.sort(a);

		return a;
	}
	
	public static Double[] decrease(int size,int max) {
		Double[] a = new Double[size];

		for (int i = 0; i < a.length; i++)
			a[i] = (random.nextDouble()*(max + 1));

		Arrays.sort(a,Collections.reverseOrder());

		return a;
	}
	
	public static Double[] random(int size , int max) {
		Double[] a = new Double[size];

		for (int i = 0; i < a.length; i++)
			a[i] = (random.nextDouble()*(max + 1));

		return a;
	}

	public static void setSeed(long seed) {
		random.setSeed(seed);
	}
}
