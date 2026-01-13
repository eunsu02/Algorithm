import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int packageMin = Integer.MAX_VALUE;
        int singleMin = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int pack = Integer.parseInt(st.nextToken());
            int single = Integer.parseInt(st.nextToken());

            packageMin = Math.min(packageMin, pack);
            singleMin = Math.min(singleMin, single);
        }

        int case1 = N * singleMin;
        int case2 = ((N + 5) / 6) * packageMin;
        int case3 = (N / 6) * packageMin + (N % 6) * singleMin;

        int answer = Math.min(case1, Math.min(case2, case3));
        System.out.println(answer);
    }
}
