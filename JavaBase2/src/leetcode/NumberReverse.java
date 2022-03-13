package leetcode;/**
 * Created by Administrator on 2021/4/9.
 */

/**
 * @Author liwenming
 * @Description 整数反转
 * @Date 2021/4/9 11:37
 **/
public class NumberReverse {

    public static int reverse(int x){
        String xStr = String.valueOf(x);
        if (x < 0){
            xStr = xStr.substring(1, xStr.length());
        }
        String xReverseStr = new StringBuilder(xStr).reverse().toString();
        if (x < 0){
            xReverseStr = "-" + xReverseStr;
        }
        int ret;
        try
        {
            ret = Integer.parseInt(xReverseStr);
        }catch (Exception e){
            ret = 0;
        }
        return ret;
    }

    public static void main(String[] args) {
        int x = 1534236469;
        int ret = reverse(x);
        System.out.println(ret);
    }
}
