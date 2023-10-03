package leetcode.LCP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-10-01 19:54
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 180. 文件组合
 */

public class LCR0180 {
    // code beginning
    class Solution {
        public int[][] fileCombination(int target) {
            List<int[]> vec = new ArrayList<>();
            for (int left = 1, right = 2; left < right; ) {
                int sum = (left + right) * (right - left + 1) / 2;
                if (sum == target) {
                    int[] res = new int[right - left + 1];
                    for (int i = left; i <= right; i++) {
                        res[i - left] = i;
                    }
                    vec.add(res);
                    left++;
                } else if (sum < target) {
                    right++;
                } else {
                    left++;
                }
            }
            return vec.toArray(new int[vec.size()][]);
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0180().new Solution();
        var ans = s.fileCombination(18);
        System.out.println(Arrays.deepToString(ans));
    }
}
