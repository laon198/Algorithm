package subject;

public class Main {

	public static void main(String[] args) {

			IntegerGenerator.setSeed(10);
			Integer[] a = IntegerGenerator.decrease(100,100);
			IntegerGenerator.setSeed(10);
			Integer[] b = IntegerGenerator.increase(100,100);
			IntegerGenerator.setSeed(10);
			Integer[] c = IntegerGenerator.random(100,100);
			
			for (int i = 0; i < a.length; i++) {
				System.out.printf("%10s", a[i]);
			}
			System.out.println();
			for (int i = 0; i < a.length; i++) {
				System.out.printf("%10s", b[i]);
			}
			System.out.println();
			for (int i = 0; i < a.length; i++) {
				System.out.printf("%10s", c[i]);
			}
			System.out.println();
		}
}