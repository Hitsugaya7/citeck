package com.task_two;

import java.util.Stack;

public class TaskTwo {

    private final static String openBrackets = "([";
    private final static String closeBrackets = ")]";


    public static Boolean checkExpression(String expression) throws Exception {
        if (expression == null || expression.isEmpty()) {
            throw new Exception("expression parameter is null or empty");
        }
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if (openBrackets.indexOf(symbol) != -1) {
                stack.push(symbol);
            } else if (closeBrackets.indexOf(symbol) != -1) {
                int indexOfCloseBracketsSymbol = closeBrackets.indexOf(symbol);
                if (!stack.empty() && stack.peek() == openBrackets.charAt(indexOfCloseBracketsSymbol)) {
                    stack.pop();
                } else
                    return false;
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}
