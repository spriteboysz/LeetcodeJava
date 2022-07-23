package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-23 13:18
 * LastEditTime: 2022-07-23 13:18
 * Description: 1641. 统计字典序元音字符串的数目
 */

public class P1641 {
    // code beginning
    class Solution {
        int count = 0;

        public int countVowelStrings(int n) {
            backtrace(0, 0, n);
            return count;
        }

        private void backtrace(int cur, int start, int n) {
            if (cur == n) {
                count++;
                return;
            }
            for (int i = start; i < 5; i++) {
                backtrace(cur + 1, i, n);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P1641().new Solution();
        Object ans = s.countVowelStrings(33);   // 66045
        System.out.println(ans);
    }
}