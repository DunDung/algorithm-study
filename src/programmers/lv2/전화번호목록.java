package programmers.lv2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class 전화번호목록 {
    public boolean solution(String[] phoneBook) {
        Set<String> hash = new HashSet<>();
        Arrays.sort(phoneBook, Comparator.comparingInt(String::length));
        for (String phoneNumber : phoneBook) {
            for (int i = 0; i < phoneNumber.length() - 1; i++) {
                String sub = phoneNumber.substring(0, i + 1);
                if (hash.contains(sub)) {
                    return false;
                }
            }
            hash.add(phoneNumber);
        }
        return true;
    }
}
