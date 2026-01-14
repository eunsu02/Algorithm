import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int answer=-1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int temp =n;
        for(int i=n/5;i>=0;i--) {
            temp = n;
            temp -= (5 * i);
            if (temp % 2 == 0) {
                answer = i + (temp / 2);
                break;
            }
        }
        if(answer!=-1){
            System.out.println(answer);
        }else{
            System.out.println(-1);
        }
    }
}
