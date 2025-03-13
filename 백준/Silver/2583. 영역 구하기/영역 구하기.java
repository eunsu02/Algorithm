import java.util.*;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int M, N, K;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int cnt;

    static List<Integer> result;

    public static void main(String[] args) {
        result = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt();
        arr = new int[M][N];
        visited = new boolean[M][N];


        for (int i = 0; i < K; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    arr[y][x] = 1;
                }
            }
        }

        for (int y = 0; y < M; y++) {
            for (int x = 0; x < N; x++) {
                if (arr[y][x] == 0 && !visited[y][x]) {
                    cnt = 1;
                    dfs(y, x);
                    result.add(cnt);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1) {
                System.out.print(result.get(i));
            } else {
                System.out.print(result.get(i) + " ");
            }
        }
    }

    public static void dfs(int y, int x) {
        visited[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < M && !visited[ny][nx] && arr[ny][nx] == 0) {
                cnt++;
                dfs(ny, nx);
            }
        }
    }
}
