package bc_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(solution2(new String[]{"봄", "가나", "봄봄"}));
    }

    public static boolean solution2(String[] name_list) {
        Arrays.sort(name_list, (x, y) -> x.length() - y.length());
        System.out.println(Arrays.toString(name_list));
        List<String> names = new ArrayList<>();
        for (String name : name_list) {
            boolean isDuplicated = false;
            for (String k : names) {
                int index = name.indexOf(k);
                if (index >= 0) {
                    isDuplicated = true;
                }
            }
            if (!isDuplicated) {
                names.add(name);
            }
        }
        return names.size() != name_list.length;
    }
}

