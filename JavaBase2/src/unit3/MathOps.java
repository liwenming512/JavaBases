package unit3;

import java.util.Random;

public class MathOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		int i, j, k;
		j = rand.nextInt(100) + 1;
		System.out.println("j = " + j);
		k = rand.nextInt(100) + 1;
		System.out.println("k = " + k);
		i = j + k;
		System.out.println("j + k =" + i);
	}

}
