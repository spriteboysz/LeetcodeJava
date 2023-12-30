package leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-12-30 19:49
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2951. 找出峰值
 */

public class P2951 {
    // code beginning
    class Solution {
        public List<Integer> findPeaks(int[] mountain) {
            List<Integer> peaks = new ArrayList<>();
            for (int i = 1; i < mountain.length - 1; i++) {
                if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                    peaks.add(i);
                }
            }
            return peaks;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2951().new Solution();
        var ans = s.findPeaks(new int[]{1, 4, 3, 8, 5});
        System.out.println(ans);
    }
}
