package programmers.lv2;

// 2020.10.20
public class 문자열압축 {

    public static void main(String[] args) {
        System.out.println(solution("aaaaaaaaaaaaaaaa"));
    }

    public static int solution(String s) {
        int minResult = Integer.MAX_VALUE;
        int maxSize = s.length() / 2 + 1;

        while (maxSize >= 1) {
            minResult = Math.min(minResult, compress(s, maxSize));
            maxSize--;
        }
        return minResult;
    }

    public static int compress(String s, int size) {
        int index = 0;
        int length = s.length();
        int result = length;
        int count = 1;
        String before = "";
        while (index + size <= length) {
            String key = s.substring(index, index + size);
            index += size;
            if (before == null) {
                before = key;
                continue;
            }
            if (before.equals(key)) {
                count++;
                result -= size;
            } else {
                before = key;
                if (count > 1) {
                    result += String.valueOf(count).length();
                    count = 1;
                }
            }
        }
        if (count > 1) {
            result += String.valueOf(count).length();
        }
        return result;
    }
}
