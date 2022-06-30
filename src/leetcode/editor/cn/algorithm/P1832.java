package leetcode.editor.cn.algorithm;

import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2022-06-30 23:54
 * LastEditTime: 2022-06-30 23:54
 * Description: 1832. 判断句子是否为全字母句
 */

public class P1832 {
    // code beginning
    class Solution {
        public boolean checkIfPangram(String sentence) {
            HashSet<Character> alphabet = new HashSet<>();
            for (int i = 0; i < sentence.length(); i++) {
                alphabet.add(sentence.charAt(i));
                if (alphabet.size() == 26) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1832().new Solution();
        Object ans = s.checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        System.out.println(ans);
    }
}