package programmers.lv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 2020.10.30
public class 기능개발 {

    public static void main(String[] args) {
        solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int length = progresses.length;
        Queue<Integer> days = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            int leftProgress = 100 - progresses[i];
            int expectDay = leftProgress / speeds[i];
            if (leftProgress % speeds[i] != 0) {
                expectDay++;
            }
            days.add(expectDay);
        }
        List<Integer> counts = new ArrayList<>();
        while (!days.isEmpty()) {
            int day = days.poll();
            int count = 1;
            while (!days.isEmpty() && day >= days.peek()) {
                count++;
                days.poll();
            }
            counts.add(count);
        }
        int[] answer = new int[counts.size()];
        for (int i = 0; i < counts.size(); i++) {
            answer[i] = counts.get(i);
        }
        return answer;
    }
}
