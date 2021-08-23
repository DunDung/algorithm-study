package baekjoon;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodeUp1430 {
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(scanner.nextInt(), 1);
        }

        int M = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int 질문입력 = scanner.nextInt();
            if (map.get(질문입력) != null) {
                stringBuilder.append(1);
            } else {
                stringBuilder.append(0);
            }
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);
    }

    private void solution(Node node, int sum) {
        if (node.left == null && node.right == null) {
            int min = Math.min(sum, CodeUp1430.min);
        }
    }

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
