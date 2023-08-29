package algorithm;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Author: Deean
 * Date: 2022-07-17 22:50
 * LastEditTime: 2022-07-17 22:50
 * Description: 382. 链表随机节点
 */

public class P0382 {
    // code beginning
    class Solution {
        List<Integer> values;
        Random random = new Random();

        public Solution(ListNode head) {
            values = new ArrayList<>();
            ListNode cur = head;
            while (cur != null) {
                values.add(cur.val);
                cur = cur.next;
            }
        }

        public int getRandom() {
            return values.get(random.nextInt(values.size()));
        }
    }

    public static void main(String[] args) {
        Solution solution = new P0382().new Solution(new ListNode(new int[]{1, 2, 3}));
        System.out.println(solution.getRandom()); // 返回 1
        System.out.println(solution.getRandom()); // 返回 3
        System.out.println(solution.getRandom()); // 返回 2
        System.out.println(solution.getRandom()); // 返回 2
        System.out.println(solution.getRandom()); // 返回 3
    }
}