package leetcode.algorithm;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2023-09-16 15:42
 * FileName: src/main/java/leetcode/algorithm
 * Description:82. 删除排序链表中的重复元素 II
 */

public class P0082 {
    // code beginning
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) return null;
            ListNode cur = head;
            Map<Integer, Integer> hash = new HashMap<>();
            while (cur != null) {
                hash.put(cur.val, hash.getOrDefault(cur.val, 0) + 1);
                cur = cur.next;
            }
            cur = head;
            List<ListNode> nodes = new ArrayList<>();
            while (cur != null) {
                if (hash.get(cur.val) == 1) {
                    nodes.add(cur);
                }
                cur = cur.next;
            }
            if (nodes.isEmpty()) return null;
            for (int i = 0, n = nodes.size(); i < n - 1; i++) {
                nodes.get(i).next = nodes.get(i + 1);
            }
            nodes.get(nodes.size() - 1).next = null;
            return nodes.get(0);
        }
    }

    public static void main(String[] args) {
        Solution s = new P0082().new Solution();
        var ans = s.deleteDuplicates(new ListNode("[1,2,3,3,4,4,5]"));
        System.out.println(ans);
    }
}
