package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-21 14:42
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 648. 单词替换
 */

public class P0648 {
    // code beginning
    class Solution {
        public String replaceWords(List<String> dictionary, String sentence) {
            dictionary.sort(Comparator.comparingInt(String::length));
            String[] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                for (String item : dictionary) {
                    if (words[i].startsWith(item)) {
                        words[i] = item;
                        break;
                    }
                }
            }
            return String.join(" ", words);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0648().new Solution();
        Object ans = s.replaceWords(new ArrayList<>(List.of(new String[]{"cat", "bat", "rat"})), "the cattle was" +
                " " +
                "rattled by the battery");
        System.out.println(ans);
    }
}