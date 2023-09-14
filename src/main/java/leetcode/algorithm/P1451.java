package leetcode.algorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Author: Deean
 * Date: 2023-09-13 22:46
 * FileName: src/main/java/leetcode/algorithm
 * Description:1451. 重新排列句子中的单词
 */

public class P1451 {
    // code beginning
    class Solution {
        public String arrangeWords(String text) {
            String[] words = text.toLowerCase().split(" ");
            Arrays.sort(words, Comparator.comparingInt(String::length));
            words[0] = words[0].substring(0, 1).toUpperCase() + words[0].substring(1);
            return String.join(" ", words);
        }
    }

    public static void main(String[] args) {
        Solution s = new P1451().new Solution();
        var ans = s.arrangeWords("To be or not to be");
        System.out.println(ans);
    }
}
