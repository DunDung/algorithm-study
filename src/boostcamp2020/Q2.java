package boostcamp2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 부스트캠프 2020 1차 코테 문제 2번
// 2020. 07. 04
public class Q2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution3(new int[]{3}, new int[]{1,0,1,1,0})));
    }

    public static int[] solution3(int[] arrayA, int[] arrayB) {
        int[] answer = new int[5];
        List<Integer> sum = new ArrayList<>();
        List<Integer> a = add(arrayA, sum);
        List<Integer> b = add(arrayB, sum);
        answer[0] = a.size();
        answer[1] = b.size();
        answer[2] = sum.size();
        for (int k : a) {
            if (!b.contains(k)) {
                answer[3]++;
            } else {
                answer[4]++;
            }
        }
        return answer;
    }

    public static List<Integer> add(int[] arr, List<Integer> sum) {
        List<Integer> list = new ArrayList<>();
        for (int k : arr) {
            if (!list.contains(k)) {
                list.add(k);
            }
            if (!sum.contains(k)) {
                sum.add(k);
            }
        }
        return list;
    }
}
