package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-11 22:50
 * LastEditTime: 2022-07-11 22:50
 * Description: 676. 实现一个魔法字典
 */

public class P0676 {
    // code beginning
    class MagicDictionary {
        String[] words;

        public MagicDictionary() {

        }

        public void buildDict(String[] dictionary) {
            words = dictionary;
        }

        public boolean search(String searchWord) {
            for (String word : words) {
                if (word.length() != searchWord.length()) continue;
                int diff = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) != searchWord.charAt(i)) {
                        diff++;
                        if (diff > 1) break;
                    }
                }
                if (diff == 1) return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        MagicDictionary magicDictionary = new P0676().new MagicDictionary();
        magicDictionary.buildDict(new String[]{"hello", "leetcode"});
        System.out.println(magicDictionary.search("hello")); // 返回 False
        System.out.println(magicDictionary.search("hhllo")); // 将第二个 'h' 替换为 'e' 可以匹配 "hello" ，所以返回 True
        System.out.println(magicDictionary.search("hell")); // 返回 False
        System.out.println(magicDictionary.search("leetcoded")); // 返回 False
    }
}