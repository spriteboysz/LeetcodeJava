package leetcode.LCP;

import java.util.*;

/**
 * Author: Deean
 * Date: 2023-09-30 09:28
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 063. 单词替换
 */

public class LCR0063 {
    // code beginning
    class Solution {
        public String replaceWords(List<String> dictionary, String sentence) {
            Map<String, String> hash = new HashMap<>();
            dictionary.sort(Comparator.comparingInt(String::length));
            String[] words = sentence.split(" ");
            for (int i = 0, n = words.length; i < n; i++) {
                String word = words[i];
                if (hash.containsKey(word)) {
                    words[i] = hash.get(word);
                } else {
                    for (String root : dictionary) {
                        if (word.startsWith(root)) {
                            words[i] = root;
                            hash.put(word, root);
                            break;
                        }
                    }
                }
            }
            return String.join(" ", words);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0063().new Solution();
        List<String> dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");
        var ans = s.replaceWords(dictionary, "the cattle was rattled by the battery");
        System.out.println(ans);
    }
}
