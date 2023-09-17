package leetcode.interview;

/**
 * Author: Deean
 * Date: 2023-09-17 15:00
 * FileName: src/main/java/leetcode/interview
 * Description:面试题 17.11. 单词距离
 */

public class M00170011 {
    // code beginning
    class Solution {
        public int findClosest(String[] words, String word1, String word2) {
            int minimum = words.length, index1 = -1, index2 = -1;
            for (int i = 0, n = minimum; i < n; i++) {
                String word = words[i];
                if (word.equals(word1)) {
                    index1 = i;
                } else if (word.equals(word2)) {
                    index2 = i;
                }
                if (index1 >= 0 && index2 >= 0) {
                    minimum = Math.min(minimum, Math.abs(index1 - index2));
                }
            }
            return minimum;
        }
    }

    public static void main(String[] args) {
        Solution s = new M00170011().new Solution();
        var ans = s.findClosest(new String[]{"I","am","a","student","from","a","university","in","a","city"},
                "a", "student");
        System.out.println(ans);
    }
}
