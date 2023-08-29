package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-19 23:51
 * FileName: src/leetcode/editor/cn/interview
 * Description: 面试题 08.06. 汉诺塔问题
 */

public class M00080006 {
    // code beginning
    class Solution {
        public void hanota(List<Integer> a, List<Integer> b, List<Integer> c) {
            process(a.size(), a, b, c);
        }

        private void process(int size, List<Integer> start, List<Integer> other, List<Integer> end) {
            if (size == 1) {
                end.add(start.remove(start.size() - 1));
            } else {
                process(size - 1, start, end, other);
                end.add(start.remove(start.size() - 1));
                process(size - 1, other, start, end);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new M00080006().new Solution();
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(1);
        a.add(0);
        s.hanota(a, new ArrayList<>(), new ArrayList<>());
    }
}