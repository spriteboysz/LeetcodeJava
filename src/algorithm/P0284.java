package algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-26 23:48
 * LastEditTime: 2022-07-26 23:48
 * Description: 284. 顶端迭代器
 */

public class P0284 {
    // code beginning
    class PeekingIterator implements Iterator<Integer> {
        private final Iterator<Integer> iterator;
        private Integer next;

        public PeekingIterator(Iterator<Integer> iterator) {
            this.iterator = iterator;
            if (this.iterator.hasNext()) next = this.iterator.next();
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return next;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer ans = next;
            next = iterator.hasNext() ? iterator.next() : null;
            return ans;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        PeekingIterator peekingIterator = new P0284().new PeekingIterator(list.iterator());
        System.out.println(peekingIterator.next());    // 返回 1 ，指针移动到下一个元素 [1,2,3]
        System.out.println(peekingIterator.peek());    // 返回 2 ，指针未发生移动 [1,2,3]
        System.out.println(peekingIterator.next());    // 返回 2 ，指针移动到下一个元素 [1,2,3]
        System.out.println(peekingIterator.next());    // 返回 3 ，指针移动到下一个元素 [1,2,3]
        System.out.println(peekingIterator.hasNext()); // 返回 False
    }
}