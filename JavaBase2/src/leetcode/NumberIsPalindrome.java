package leetcode;/**
 * Created by Administrator on 2021/4/9.
 */

/**
 * @Author liwenming
 * @Description 是否是回文数
 * @Date 2021/4/9 12:26
 **/
public class NumberIsPalindrome {

    public static boolean IsPalindrome(int x){
        String xStr = String.valueOf(x);
        boolean ret = true;
        for(int i = 0; i < xStr.length() / 2; i++){
            char a = xStr.charAt(i);
            char b = xStr.charAt(xStr.length() - i - 1);
            if (a != b){
                ret = false;
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int i = -123321;
        boolean ret = IsPalindrome(i);
        System.out.println(ret);
    }
}
