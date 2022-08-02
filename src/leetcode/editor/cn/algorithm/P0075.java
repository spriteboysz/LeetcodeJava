package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-02 23:37
 * LastEditTime: 2022-08-02 23:37
 * Description: 75. 颜色分类
 */

public class P0075 {
    // code beginning
    class Solution {
        public void sortColors(int[] nums) {
            int[] count = new int[3];
            for (int num : nums) {
                count[num]++;
            }
            for (int index = 0, i = 0; i < 3; i++) {
                for (int j = 0; j < count[i]; j++, index++) {
                    nums[index] = i;
                }
            }
            // System.out.println(Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
        Solution s = new P0075().new Solution();
        s.sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }
}