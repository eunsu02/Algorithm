import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] input = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            int leftCount = input[i];
            int count = 0;

            for (int j = 0; j < N; j++) {
                if (result[j] == 0) {
                    if (count == leftCount) {
                        result[j] = i + 1;
                        break;
                    }
                    count++;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int val : result) {
            sb.append(val).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}