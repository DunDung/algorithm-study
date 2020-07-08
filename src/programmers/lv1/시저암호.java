package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

// 시저암호
// 2020. 07. 08
public class 시저암호 {

    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
    }

    public static String solution(String s, int n) {
        StringBuilder builder = new StringBuilder();
        List<Character> a = new ArrayList<>();
        List<Character> b = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            a.add((char)i);
            b.add((char)Character.toUpperCase(i));
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                builder.append(' ');
            } else if (c >= 'a' && c <= 'z') {
                c -= 'a';
                c += n;
                builder.append(a.get(c % a.size()));
            } else {
                c -= 'A';
                c += n;
                builder.append(b.get(c % b.size()));
            }
        }
        return builder.toString();
    }
}