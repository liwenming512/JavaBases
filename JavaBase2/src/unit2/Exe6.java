package unit2;

public class Exe6 {
	
	public static int storage(String s){
		return s.length() * 2;
	}

	public static void main(String[] args) {
		String testStr = "Hello, 李文明";
		System.out.println(storage(testStr));
	}

}
