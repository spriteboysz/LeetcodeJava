package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-06 23:39
 * LastEditTime: 2022-07-06 23:39
 * Description: 303. 区域和检索 - 数组不可变
 */

public class P0303 {
    // code beginning
    class NumArray {
        int[] sums;

        public NumArray(int[] nums) {
            sums = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                sums[i + 1] = sums[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return sums[right + 1] - sums[left];
        }
    }

    public static void main(String[] args) {
        NumArray numArray = new P0303().new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }
}