package leetcode.editor.cn.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Author: Deean
 * Date: 2022-08-28 20:27
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 380. O(1) 时间插入、删除和获取随机元素
 */

public class P0380 {
    // code beginning
    class RandomizedSet {
        static int[] nums;
        Map<Integer, Integer> map;
        Random random = new Random();
        int index;

        public RandomizedSet() {
            nums = new int[200010];
            map = new HashMap<>();
            index = -1;
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) return false;
            nums[++index] = val;
            map.put(val, index);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) return false;
            int loc = map.remove(val);
            if (loc != index) map.put(nums[index], loc);
            nums[loc] = nums[index--];
            return true;
        }

        public int getRandom() {
            return nums[random.nextInt(index + 1)];
        }
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new P0380().new RandomizedSet();
        System.out.println(randomizedSet.insert(1)); // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
        System.out.println(randomizedSet.remove(2)); // 返回 false ，表示集合中不存在 2 。
        System.out.println(randomizedSet.insert(2)); // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
        System.out.println(randomizedSet.getRandom()); // getRandom 应随机返回 1 或 2 。
        System.out.println(randomizedSet.remove(1)); // 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
        System.out.println(randomizedSet.insert(2)); // 2 已在集合中，所以返回 false 。
        System.out.println(randomizedSet.getRandom()); // 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
    }
}