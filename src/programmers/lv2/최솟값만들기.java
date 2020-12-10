package programmers.lv2;

import java.util.Arrays;

// 2020.12.10
public class 최솟값만들기 {
    public int solution(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int lastIndex = b.length - 1;
        int answer = 0;
        for (int k : a) {
            answer += k * b[lastIndex--];
        }
        return answer;
    }
}
