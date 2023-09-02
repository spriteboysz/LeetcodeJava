package leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-07-23 23:47
 * LastEditTime: 2022-07-23 23:47
 * Description: 705. 设计哈希集合
 */

public class P0705 {
    // code beginning
    class MyHashSet {
        Set<Integer> set;

        public MyHashSet() {
            set = new HashSet<>();
        }

        public void add(int key) {
            set.add(key);
        }

        public void remove(int key) {
            set.remove(key);
        }

        public boolean contains(int key) {
            return set.contains(key);
        }
    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new P0705().new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        System.out.println(myHashSet.contains(1)); // 返回 True
        System.out.println(myHashSet.contains(3)); // 返回 False ，（未找到）
        myHashSet.add(2);      // set = [1, 2]
        System.out.println(myHashSet.contains(2)); // 返回 True
        myHashSet.remove(2);   // set = [1]
        System.out.println(myHashSet.contains(2)); // 返回 False ，（已移除）
    }
}