package org.katas;

import java.util.Arrays;
import java.util.LinkedList;

public class PolishNotation {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

//    This solution pass all tests cases on leetcode, but has poor runtime
    class Solution {
        public int evalRPN(String[] tokens) {
            LinkedList<String> startList = new LinkedList(Arrays.asList(tokens));
            LinkedList<Integer> helperList = new LinkedList();

            // L: while (startList.size() > 0) {
            int a = 0;
            int b = 0;
            for (int i = 0; i < startList.size(); i++) {
                if (!startList.get(i).equals("+") &&
                        !startList.get(i).equals("-") &&
                        !startList.get(i).equals("/") &&
                        !startList.get(i).equals("*")) {
                    helperList.add(Integer.valueOf(startList.get(i)));
                    // startList.remove(i);
                    // continue;
                }
                if (startList.get(i).equals("+")) {
                    // startList.remove(i);
                    b = helperList.pollLast();
                    a = helperList.pollLast();
                    helperList.add(a + b);
                    // continue;
                }
                if (startList.get(i).equals("-")) {
                    // startList.remove(i);
                    b = helperList.pollLast();
                    a = helperList.pollLast();
                    helperList.add(a - b);
                    // continue;
                }
                if (startList.get(i).equals("/")) {
                    // startList.remove(i);
                    b = helperList.pollLast();
                    a = helperList.pollLast();
                    helperList.add(a / b);
                    // continue;
                }
                if (startList.get(i).equals("*")) {
                    // startList.remove(i);
                    b = helperList.pollLast();
                    a = helperList.pollLast();
                    helperList.add(a * b);
                    // continue;
                }

            }

            return helperList.peek();
        }
    }
}