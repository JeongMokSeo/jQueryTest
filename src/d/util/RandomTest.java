package d.util;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		RandomTest obj = new RandomTest();
		int randomCnt = 10;
		obj.genRandomNumbers(randomCnt);
	}

	private void genRandomNumbers(int randomCnt) {
		Random random = new Random();
		for (int i=0; i < randomCnt; i++ ) {
			System.out.print(random.nextInt(100) + " ");
		}
		
	}
}
