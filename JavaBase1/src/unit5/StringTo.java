package unit5;

import java.util.StringTokenizer;

public class StringTo {

	public static void main(String[] args) {
		String text = " We are students ";
		System.out.println("ԭ�ַ�����");
		System.out.println(text);
		StringTokenizer st = new StringTokenizer(text, " ");
		StringBuffer sb = new StringBuffer();
		while(st.hasMoreTokens()){
			sb.append(st.nextToken());
		}
		System.out.println("ȥ���ո��");
		System.out.println(sb.toString());
	}

}
