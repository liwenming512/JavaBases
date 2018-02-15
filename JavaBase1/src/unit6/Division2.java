package unit6;

public class Division2 {

	public static void main(String[] args) {
		String s = new String("abc,def,ghi,jkl");
		String news[] = s.split(",", 2);
		for(int i = 0; i < news.length; i++){
			System.out.println(news[i]);
		}
	}

}
