import java.util.*;

public class Main {
    final static int Red = 0;
    final static int Green =1;
    final static int Blue = 2;

    static int[][] Cost;
    static int[][] DP;

    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();

        Cost= new int[N][3];
        DP= new int[N][3];

        for(int i=0;i<N;i++){
            Cost[i][Red]=sc.nextInt();
            Cost[i][Green]=sc.nextInt();
            Cost[i][Blue]=sc.nextInt();
        }
        DP[0][Red]=Cost[0][Red];
        DP[0][Green]=Cost[0][Green];
        DP[0][Blue]=Cost[0][Blue];

        System.out.println(Math.min(Paint(N-1,Red),Math.min(Paint(N-1,Green),Paint(N-1,Blue))));
    }

    static int Paint(int N,int color){
        if(DP[N][color] ==0){
            if(color == Red){
                DP[N][Red] = Math.min(Paint(N - 1, Green), Paint(N - 1, Blue)) + Cost[N][Red];
            }
            else if(color == Green){
                DP[N][Green] = Math.min(Paint(N - 1, Red), Paint(N - 1, Blue)) + Cost[N][Green];

            }
            else{
                DP[N][Blue] = Math.min(Paint(N - 1, Green), Paint(N - 1, Red)) + Cost[N][Blue];
            }
        }
        return DP[N][color];
    }
}