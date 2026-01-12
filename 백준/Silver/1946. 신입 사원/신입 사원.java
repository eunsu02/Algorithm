import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            List<int[]> list;
            list = new ArrayList<>();
            int N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                list.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
            }
            list.sort(Comparator.comparingInt(o -> o[0]));
            int count =1;
            int min = list.get(0)[1];
            for(int k=1; k<list.size();k++){
                if(min>list.get(k)[1]){
                    min = list.get(k)[1];
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
