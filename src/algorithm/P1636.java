package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-15 00:02
 * LastEditTime: 2022-07-15 00:02
 * Description: 1636. 按照频率将数组升序排序
 */

public class P1636 {
    // code beginning
    class Solution {
        public int[] frequencySort(int[] nums) {
            int[] frequency = new int[201];
            for (int num : nums) {
                frequency[num + 100]++;
            }
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            list.sort((o1, o2) -> {
                if (frequency[o1 + 100] != frequency[o2 + 100]) {
                    return frequency[o1 + 100] - frequency[o2 + 100];
                } else {
                    return o2 - o1;
                }
            });
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    public static void main(String[] args) {
        Solution s = new P1636().new Solution();
        int[] ans = s.frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1});
        System.out.println(Arrays.toString(ans));
    }
}