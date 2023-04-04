package com.youjia.web.controller.algorithm.string;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className RecentCounter
 * @date 2023/3/28 14:40
 */

class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }

}


/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */