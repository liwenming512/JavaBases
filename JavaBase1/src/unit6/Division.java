package unit6;

public class Division {

	public static void main(String[] args) {
		String s = new String("abc,def,ghi,jkl");
		String news[] = s.split(",");
		for(int i = 0; i < news.length; i++){
			System.out.println(news[i]);
		}
	}

}
