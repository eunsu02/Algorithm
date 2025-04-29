import java.util.*;

public class Main {
    static int N,m;
    static int[] d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        d= new int[11];

        d[0]=0;
        d[1]=1;
        d[2]=2;
        d[3]=4;
        for(int i=0;i<N;i++){
            m=sc.nextInt();
            for(int j=4;j<=m;j++){
                d[j]=d[j-1]+d[j-2]+d[j-3];
            }
            System.out.println(d[m]);
        }
    }
}