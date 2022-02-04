package programmers.lv1;

import java.util.*;

public class 신고결과받기 {

    public static void main(String[] args) {
        String[] a = {"muzi", "frodo", "apeach", "neo"};
        String[] b = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int[] solution = solution(a, b, 2);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        Set<String> reports = new HashSet<>(Arrays.asList(report));
        List<String> ids = new ArrayList<>(Arrays.asList(id_list));
        Map<String, List<String>> map = new HashMap<>();
        Set<String> targets = new HashSet<>();
        for (String id : id_list) {
            map.put(id, new ArrayList<>());
        }
        int[] counts = new int[id_list.length];
        int[] answer = new int[id_list.length];
        for (String s : reports) {
            String[] split = s.split(" ");
            List<String> strings = map.get(split[0]);
            strings.add(split[1]);
            map.put(split[0], strings);
            int index = ids.indexOf(split[1]);
            counts[index]++;
            if (counts[index] >= k) {
                targets.add(id_list[index]);
            }

        }
        Map<String, Integer> answer2 = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> value = entry.getValue();
            int count = 0;
            for (String s : value) {
                if (targets.contains(s)) {
                    count++;
                }
            }
            answer2.put(entry.getKey(), count);
        }

        for (Map.Entry<String, Integer> entry : answer2.entrySet()) {
            int index = ids.indexOf(entry.getKey());
            answer[index] = entry.getValue();
        }

        return answer;
    }
}
