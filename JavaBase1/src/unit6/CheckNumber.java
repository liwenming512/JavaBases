package unit6;

public class CheckNumber {

	public static void main(String[] args) {
		String s = "12312312";
		if(CheckNumber.IsNumber(s)){
			System.out.println(s + " 是数字格式");
		}else{
			System.out.println(s + " 不是数字格式");
		}
	}
	
	public static boolean IsNumber(String str){
		char[] c = str.toCharArray();
		for(int i = 0; i < c.length; i ++){
			if (Character.isDigit(c[i])){
				
			}else{
				return false;
			}
		}
		return true;
	}

}
