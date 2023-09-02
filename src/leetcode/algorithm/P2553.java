package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 11:00
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 2553. 分割数组中数字的数位
 */

public class P2553 {
    // code beginning
    class Solution {
        public int[] separateDigits(int[] nums) {
            StringBuilder sb = new StringBuilder();
            for (int num : nums) {
                sb.append(num);
            }
            int[] separate = new int[sb.length()];
            for (int i = 0; i < sb.length(); i++) {
                separate[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));
            }
            return separate;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2553().new Solution();
        Object ans = s.separateDigits(new int[]{13, 25, 83, 77});
        System.out.println(ans);
    }
}
