import java.util.*;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int M,N,cnt;
    static int[] dx={-1,1,0,0,1,1,-1,-1};
    static int[] dy={0,0,-1,1,1,-1,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        M=sc.nextInt();
        N=sc.nextInt();
        arr= new int[M][N];
        visited= new boolean[M][N];

        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(!visited[i][j]&&arr[i][j]==1){
                    dfs(i,j);
                    cnt++;
                }

            }
        }
        System.out.println(cnt);
    }
    public static void dfs(int x, int y){
        visited[x][y]= true;
        for(int i=0;i<8;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0&&ny>=0&&nx<M&&ny<N&&!visited[nx][ny]&&arr[nx][ny]==1){
                visited[nx][ny]=true;
                dfs(nx,ny);
            }
        }

    }
}
