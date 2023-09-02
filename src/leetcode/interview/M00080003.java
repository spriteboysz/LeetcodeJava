package leetcode.interview;

/**
 * Author: Deean
 * Date: 2022-07-15 22:54
 * LastEditTime: 2022-07-15 22:54
 * Description: 面试题 08.03. 魔术索引
 */

public class M00080003 {
    // code beginning
    class Solution {
        public int findMagicIndex(int[] nums) {
            int index = 0;
            while (index < nums.length) {
                if (nums[index] == index) {
                    return index;
                } else if (nums[index] > index) {
                    index = nums[index];
                } else {
                    index++;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00080003().new Solution();
        Object ans = s.findMagicIndex(new int[]{0, 2, 3, 4, 5});
        System.out.println(ans);
    }
}