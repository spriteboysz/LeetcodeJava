package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-03 16:03
 * LastEditTime: 2022-07-03 16:03
 * Description: 1370. 上升下降字符串
 */

public class P1370 {
    // code beginning
    class Solution {
        public String sortString(String s) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            int i = s.length();
            StringBuilder sb = new StringBuilder();
            while (i > 0) {
                for (int j = 0; j < 26; j++) {
                    if (count[j] > 0) {
                        sb.append(Character.toString('a' + j));
                        i--;
                        count[j]--;
                    }
                }
                for (int j = 25; j >= 0; j--) {
                    if (count[j] > 0) {
                        sb.append(Character.toString('a' + j));
                        i--;
                        count[j]--;
                    }
                }
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1370().new Solution();
        Object ans = s.sortString("leetcode");
        System.out.println(ans);    //cdelotee
        ans = s.sortString("spo");
        System.out.println(ans);    // ops
    }
}