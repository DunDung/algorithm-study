package programmers.lv2;

import java.util.Arrays;

// 2020.11.20
public class 주식가격 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3, 3, 1})));
    }

    public static int[] solution(int[] prices) {
        int size = prices.length;
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (prices[i] <= prices[j]) {
                    answer[i]++;
                } else {
                    answer[i]++;
                    break;
                }
            }
        }
        return answer;
    }
}
