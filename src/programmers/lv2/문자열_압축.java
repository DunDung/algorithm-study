package programmers.lv2;

import java.util.Stack;

// 2020.10.20
public class 문자열_압축 {

    public static void main(String[] args) {
        // System.out.println(compress("aabbaccc", 1));
        System.out.println(solution("ababcdcdababcdcd"));
    }

    public static int solution(String s) {
        int minResult = Integer.MAX_VALUE;
        int maxSize = s.length() / 2;

        while (maxSize >= 1) {
            minResult = Math.min(minResult, compress(s, maxSize));
            maxSize--;
        }
        return minResult;
    }

    public static int compress(String s, int size) {
        int index = 0;
        int length = s.length();
        int result = 0;
        int count = 0;
        Stack<String> stack = new Stack<>();
        while (index + size <= length) {
            String key = s.substring(index, index + size);
            index += size;
            if (stack.isEmpty()) {
                stack.push(key);
                result += key.length();
                continue;
            }
            if (!stack.peek().equals(key)) {
                result += stack.pop().length();
                if (count > 1) {
                    result++;
                    count = 0;
                }
            } else {
                count++;
            }
        }
        if (!stack.isEmpty()) {
            result += stack.pop().length() + 1;
        }
        return result + s.length() % size;
    }
}
