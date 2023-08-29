package algorithm;

import java.util.HashMap;

/**
 * Author: Deean
 * Date: 2022-07-03 23:26
 * LastEditTime: 2022-07-03 23:26
 * Description: 1859. 将句子排序
 */

public class P1859 {
    // code beginning
    class Solution {
        public String sortSentence(String s) {
            HashMap<Integer, String> hashMap = new HashMap<>();
            String[] words = s.split(" ");
            for (String word : words) {
                String value = word.substring(0, word.length() - 1);
                int key = Integer.parseInt(word.substring(word.length() - 1));
                hashMap.put(key, value);
            }

            StringBuilder sentence = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                if (hashMap.containsKey(i)) {
                    sentence.append(hashMap.get(i)).append(" ");
                }
            }
            return sentence.toString().trim();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1859().new Solution();
        Object ans = s.sortSentence("Myself2 Me1 I4 and3");
        System.out.println(ans);
    }
}