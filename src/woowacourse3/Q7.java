package woowacourse3;

public class Q7 {
    public static void main(String[] args) {
        solution(4, true);
    }

    public static int[][] solution(int n, boolean horizontal) {
        int[][] answer = new int[n][n];
        int size = n - 1;
        int time = 0;
        int x = 0;
        int y = 0;
        int[] tx;
        int[] ty;
        if (horizontal) {
            tx = new int[]{1, -1};
            ty = new int[]{-1, 1};
            answer[x][++y] = ++time;
        } else {
            tx = new int[]{-1, 1};
            ty = new int[]{1, -1};
            answer[++x][y] = ++time;
        }
        while (!((x == size) && (y == size))) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(answer[i][j] + " ");
                }
                System.out.println();
            }
            if (x + 1 <= size && y - 1 >= 0 && answer[x + 1][y - 1] == 0) {
                x++;
                y--;
                time += 2;
                answer[x][y] = time;
            } else if (x - 1 >= 0 && y + 1 <= size && answer[x - 1][y + 1] == 0) {
                x--;
                y++;
                time += 2;
                answer[x][y] = time;
            } else if (x + 1 <= size) {
                x++;
                answer[x][y] = ++time;
            }
            if (y + 1 <= size) {
                y++;
                answer[x][y] = ++time;
            }
        }

        return answer;
    }
}
