package unit4;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 30;
		int[] fibs = new int[num];
		for(int i = 0; i < fibs.length; i++){
			if (i == 0 || i == 1){
				fibs[i] = 1;
			}else{
				fibs[i] = fibs[i - 1] + fibs[i - 2];
			}
		}
		String strs = "";
		int i = 0;
		while(i < fibs.length){
			if (i == 0){
				strs = "" + fibs[i];
			}else{
				strs = strs + "," + fibs[i];
			}
			i++;
		}
		System.out.println(strs);
	}

}
