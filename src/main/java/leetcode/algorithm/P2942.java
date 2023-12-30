package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-12-30 19:56
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2942. 查找包含给定字符的单词
 */

public class P2942 {
    // code beginning
    class Solution {
        public List<Integer> findWordsContaining(String[] words, char x) {
            List<Integer> index = new ArrayList<>();
            for (int i = 0; i < words.length; i++) {
                if (words[i].contains(String.valueOf(x))) {
                    index.add(i);
                }
            }
            return index;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2942().new Solution();
        var ans = s.findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a');
        System.out.println(ans);
    }
}
