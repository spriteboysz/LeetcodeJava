package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-25 23:42
 * LastEditTime: 2022-07-25 23:42
 * Description: 1010. 总持续时间可被 60 整除的歌曲
 */

public class P1010 {
    // code beginning
    class Solution {
        public int numPairsDivisibleBy60(int[] time) {
            int[] arr = new int[60];
            for (int t : time) arr[t % 60]++;
            long count = 0;
            for (int i = 1; i < 30; i++) {
                count += (long) arr[i] * arr[60 - i];
            }
            count += (long) arr[0] * (arr[0] - 1) / 2;
            count += (long) arr[30] * (arr[30] - 1) / 2;
            return (int) count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1010().new Solution();
        Object ans = s.numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40});
        System.out.println(ans);
    }
}