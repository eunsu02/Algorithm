import java.util.*;

public class Main {
    static int N;
    static int[] arr;
    static List<Integer> result;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        result= new LinkedList<>();
        N=sc.nextInt();
        arr= new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<N;i++){
            if(sum+1<arr[i]){
                break;
            }
            sum=sum+arr[i];
        }
        System.out.println(sum+1);
    }
}
