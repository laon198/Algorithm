package subject;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class StudentGenerator {
	static Random r1 = new Random();
	static Random r2 = new Random();
	static Random r3 = new Random();
	static Random r4 = new Random();
	static Random r5 = new Random();
	
	public static Student[] increase(int size) {
	
		Student[] array = new Student[size];
		
		for(int i = 0 ; i < size;i++) {
		Student s = new Student(r1.nextInt(101),r2.nextInt(101), r3.nextInt(101),r4.nextInt(101),r5.nextInt(101));
		array[i] = s;
		}
		
		Arrays.sort(array);
		
		return array;
	}
	
	public static Student[] decrease(int size) {
		
		Student[] array = new Student[size];
		
		for(int i = 0 ; i < size;i++) {
		Student s = new Student(r1.nextInt(101),r2.nextInt(101), r3.nextInt(101),r4.nextInt(101),r5.nextInt(101));
		array[i] = s;
		}
		
		Arrays.sort(array,Collections.reverseOrder());
		
		return array;
	}
	
	public static Student[] random(int size) {
		
		Student[] array = new Student[size];
		
		for(int i = 0 ; i < size;i++) {
		Student s = new Student(r1.nextInt(101),r2.nextInt(101), r3.nextInt(101),r4.nextInt(101),r5.nextInt(101));
		array[i] = s;
		}
		
		return array;
	}
	
	public static void setSeed(long seed) {
		r1.setSeed(seed);
		r2.setSeed(seed + 10);
		r3.setSeed(seed + 20);
		r4.setSeed(seed + 30);
		r5.setSeed(seed + 40);
	}
}
