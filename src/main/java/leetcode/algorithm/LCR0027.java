package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Deean
 * Date: 2023-09-28 23:27
 * FileName: src/main/java/leetcode/algorithm
 * Description:LCR 027. 回文链表
 */

public class LCR0027 {
    // code beginning
    class Solution {
        public boolean isPalindrome(ListNode head) {
            List<Integer> values = new ArrayList<>();
            while (head != null) {
                values.add(head.val);
                head = head.next;
            }
            for (int i = 0, n = values.size(); i < n / 2; i++) {
                if (!values.get(i).equals(values.get(n - 1 - i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new LCR0027().new Solution();
        var ans = s.isPalindrome(new ListNode("[1,2,3,3,2,1]"));
        System.out.println(ans);
    }
}
