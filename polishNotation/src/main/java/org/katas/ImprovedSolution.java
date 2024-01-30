package org.katas;

import java.util.ArrayDeque;

public class ImprovedSolution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> queue = new ArrayDeque();

        for (int i = 0; i < tokens.length; i++) {
            switch(tokens[i]) {
                case "+" -> queue.add(queue.pollLast() + queue.pollLast());
                case "*" -> queue.add(queue.pollLast() * queue.pollLast());
                case "/" -> {
                    int b = queue.pollLast();
                    int a = queue.pollLast();
                    queue.add(a/b);}
                case "-" -> {
                    int b = queue.pollLast();
                    int a = queue.pollLast();
                    queue.add(a-b);}
                default -> queue.add(Integer.valueOf(tokens[i]));
            }
        }
        return queue.peek();
    }
}
