package unit6;

public class Jerque {

	public static void main(String[] args) {
		String str = "";
		Long startTime = System.currentTimeMillis();
		for(long i = 0; i < 10000; i++){
			str = str + i;
		}
		Long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		StringBuilder sb = new StringBuilder("");
		startTime = System.currentTimeMillis();
		for(long i = 0; i < 10000; i++){
			sb.append(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

}
