package programmers.lv2;

import java.util.Stack;

public class 짝지어제거하기 {

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
                continue;
            }
            stack.push(c);
        }

        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }
}

