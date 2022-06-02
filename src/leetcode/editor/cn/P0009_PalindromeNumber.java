/**
 * Author: Deean
 * Date: 2022-06-01 23:18:47
 * LastEditTime: 2022-06-01 23:18:47
 * Description: 9. 回文数
 */

package leetcode.editor.cn;

public class P0009_PalindromeNumber {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(int x) {
            String reversedStr = (new StringBuilder(x + "")).reverse().toString();
            return (x + "").equals(reversedStr);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        Solution s = new P0009_PalindromeNumber().new Solution();
        System.out.println(s.isPalindrome(123));
    }
}