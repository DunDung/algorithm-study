package baekjoon.math;

import java.util.Scanner;

// 24
// 2021.03.14
public class Q1408 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String 첫번째입력 = scanner.nextLine();
        String 두번째입력 = scanner.nextLine();

        String[] 현재시간저장 = 첫번째입력.split(":");
        String[] 임무시작시간저장 = 두번째입력.split(":");
        String[] 정답저장 = new String[3];

        boolean 뺄셈시앞의수를빌려왔는지여부 = false;
        for (int i = 2; i >= 0; i--) {
            int 현재시간 = Integer.parseInt(현재시간저장[i]);
            int 임무시작시간 = Integer.parseInt(임무시작시간저장[i]);
            if (뺄셈시앞의수를빌려왔는지여부) {
                임무시작시간--;
            }
            if (임무시작시간 < 현재시간) {
                if (i == 0) { // hour인 경우
                    임무시작시간 += 24;
                } else {
                    임무시작시간 += 60;
                }
                뺄셈시앞의수를빌려왔는지여부 = true;
            } else {
                뺄셈시앞의수를빌려왔는지여부 = false;
            }
            int result = 임무시작시간 - 현재시간;
            if (result < 10) {
                정답저장[i] = "0" + result;
            } else {
                정답저장[i] = String.valueOf(result);
            }
        }
        System.out.println(정답저장[0] + ":" + 정답저장[1] + ":" + 정답저장[2]);
    }
}