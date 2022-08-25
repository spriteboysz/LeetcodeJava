package leetcode.editor.cn.interview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Deean
 * Date: 2022-08-25 23:25
 * FileName: src/leetcode/editor/cn/interview
 * Description: 面试题 03.06. 动物收容所
 */

public class M00030006 {
    // code beginning
    class AnimalShelf {
        Queue<int[]> dogs, cats;

        public AnimalShelf() {
            dogs = new LinkedList<>();
            cats = new LinkedList<>();
        }

        public void enqueue(int[] animal) {
            if (animal[1] == 0) {
                cats.add(animal);
            } else {
                dogs.add(animal);
            }
        }

        public int[] dequeueAny() {
            if (dogs.isEmpty() && cats.isEmpty()) {
                return new int[]{-1, -1};
            } else if (dogs.isEmpty()) {
                return cats.poll();
            } else if (cats.isEmpty()) {
                return dogs.poll();
            } else if (dogs.peek()[0] < cats.peek()[0]) {
                return dogs.poll();
            } else {
                return cats.poll();
            }
        }

        public int[] dequeueDog() {
            if (dogs.isEmpty()) return new int[]{-1, -1};
            return dogs.poll();
        }

        public int[] dequeueCat() {
            if (cats.isEmpty()) return new int[]{-1, -1};
            return cats.poll();
        }
    }

    public static void main(String[] args) {
        AnimalShelf animalShelf = new M00030006().new AnimalShelf();
        animalShelf.enqueue(new int[]{0, 0});
        animalShelf.enqueue(new int[]{1, 0});
        animalShelf.enqueue(new int[]{2, 1});
        System.out.println(Arrays.toString(animalShelf.dequeueDog()));
        System.out.println(Arrays.toString(animalShelf.dequeueCat()));
        System.out.println(Arrays.toString(animalShelf.dequeueAny()));
    }
}