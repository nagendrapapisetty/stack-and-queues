package com.bridgelabz;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueues {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(56);
        queue.add(30);
        queue.add(70);
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();

        }
    }
}


