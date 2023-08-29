package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-07-24 16:56
 * LastEditTime: 2022-07-24 16:56
 * Description: 811. 子域名访问计数
 */

public class P0811 {
    // code beginning
    class Solution {
        public List<String> subdomainVisits(String[] cpdomains) {
            Map<String, Integer> map = new HashMap<>();
            for (String cpdomain : cpdomains) {
                String[] info = cpdomain.split(" ");
                String[] domain = info[1].split("\\.");
                StringBuilder builder = new StringBuilder();
                for (int i = domain.length - 1; i >= 0; i--) {
                    builder.insert(0, domain[i] + ".");
                    String key = builder.subSequence(0, builder.length() - 1).toString();
                    map.put(key, map.getOrDefault(key, 0) + Integer.parseInt(info[0]));
                }
            }
            // System.out.println(map);
            List<String> visits = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                visits.add(entry.getValue() + " " + entry.getKey());
            }
            return visits;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0811().new Solution();
        Object ans = s.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
        System.out.println(ans);
    }
}