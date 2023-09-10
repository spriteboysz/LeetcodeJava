package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-08 21:03
 * FileName: src/leetcode/algorithm
 * Description:2515. 到目标字符串的最短距离
 */

public class P2515 {
    // code beginning
    class Solution {
        public int closetTarget(String[] words, String target, int startIndex) {
            int n = words.length, minimum = words.length;
            for (int i = 0; i < n; i++) {
                if (words[i].equals(target)) {
                    int t1 = Math.abs(startIndex - i);
                    int t2 = n - t1;
                    minimum = Math.min(minimum, Math.min(t1, t2));
                }
            }
            return (minimum == n ? -1 : minimum);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2515().new Solution();
        var ans = s.closetTarget(new String[]{"hello", "i", "am", "leetcode", "hello"}, "hello", 1);
        System.out.println(ans);
    }
}
