package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 13:24
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2496. 数组中字符串的最大值
 */

public class P2496 {
    // code beginning
    class Solution {
        public int maximumValue(String[] strs) {
            int maximum = 0;
            for (String str : strs) {
                boolean flag = true;
                for (char c : str.toCharArray()) {
                    if (Character.isLetter(c)) {
                        flag = false;
                        break;
                    }
                }

                int v = flag ? Integer.parseInt(str) : str.length();
                maximum = Math.max(maximum, v);
            }
            return maximum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2496().new Solution();
        Object ans = s.maximumValue(new String[]{"alic3", "bob", "3", "4", "00000"});
        System.out.println(ans);
    }
}
