import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());

        long now = 0;
        int answer = 0;

        for (int i = 1; ; i++) {
            now += i;
            if (now > S) break;
            answer++;
        }

        System.out.println(answer);
    }
}
