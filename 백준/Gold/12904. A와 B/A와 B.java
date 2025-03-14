import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static StringBuilder makeSb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb.append(sc.next());
        makeSb.append(sc.next());
        while(makeSb.length()>=sb.length()) {

            if( makeSb.toString().equals(sb.toString())) {
                System.out.println(1);
                return ;

            }

            if( makeSb.charAt(makeSb.length()-1) == 'A') {
                makeSb.deleteCharAt(makeSb.length()-1);
            } else if(makeSb.charAt(makeSb.length()-1) == 'B' ) {
                makeSb.deleteCharAt(makeSb.length()-1);
                makeSb.reverse();
            }

        }


        System.out.println(0);

    }
}
