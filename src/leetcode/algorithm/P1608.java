package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-13 22:20
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1608. 特殊数组的特征值
 */

public class P1608 {
    // code beginning
    class Solution {
        public int specialArray(int[] nums) {
            for (int i = 1; i <= 1000; i++) {
                int count = 0;
                for (int num : nums) {
                    if (num >= i) count++;
                }
                if (count == i) return i;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1608().new Solution();
        Object ans = s.specialArray(new int[]{0, 4, 3, 0, 4});
        System.out.println(ans);
        ans = s.specialArray(new int[]{3, 6, 7, 7, 0});
        System.out.println(ans);
    }
}