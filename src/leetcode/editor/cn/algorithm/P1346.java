package leetcode.editor.cn.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-11 22:00
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1346. 检查整数及其两倍数是否存在
 */

public class P1346 {
    // code beginning
    class Solution {
        public boolean checkIfExist(int[] arr) {
            Set<Integer> set = new HashSet<>();
            int count = 0;
            for (int num : arr) {
                if (num == 0) {
                    count++;
                } else {
                    set.add(num);
                }
            }
            if (count >= 2) return true;
            for (int num : set) {
                if (set.contains(num * 2)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1346().new Solution();
        Object ans = s.checkIfExist(new int[]{10, 2, 5, 3});
        System.out.println(ans);
        ans = s.checkIfExist(new int[]{-2, 0, 10, -19, 4, 6, -8});
        System.out.println(ans);
    }
}