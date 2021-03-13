package baekjoon.math;

import java.util.Scanner;

// 일반 화학 실험
// 2021. 03. 13
public class Q4766 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double 저장해놓은수 = scanner.nextDouble();
        while (true) {
            double 새로입력받은수 = scanner.nextDouble();
            if (새로입력받은수 == 999) {
                break;
            }
            double 결과 = 새로입력받은수 - 저장해놓은수;
            System.out.printf("%.2f\n", 결과);
            저장해놓은수 = 새로입력받은수;
        }
    }
}
