package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-01 22:06
 * LastEditTime: 2022-07-01 22:06
 * Description: 1389. 按既定顺序创建目标数组
 */

public class P1389 {
    // code beginning
    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(index[i], nums[i]);
            }
            int[] target = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                target[i] = list.get(i);
            }
            return target;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1389().new Solution();
        int[] ans = s.createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0});
        System.out.println(Arrays.toString(ans));
    }
}