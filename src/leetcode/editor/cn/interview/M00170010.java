package leetcode.editor.cn.interview;

/**
 * Author: Deean
 * Date: 2022-07-12 23:13
 * LastEditTime: 2022-07-12 23:13
 * Description: 面试题 17.10. 主要元素
 */

public class M00170010 {
    // code beginning
    class Solution {
        public int majorityElement(int[] nums) {
            int x = -1, count = 0;
            for (int num : nums) {
                if (count == 0) {
                    x = num;
                    count = 1;
                } else {
                    count += (x == num) ? 1 : -1;
                }
            }
            count = 0;
            for (int num : nums) {
                if (num == x) count++;
            }
            return count > nums.length / 2 ? x : -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00170010().new Solution();
        Object ans = s.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        System.out.println(ans);
    }
}