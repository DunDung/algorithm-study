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
                stringBuilder.append(stack.isEmpty() ? -1 : stack.pop());
                stringBuilder.append("\n");
            } else if (input.equals("size")) {
                stringBuilder.append(stack.size());
                stringBuilder.append("\n");
            } else if (input.equals("empty")) {
                stringBuilder.append(stack.isEmpty() ? 1 : 0);
                stringBuilder.append("\n");
            } else if (input.equals("top")) {
                stringBuilder.append(stack.isEmpty() ? -1 : stack.peek());
                stringBuilder.append("\n");
            }
        }
        System.out.print(stringBuilder);
    }
}
