package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-10 21:21
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2023. 连接后等于目标字符串的字符串对
 */

public class P2023 {
    // code beginning
    class Solution {
        public int numOfPairs(String[] nums, String target) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (!target.startsWith(nums[i])) continue;
                for (int j = 0; j < nums.length; j++) {
                    if (i != j && target.equals(nums[i] + nums[j])) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2023().new Solution();
        Object ans = s.numOfPairs(new String[]{"1", "1", "1"}, "11");
        System.out.println(ans);
    }
}