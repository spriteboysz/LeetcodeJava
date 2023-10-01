package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2023-09-29 22:55
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 070. 有序数组中的单一元素
 */

public class LCR0070 {
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
        Solution s = new LCR0070().new Solution();
        var ans = s.singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8});
        System.out.println(ans);
        System.out.println(s.singleNonDuplicate(new int[]{0, 1, 1}));
    }
}
