package woowacourse3;

import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"A+", "D+", "F", "C0"}, new int[]{2, 5, 10, 3}, 50));
        System.out.println(solution(new String[]{"B+", "A0", "C+"}, new int[]{6, 7, 8}, 200));
    }

    public static int solution(String[] grades, int[] weights, int threshold) {
        Map<String, Integer> gradeWeights = new HashMap<>();
        gradeWeights.put("A+", 10);
        gradeWeights.put("A0", 9);
        gradeWeights.put("B+", 8);
        gradeWeights.put("B0", 7);
        gradeWeights.put("C+", 6);
        gradeWeights.put("C0", 5);
        gradeWeights.put("D+", 4);
        gradeWeights.put("D0", 3);
        gradeWeights.put("F", 0);
        int answer = 0;
        for (int i = 0; i < grades.length; i++) {
            int gradeWeight = gradeWeights.get(grades[i]);
            answer += gradeWeight * weights[i];
        }
        return threshold - answer;
    }
}
