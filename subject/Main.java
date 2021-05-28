package subject;

public class Main {

	public static void main(String[] args) {

		for (int j = 0; j < 10; j++) {
			StudentGenerator.setSeed(10);
			Student[] a = StudentGenerator.decrease(10);
			StudentGenerator.setSeed(10);
			Student[] b = StudentGenerator.increase(10);
			StudentGenerator.setSeed(10);
			Student[] c = StudentGenerator.random(10);
			for (int i = 0; i < a.length; i++) {
				System.out.printf("%10s", a[i].getAvg());
			}
			System.out.println();
			for (int i = 0; i < a.length; i++) {
				System.out.printf("%10s", b[i].getAvg());
			}
			System.out.println();
			for (int i = 0; i < a.length; i++) {
				System.out.printf("%10s", c[i].getAvg());
			}
			System.out.println();
		}
	}
}