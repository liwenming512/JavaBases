package unit5;

public class InsertSort {

	public static void main(String[] args) {
		int[] array = new int[]{20,40,90,30,80,70,50};
		System.out.println("ÅÅĞòÇ°Êı×é£º");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		int tmp;
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i] < array[j]){
					array[j + 1] = array[j];
				}
			}
		}
	}

}
