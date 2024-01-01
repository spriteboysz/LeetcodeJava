package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-12-31 22:36
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2899. 上一个遍历的整数
 */

public class P2899 {
    // code beginning
    class Solution {
        public List<Integer> lastVisitedIntegers(List<String> words) {
            List<Integer> last = new ArrayList<>();
            List<Integer> nums = new ArrayList<>();
            int k = 0;
            for (String word : words) {
                if (word.charAt(0) != 'p') {
                    nums.add(Integer.parseInt(word));
                    k = 0;
                } else {
                    last.add(++k > nums.size() ? -1 : nums.get(nums.size() - k));
                }
            }
            return last;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2899().new Solution();
        List<String> words = new ArrayList<>();
        words.add("1");
        words.add("2");
        words.add("prev");
        words.add("prev");
        words.add("prev");
        var ans = s.lastVisitedIntegers(words);
        System.out.println(ans);
    }
}
