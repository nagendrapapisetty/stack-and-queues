package com.bridgelabz;

import java.util.Stack;

public class StackAndQueues {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();

        }
    }
}

