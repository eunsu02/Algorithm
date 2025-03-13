import java.util.*;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static List<Integer> result;
    static Integer N,cnt;
    static Integer max=0;
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,-1,1};

    public static void main(String[] args) {
        cnt =0;
        result= new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        arr= new int[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]>max){max=arr[i][j];}
            }
        }

        for(int i=0;i<=max;i++){
            visited= new boolean[N][N];
            cnt=0;
            for(int x=0;x<N;x++){
                for(int y=0;y<N;y++){
                    if(!visited[x][y] && arr[x][y]>i){
                        dfs(x,y,i,visited);
                        cnt++;
                    }
                }
            }
            result.add(cnt);
        }
        int maxResult = Collections.max(result);
        System.out.println(maxResult);
    }
    private static void dfs(int x, int y, int limit, boolean[][] visited){
        visited[x][y]= true;
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0&&ny>=0&&nx<N&&ny<N&&!visited[nx][ny]&&arr[nx][ny]>limit){
                visited[nx][ny]=true;
                dfs(nx,ny,limit, visited);
            }
        }
    }
}
