package boostcamp2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 부스트캠프 2020 1차 코테 문제 1번
// 2020. 07. 04
public class Q1 {
    public static void main(String[] args) {
        System.out.println(solution2(new String[]{"봄가을겨울", "여울", "봄겨"}));
    }

    public static boolean solution2(String[] name_list) {
        Arrays.sort(name_list, (x, y) -> x.length() - y.length());
        List<String> names = new ArrayList<>();
        for (String name : name_list) {
            for (String k : names) {
                if (name.indexOf(k) >= 0) {
                    return true;
                }
            }
            names.add(name);
        }
        return false;
    }
}

