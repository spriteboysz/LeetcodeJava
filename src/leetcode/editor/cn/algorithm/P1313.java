package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-06-30 23:45
 * LastEditTime: 2022-06-30 23:45
 * Description: 1313. 解压缩编码列表
 */

public class P1313 {
    // code beginning
    class Solution {
        public int[] decompressRLElist(int[] nums) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i += 2) {
                for (int j = 0; j < nums[i]; j++) {
                    list.add(nums[i + 1]);
                }
            }
            int[] arr = new int[list.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = list.get(i);
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1313().new Solution();
        int[] ans = s.decompressRLElist(new int[]{1, 1, 2, 3});
        System.out.println(Arrays.toString(ans));
    }
}