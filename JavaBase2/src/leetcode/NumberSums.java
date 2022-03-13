package leetcode;/**
 * Created by Administrator on 2021/3/30.
 */

/**
 * @Author liwenming
 * @Description 两数之和
 * @Date 2021/3/30 23:01
 **/
public class NumberSums {

    public static int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        boolean over = false;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                int tmp = nums[i] + nums[j];
                if (tmp == target){
                    ret[0] = i;
                    ret[1] = j;
                    over = true;
                    break;
                }
            }
            if (over == true){
                break;
            }
        }
        return ret;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] ret = new int[2];
        boolean over = false;
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < nums.length - i; j++){
                int a = nums[j];
                int b = nums[j + i];
                System.out.println("j = " + j + ", j + i = " + (j + i ));
                int temp = a + b;
                if (temp == target){
                    ret[0] = j;
                    ret[1] = j + i;
                    over = true;
                    break;
                }
            }
            if (over == true){
                break;
            }
        }
        return ret;
    }

    /**
     * 标准答案1：暴力求解
     */
    public static int[] twoSum3(int[] nums, int target){
        int len = nums.length;
        for(int i = 0; i < len - 1; i++){
            for(int j = i + 1; j < len; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 11, 15, 12, 13, 14};
        int target = 9;
//        int ret[] = twoSum(nums, target);
//        int ret[] = twoSum2(nums, target);
        int ret[] = twoSum3(nums, target);
     }
}
