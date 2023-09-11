package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2022-07-23 13:30
 * LastEditTime: 2022-07-23 13:30
 * Description: 1860. 增长的内存泄露
 */

public class P1860 {
    // code beginning
    class Solution {
        public int[] memLeak(int memory1, int memory2) {
            // [crashTime, memory1crash, memory2crash]，
            // 其中crashTime是程序意外退出的时间（单位为秒），
            // memory1crash和memory2crash分别是两个内存条最后剩余内存的位数。
            int time = 1;
            while (memory1 >= time || memory2 >= time) {
                if (memory1 >= memory2) {
                    memory1 -= time;
                } else {
                    memory2 -= time;
                }
                time++;
            }
            return new int[]{time, memory1, memory2};
        }
    }

    public static void main(String[] args) {
        Solution s = new P1860().new Solution();
        int[] ans = s.memLeak(8, 11);
        System.out.println(Arrays.toString(ans));
    }
}