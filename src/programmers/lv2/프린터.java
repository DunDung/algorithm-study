package programmers.lv2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 프린터 {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> order = new ArrayList<>();
        for (int priority : priorities) {
            queue.add(priority);
            order.add(priority);
        }
        Collections.sort(order, Comparator.reverseOrder());
        int answer = 0;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            int most = order.get(0);
            if (now != most) {
                queue.add(now);
                if (location == 0) {
                    location = queue.size() - 1;
                    continue;
                }
            } else {
                answer++;
                if (location == 0) {
                    break;
                }
                order.remove(0);
            }
            location--;
        }
        return answer;
    }
}
