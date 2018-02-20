package unit4;

public class WhileTest {

	static boolean condition(){
		boolean result = Math.random() < 0.99;
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(condition())
			System.out.println("Inside 'while' ");
		System.out.println("outside 'while' ");
	}

}
