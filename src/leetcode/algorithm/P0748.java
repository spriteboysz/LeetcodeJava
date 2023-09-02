package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-04 23:39
 * Description: 748. 最短补全词
 */

public class P0748 {
    // code beginning
    class Solution {
        public String shortestCompletingWord(String licensePlate, String[] words) {
            int[] count = getCount(licensePlate);
            String shortest = null;
            for (String s : words) {
                int[] cur = getCount(s);
                boolean flag = true;
                for (int i = 0; i < 26; i++) {
                    if (count[i] > cur[i]) {
                        flag = false;
                        break;
                    }
                }
                if (flag && (shortest == null || shortest.length() > s.length())) shortest = s;
            }
            return shortest;
        }

        private int[] getCount(String s) {
            int[] cnt = new int[26];
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) cnt[Character.toLowerCase(c) - 'a']++;
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0748().new Solution();
        Object ans = s.shortestCompletingWord("1s3 456", new String[]{"looks", "pest", "stew", "show"});
        System.out.println(ans);
    }
}
