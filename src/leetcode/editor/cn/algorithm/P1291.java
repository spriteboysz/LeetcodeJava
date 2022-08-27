package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-27 22:32
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 1291. 顺次数
 */

public class P1291 {
    // code beginning
    class Solution {
        public List<Integer> sequentialDigits(int low, int high) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < 10; i++) {
                int num = i;
                for (int j = i + 1; j < 10; j++) {
                    num = num * 10 + j;
                    if (num >= low && num <= high) {
                        list.add(num);
                    }
                    if (num > high) break;
                }
            }
            Collections.sort(list);
            return list;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1291().new Solution();
        Object ans = s.sequentialDigits(1000, 13000);
        System.out.println(ans);
    }
}