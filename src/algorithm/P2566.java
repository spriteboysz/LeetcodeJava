package algorithm;

/**
 * Author: Deean
 * Date: 2023-02-25 22:40
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: P2566. 替换一个数字后的最大差值
 */

public class P2566 {
    // code beginning
    class Solution {
        public int minMaxDifference(int num) {
            String s = String.valueOf(num);
            String minimum, maximum = s;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c != '9') {
                    maximum = s.replace(String.valueOf(c), "9");
                    break;
                }
            }
            minimum = s.replaceAll(String.valueOf(s.charAt(0)), "0");
            return Integer.parseInt(maximum) - Integer.parseInt(minimum);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2566().new Solution();
        Object ans = s.minMaxDifference(11891);
        System.out.println(ans);
        ans = s.minMaxDifference(9999);
        System.out.println(ans);
    }
}
