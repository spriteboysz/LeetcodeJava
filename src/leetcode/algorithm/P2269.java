package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-05 23:46
 * Description: 2269. 找到一个数字的 K 美丽值
 */

public class P2269 {
    // code beginning
    class Solution {
        public int divisorSubstrings(int num, int k) {
            String str = String.valueOf(num);
            int count = 0;
            for (int i = 0; i <= str.length() - k; i++) {
                int cur = Integer.parseInt(str.substring(i, i + k));
                if (cur != 0 && num % cur == 0) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2269().new Solution();
        Object ans = s.divisorSubstrings(430043, 2);
        System.out.println(ans);
    }
}