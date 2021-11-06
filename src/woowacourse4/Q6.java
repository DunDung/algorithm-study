package woowacourse4;

public class Q6 {

    public static void main(String[] args) {
        System.out.println(solution(3.5, new String[][]{ {"홍콩", "11PM", "9AM"}, {"엘에이", "3PM", "2PM"} }));
    }

    public static String solution(double time, String[][] plans) {
        String answer = "";
        for (String[] plan : plans) {
            if (time < 0.0) {
                return answer;
            }
            String country = plan[0];
            String start = plan[1];
            String end = plan[2];

            int startTime = calculate24(start, start.indexOf("PM"), start.indexOf("AM"));
            int endTime = calculate24(end, end.indexOf("PM"), end.indexOf("AM"));

            if (startTime < 18) {
                time -= (18 - startTime);
            }
            if (endTime > 13) {
                time -= (endTime - 13);
            }
            if (time >= 0.0) {
                answer = country;
            }
        }
        return answer;
    }

    private static int calculate24(String time, int pmIndex, int amIndex) {
        if (pmIndex >= 0) {
            return Integer.parseInt(time.substring(0, pmIndex)) + 12;
        }
        return Integer.parseInt(time.substring(0, amIndex));
    }

}
