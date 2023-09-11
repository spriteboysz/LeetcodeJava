package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-16 00:01
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 944. 删列造序
 */

public class P0944 {
    // code beginning
    class Solution {
        public int minDeletionSize(String[] strs) {
            int count = 0;
            for (int j = 0; j < strs[0].length(); j++) {
                for (int i = 1; i < strs.length; i++) {
                    if (strs[i - 1].charAt(j) > strs[i].charAt(j)) {
                        count++;
                        break;
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0944().new Solution();
        Object ans = s.minDeletionSize(new String[]{"zyx", "wvu", "tsr"});
        System.out.println(ans);
    }
}