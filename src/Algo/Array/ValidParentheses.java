package Algo.Array;

import java.util.Stack;

public class ValidParentheses {
    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {
        String string = "{[()]}{}()";
        System.out.println(isValid(string));

    }

    private static boolean isValid(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '{' || string.charAt(i) == '[' || string.charAt(i) == '(') {
                stack.push(string.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char temp = string.charAt(i);
                char popChar = stack.pop();
                if ((temp == '}' && popChar != '{') || (temp == ']' && popChar != '[')
                        || (temp == ')' && popChar != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
