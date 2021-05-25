package subject;

import java.util.Random;

public class Generator {
	Random random;
	int size;
	
	public Generator(int seed,int size) {
		random = new Random(seed);
		this.size = size;
	}
	
}
