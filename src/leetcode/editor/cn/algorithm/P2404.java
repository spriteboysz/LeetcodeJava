package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 22:14
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2404. 出现最频繁的偶数元素
 */

public class P2404 {
    // code beginning
    class Solution {
        public int mostFrequentEven(int[] nums) {
            int[] count = new int[100005];
            int max = -1;
            for (int num : nums) {
                if (num % 2 == 0) {
                    count[num] += 1;
                    max = Math.max(max, count[num]);
                }
            }

            for (int i = 0; i < count.length; i++) {
                if (count[i] == max) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2404().new Solution();
        Object ans = s.mostFrequentEven(new int[]{0, 1, 2, 2, 4, 4, 1});
        System.out.println(ans);
    }
}
