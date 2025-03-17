import java.util.*;

public class Main {

    static int n,w,L;
    static Queue<Integer> q;
    static Queue<Integer> road;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        w=sc.nextInt();
        L=sc.nextInt();
        q = new LinkedList<>();
        road = new LinkedList<>();
        for(int i=0;i<n;i++){
            q.add(sc.nextInt());
        }
        for(int i=0;i<w;i++){
            road.add(0);
        }

        int time = 0;
        int weightOnBridge = 0;
        while (!road.isEmpty()) {
            time++;
            weightOnBridge -= road.poll();
            
            if(q.isEmpty()) {
                continue;
            }
            
            if (q.peek() + weightOnBridge <= L) {
                int cur = q.poll();
                weightOnBridge += cur;
                road.add(cur);
            }else {
                road.add(0);
            }
        }

        System.out.println(time);

    }

    }
