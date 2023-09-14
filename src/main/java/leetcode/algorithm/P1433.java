package leetcode.algorithm;

import java.util.Arrays;

/**
 * Author: Deean
 * Date: 2023-09-13 22:54
 * FileName: src/main/java/leetcode/algorithm
 * Description:1433. 检查一个字符串是否可以打破另一个字符串
 */

public class P1433 {
    // code beginning
    class Solution {
        public boolean checkIfCanBreak(String s1, String s2) {
            char[] arr1 = s1.toCharArray(), arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int greater = 0, less = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (arr1[i] > arr2[i]) {
                    greater++;
                } else if (arr1[i] < arr2[i]) {
                    less++;
                }
            }
            return greater == 0 || less == 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1433().new Solution();
        var ans = s.checkIfCanBreak("abc", "xya");
        System.out.println(ans);
    }
}
