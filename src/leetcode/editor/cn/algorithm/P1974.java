package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-10 16:14
 * LastEditTime: 2022-07-10 16:14
 * Description: 1974. 使用特殊打字机键入单词的最少时间
 */

public class P1974 {
    // code beginning
    class Solution {
        public int minTimeToType(String word) {
            int count = 0, cur = 1;
            for (char c : word.toCharArray()) {
                int num = c - 'a' + 1;
                int diff = Math.abs(num - cur);
                count += Math.min(26 - diff, diff) + 1;
                //if (Math.abs(num - cur) >= 26 - Math.abs(num - cur)) {
                //    count += 26 - Math.abs(num - cur) + 1;
                //} else {
                //    count += Math.abs(num - cur) + 1;
                //}
                cur = num;
            }
            return count;

        }
    }

    public static void main(String[] args) {
        Solution s = new P1974().new Solution();
        Object ans = s.minTimeToType("zjpc");
        System.out.println(ans);
    }
}