package leetcode.LCP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-27 23:00
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 007. 三数之和
 */

public class LCR0007 {
    // code beginning
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> ans = new ArrayList<>();
            for (int first = 0, n = nums.length; first < n; ++first) {
                if (first > 0 && nums[first] == nums[first - 1]) {
                    continue;
                }
                int third = n - 1;
                int target = -nums[first];
                for (int second = first + 1; second < n; ++second) {
                    if (second > first + 1 && nums[second] == nums[second - 1]) {
                        continue;
                    }
                    while (second < third && nums[second] + nums[third] > target) {
                        --third;
                    }
                    if (second == third) {
                        break;
                    }
                    if (nums[second] + nums[third] == target) {
                        List<Integer> list = Arrays.asList(nums[first], nums[second], nums[third]);
                        ans.add(list);
                    }
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0007().new Solution();
        var ans = s.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(ans);
    }
}
