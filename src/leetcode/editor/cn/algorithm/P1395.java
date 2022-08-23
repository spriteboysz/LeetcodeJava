package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-23 23:10
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1395. 统计作战单位数
 */

public class P1395 {
    // code beginning
    class Solution {
        public int numTeams(int[] rating) {
            int count = 0;
            for (int i = 0; i < rating.length; i++) {
                for (int j = i + 1; j < rating.length; j++) {
                    for (int k = j + 1; k < rating.length; k++) {
                        if (rating[i] < rating[j] && rating[j] < rating[k] || rating[k] < rating[j] && rating[j] < rating[i]) {
                            count++;
                        }
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1395().new Solution();
        Object ans = s.numTeams(new int[]{1, 2, 3, 4});
        System.out.println(ans);
    }
}