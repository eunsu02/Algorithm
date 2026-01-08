import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max=0;

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> m = new ArrayList();


        for(int i=0;i<N;i++){
            m.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(m,Collections.reverseOrder());

        for(int i=0;i<N;i++){
            max = Math.max(max, m.get(i) * (i+1));

        }


        bw.write(max+"\n");
        bw.flush();
        bw.close();
    }
}