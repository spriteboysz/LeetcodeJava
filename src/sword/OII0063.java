package sword;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-20 22:22
 * LastEditTime: 2022-07-20 22:22
 * Description: 剑指 Offer II 063. 替换单词
 */

public class OII0063 {
    // code beginning
    class Solution {
        public String replaceWords(List<String> dictionary, String sentence) {
            HashMap<String, String> hashMap = new HashMap<>();
            dictionary.sort((o1, o2) -> o2.length() - o1.length());
            String[] words = sentence.split(" ");
            for (String word : words) {
                if (!hashMap.containsKey(word)) {
                    for (String root : dictionary) {
                        if (word.startsWith(root)) {
                            hashMap.put(word, root);
                        }
                    }
                }
            }

            StringBuilder builder = new StringBuilder();
            for (String word : words) {
                builder.append(hashMap.getOrDefault(word, word)).append(" ");
            }
            return builder.toString().trim();
        }
    }

    public static void main(String[] args) {
        Solution s = new OII0063().new Solution();
        Object ans = s.replaceWords(new ArrayList<>(List.of(new String[]{"catt", "cat", "bat", "rat"})), "the cattle " +
                "was rattled by the battery");
        System.out.println(ans);
        ans = s.replaceWords(new ArrayList<>(List.of(new String[]{"a", "aa", "aaa", "aaaa"})), "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa");
        System.out.println(ans);
    }
}