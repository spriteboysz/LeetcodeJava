package leetcode.LCP;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-30 21:06
 * FileName: src/main/java/leetcode/LCP
 * Description:LCR 123. 图书整理 I
 */

public class LCR0123 {
    // code beginning
    class Solution {
        public int[] reverseBookList(ListNode head) {
            if (head == null) return new int[]{};
            List<Integer> nodes = new ArrayList<>();
            while (head != null) {
                nodes.add(head.val);
                head = head.next;
            }
            int[] list = new int[nodes.size()];
            for (int i = 0, n = nodes.size(); i < n; i++) {
                list[i] = nodes.get(n - 1 - i);
            }
            return list;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0123().new Solution();
        var ans = s.reverseBookList(new ListNode("[3,6,4,1]"));
        System.out.println(Arrays.toString(ans));
    }
}
