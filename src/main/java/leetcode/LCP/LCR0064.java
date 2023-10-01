package leetcode.LCP;

/**
 * Author: Deean
 * Date: 2023-09-30 09:38
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 064. 实现一个魔法字典
 */

public class LCR0064 {
    // code beginning
    class MagicDictionary {
        private String[] words;

        /**
         * Initialize your data structure here.
         */
        public MagicDictionary() {

        }

        public void buildDict(String[] dictionary) {
            words = dictionary;
        }

        public boolean search(String searchWord) {
            for (String word : words) {
                if (word.length() != searchWord.length()) {
                    continue;
                }
                int diff = 0;
                for (int i = 0; i < word.length(); ++i) {
                    if (word.charAt(i) != searchWord.charAt(i)) {
                        diff += 1;
                        if (diff > 1) {
                            break;
                        }
                    }
                }
                if (diff == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        MagicDictionary dictionary = new LCR0064().new MagicDictionary();
        dictionary.buildDict(new String[]{"hello", "leetcode"});
        System.out.println(dictionary.search("hello"));
        System.out.println(dictionary.search("hhllo"));
        System.out.println(dictionary.search("hell"));
        System.out.println(dictionary.search("leetcoded"));
    }
}
