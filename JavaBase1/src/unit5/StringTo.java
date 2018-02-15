package unit5;

import java.util.StringTokenizer;

public class StringTo {

	public static void main(String[] args) {
		String text = " We are students ";
		System.out.println("原字符串：");
		System.out.println(text);
		StringTokenizer st = new StringTokenizer(text, " ");
		StringBuffer sb = new StringBuffer();
		while(st.hasMoreTokens()){
			sb.append(st.nextToken());
		}
		System.out.println("去除空格后：");
		System.out.println(sb.toString());
	}

}
