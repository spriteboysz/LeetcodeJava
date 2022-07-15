package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-15 23:50
 * LastEditTime: 2022-07-15 23:50
 * Description: 2129. 将标题首字母大写
 */

public class P2129 {
    // code beginning
    class Solution {
        public String capitalizeTitle(String title) {
            String[] words = title.split(" ");
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].toLowerCase();
                if (words[i].length() > 2) {
                    words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
                }
            }
            return String.join(" ", words);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2129().new Solution();
        Object ans = s.capitalizeTitle("First leTTeR of EACH Word");
        System.out.println(ans);
    }
}