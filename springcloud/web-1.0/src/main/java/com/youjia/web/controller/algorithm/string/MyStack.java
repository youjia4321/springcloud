package com.youjia.web.controller.algorithm.string;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className MyStack
 * @date 2023/3/28 11:24
 */
class MyStack {

    private Queue<Integer> in; // 输入队列
    private Queue<Integer> out; // 输出队列

    public MyStack() {
        in = new LinkedList<>();
        out = new LinkedList<>();
    }

    public void push(int x) {
        in.offer(x);
        // 将 out 队列中元素全部转给 in 队列
        while (!out.isEmpty()) {
            in.offer(out.poll());
        }
        // 交换in和out,使得in队列没有在push()的时候始终为空队列
        Queue<Integer> temp = in;
        in = out;
        out = temp;
    }

    public int pop() {
        return out.poll();
    }

    public int top() {
        return out.peek();
    }

    public boolean empty() {
        return out.isEmpty();
    }


    public static void main(String[] args) {

        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);



    }

}
