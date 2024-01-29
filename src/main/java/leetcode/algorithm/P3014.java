package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-01-28 14:32
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3014. 输入单词需要的最少按键次数 I
 */

public class P3014 {
    // code beginning
    class Solution {
        public int minimumPushes(String word) {
            int k = word.length() / 8;
            return (k * 4 + word.length() % 8) * (k + 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new P3014().new Solution();
        var ans = s.minimumPushes("xycdefghij");
        System.out.println(ans);
    }
}
