package bc_2020;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

    public static void main(String[] args) {

    }

    public int[] solution3(int[] arrayA, int[] arrayB) {
        int[] answer = new int[5];
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        add(arrayA, a, sum);
        add(arrayB, b, sum);
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

    public void add(int[] arr, List<Integer> aOrB, List<Integer> sum) {
        for (int k : arr) {
            if (!aOrB.contains(k)) {
                aOrB.add(k);
            }
            if (!sum.contains(k)) {
                sum.add(k);
            }
        }
    }
}
