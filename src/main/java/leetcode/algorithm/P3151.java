package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-02 10:25
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3151. 特殊数组 I
 */

public class P3151 {
    // code beginning
    class Solution {
        public boolean isArraySpecial(int[] nums) {
            StringBuilder ss = new StringBuilder();
            for (int num : nums) {
                ss.append(num % 2);
            }
            return ss.indexOf("11") == -1 && ss.indexOf("00") == -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3151().new Solution();
        var ans = s.isArraySpecial(new int[]{2, 1, 4});
        System.out.println(ans);
    }
}
