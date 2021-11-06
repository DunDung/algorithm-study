package baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class Q10828 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int N = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String input = scanner.next();
            if (input.contains("push")) {
                int input2 = scanner.nextInt();
                stack.push(input2);
            } else if (input.equals("pop")) {
                append(stringBuilder, stack.isEmpty() ? -1 : stack.pop());
            } else if (input.equals("size")) {
                append(stringBuilder, stack.size());
            } else if (input.equals("empty")) {
                append(stringBuilder,stack.isEmpty() ? 1 : 0);
            } else if (input.equals("top")) {
                append(stringBuilder,stack.isEmpty() ? -1 : stack.peek());
            }
        }
        System.out.print(stringBuilder);
    }

    private static void append(StringBuilder stringBuilder, int result) {
        stringBuilder.append(result);
        stringBuilder.append(System.lineSeparator());
    }
}
