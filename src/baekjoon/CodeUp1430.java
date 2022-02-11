package baekjoon;

import java.util.Scanner;

public class CodeUp1430 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String str = scan.nextLine();
            String[] splits = str.split(" ");
            for (String split : splits) {
                StringBuilder temp = new StringBuilder(split);
                answer.append(temp.reverse() + " ");
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
