/**
 * Author: Deean
 * Date: 2022-06-02 22:59:07
 * LastEditTime: 2022-06-02 22:59:07
 * Description: 0014. 最长公共前缀
 */

package leetcode.editor.cn;

public class P0014_LongestCommonPrefix {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) {
                return "";
            }
            int length = strs[0].length();
            int count = strs.length;
            for (int i = 0; i < length; i++) {
                char c = strs[0].charAt(i);
                for (int j = 1; j < count; j++) {
                    if (i == strs[j].length() || strs[j].charAt(i) != c) {
                        return strs[0].substring(0, i);
                    }
                }
            }
            return strs[0];
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
    public static void main(String[] args) {
        Solution s = new P0014_LongestCommonPrefix().new Solution();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(s.longestCommonPrefix(strs));

    }
}