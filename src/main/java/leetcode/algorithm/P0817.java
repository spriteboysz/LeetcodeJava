package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2023-09-17 21:37
 * FileName: src/main/java/leetcode/algorithm
 * Description:817. 链表组件
 */

public class P0817 {
    // code beginning
    class Solution {
        public int numComponents(ListNode head, int[] nums) {
            Set<Integer> seen = new HashSet<>();
            for (int num : nums) {
                seen.add(num);
            }
            int cnt = 0, flag = 0;
            while (head != null) {
                if (seen.contains(head.val)) {
                    if (flag == 0) {
                        cnt++;
                        flag = 1;
                    }
                } else {
                    flag = 0;
                }
                head = head.next;
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0817().new Solution();
        var ans = s.numComponents(new ListNode("[0,1,2,3,4]"), new int[]{0, 3, 1, 4});
        System.out.println(ans);
    }
}
