package unit5;

public class EnumOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Spiciness s: Spiciness.values()){
			System.out.println(s + ", ordinal:" + s.ordinal());
		}
	}

}
