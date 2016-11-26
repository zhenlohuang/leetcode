package com.leetcode;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
 */
public class KthSmallestElement {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Tuple> heap = new PriorityQueue<>();
        heap.add(new Tuple(0, 0, matrix[0][0]));

        boolean[][] accessed = new boolean[matrix.length][matrix.length];
        Tuple t = null;
        for(int i = 0; i < k; i++) {
            t = heap.poll();
            if (t.getX() + 1 < matrix.length && !accessed[t.getX() + 1][t.getY()]) {
                accessed[t.getX() + 1][t.getY()] = true;
                heap.add(new Tuple(t.getX() + 1, t.getY(), matrix[t.getX() + 1][t.getY()]));
            }

            if (t.getY() + 1 < matrix.length && !accessed[t.getX()][t.getY() + 1]) {
                accessed[t.getX()][t.getY() + 1] = true;
                heap.add(new Tuple(t.getX(), t.getY() + 1, matrix[t.getX()][t.getY() + 1]));
            }
        }
        return t.getValue();
    }

    class Tuple implements Comparable {
        private final int x;
        private final int y;
        private final int value;

        public Tuple(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getValue() {
            return value;
        }

        @Override
        public int compareTo(Object o) {
            return value - ((Tuple)o).getValue();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,  5,  9}, {10, 11, 13}, {12, 13, 15}};
        System.out.println(new KthSmallestElement().kthSmallest(matrix, 8));
        System.out.println(new KthSmallestElement().kthSmallest(matrix, 1));
        System.out.println(new KthSmallestElement().kthSmallest(matrix, 9));
    }
}
