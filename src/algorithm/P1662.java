package algorithm;

/**
 * Author: Deean
 * Date: 2022-06-26 17:26
 * LastEditTime: 2022-06-26 17:26
 * Description: .
 */

public class P1662 {
    // code beginning
    class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (String word : word1) {
                sb1.append(word);
            }
            for (String word : word2) {
                sb2.append(word);
            }
            return sb1.toString().contentEquals(sb2);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1662().new Solution();
        Object ans = s.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"});
        System.out.println(ans);
    }
}