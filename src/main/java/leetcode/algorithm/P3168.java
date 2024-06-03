package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-03 22:06
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3168. 候诊室中的最少椅子数
 */

public class P3168 {
    // code beginning
    class Solution {
        public int minimumChairs(String s) {
            int maximum = 0, cur = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'E') {
                    cur += 1;
                } else {
                    cur -= 1;
                }
                maximum = Math.max(maximum, cur);
            }
            return maximum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3168().new Solution();
        var ans = s.minimumChairs("ELELEEL");
        System.out.println(ans);
    }
}
