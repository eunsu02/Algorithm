import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int answer = 0;
        ArrayList<Integer> tall = new ArrayList<>();
        ArrayList<Integer> subTall = new ArrayList<>();

        for(int i = 0; i<N; i++){
            tall.add(sc.nextInt());
        }

        for(int i = 0; i < N-1; i++){
            subTall.add(tall.get(i+1) - tall.get(i));
        }

        Collections.sort(subTall);

        for(int i = 0; i < N-K; i++){
            answer += subTall.get(i);
        }
        System.out.println(answer);
    }
}