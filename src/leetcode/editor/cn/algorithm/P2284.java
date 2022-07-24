package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-24 23:26
 * LastEditTime: 2022-07-24 23:26
 * Description: 2284. 最多单词数的发件人
 */

public class P2284 {
    // code beginning
    class Solution {
        public String largestWordCount(String[] messages, String[] senders) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < messages.length; i++) {
                int count = messages[i].split(" ").length;
                map.put(senders[i], map.getOrDefault(senders[i], 0) + count);
            }
            List<String> sender = new ArrayList<>(map.keySet());
            sender.sort((o1, o2) -> {
                if (!map.get(o1).equals(map.get(o2))) {
                    return map.get(o2) - map.get(o1);
                } else {
                    return o2.compareTo(o1);
                }
            });
            return sender.get(0);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2284().new Solution();
        Object ans = s.largestWordCount(new String[]{"How is leetcode for everyone", "Leetcode is useful for practice"}, new String[]{"Bob", "Charlie"});
        System.out.println(ans);
    }
}