package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-29 00:19
 * LastEditTime: 2022-07-29 00:19
 * Description: 540. 有序数组中的单一元素
 */

public class P0540 {
    // code beginning
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            int single = 0;
            for (int num : nums) {
                single ^= num;
            }
            return single;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0540().new Solution();
        Object ans = s.singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11});
        System.out.println(ans);
    }
}