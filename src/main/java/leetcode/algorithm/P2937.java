package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-12-30 20:10
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2937. 使三个字符串相等
 */

public class P2937 {
    // code beginning
    class Solution {
        public int findMinimumOperations(String s1, String s2, String s3) {
            int common = 0;
            for (int i = 0; i < s1.length() && i < s2.length() && i < s3.length(); i++) {
                if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)) {
                    common++;
                } else {
                    break;
                }
            }
            if (common == 0) {
                return -1;
            } else {
                return s1.length() + s2.length() + s3.length() - common * 3;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P2937().new Solution();
        var ans = s.findMinimumOperations("abc", "abb", "ab");
        System.out.println(ans);
    }
}
