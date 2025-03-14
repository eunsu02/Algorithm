import java.util.*;

public class Main {
    static int N,K;
    static int cnt=0;
    static Integer[] coin;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        coin= new Integer[N];
        for(int i=0;i<N;i++){
            coin[i]=sc.nextInt();
        }
        Arrays.sort(coin,Collections.reverseOrder());
        for(int i=0;i<N;i++){
            if(coin[i]<=K){
                cnt+=K/coin[i];
                K=K%coin[i];
            }
            if(K==0){
                break;
            }
        }
        System.out.println(cnt);
    }
}
