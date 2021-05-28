package sorting;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Integer[] keys = new Integer[10000];

		for (int i = 0; i < keys.length; i++) {
			keys[i] = (int) (Math.random() * 10000);
		}

		long timeB = System.currentTimeMillis();
		Selecting.sort(keys);
		long timeA = System.currentTimeMillis();

		for (int i = 0; i < keys.length; i++) {
			System.out.printf("%6d", keys[i]);
			if (i != 0 && i % 20 == 0)
				System.out.println();
		}

		System.out.println((double) (timeA - timeB) / 1000);

//		Integer[] keys = new Integer[100];
//		
//				for (int i = 0; i < keys.length; i++) 
//				{
//					keys[i] = (int) (Math.random() * 1000);
//				}
//				
//		System.out.println(MedianQuick.median(keys,0,100));
//		int high = 100; int low = 0;
//		Random r = new Random();
//		
//		Integer[] num = new Integer[3];
//		 num[0] = (int)(r.nextInt(high - low + 1) + low);
//		 num[1] = (int)(r.nextInt(high - low + 1) + low);
//		 num[2] = (int)(r.nextInt(high - low + 1) + low);
//		
//		
//		System.out.println(num[0] + " " + num[1] + " " + num[2]);
//		
//		System.out.println(MedianQuick.median(num,0 ,2));
	}
}
