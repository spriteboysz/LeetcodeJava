package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-19 21:43
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 228. 汇总区间
 */

public class P0228 {
    // code beginning
    class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> ranges = new ArrayList<>();
            int n = nums.length;
            for (int i = 0; i < n; ) {
                int left = i;
                do {
                    i++;
                } while (i < n && nums[i] == nums[i - 1] + 1);
                int right = i - 1;
                StringBuilder builder = new StringBuilder(String.valueOf(nums[left]));
                if (left < right) builder.append("->").append(nums[right]);
                ranges.add(builder.toString());
            }
            return ranges;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0228().new Solution();
        Object ans = s.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9});
        System.out.println(ans);
    }
}